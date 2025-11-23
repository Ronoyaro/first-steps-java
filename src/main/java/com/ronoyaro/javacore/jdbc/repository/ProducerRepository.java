package com.ronoyaro.javacore.jdbc.repository;

import com.ronoyaro.javacore.jdbc.conn.ConnectionFactory;
import com.ronoyaro.javacore.jdbc.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class ProducerRepository {
    //Camada do repositorio que possui a interação direta com o banco
    public static void save(Producer producer) {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');".formatted(producer.getName());
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Inserted producer '{}' in the database, rows affected '{}'", producer.getName(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to insert producer '{}', error: '{}'", producer.getName(), e);
        }
    }

    public static void delete(Integer id) {
        String sql = "DELETE FROM `anime_store`.`producer` WHERE (`id` = '%d');".formatted(id);
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Removed producer '{}' in the database, rows affected '{}'", id, rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to delete producer '{}', error: '{}' ", id, e);
        }
    }

    public static void update(Producer producer) {
        String sql = "UPDATE `anime_store`.`producer` SET `name` = '%s' WHERE (`id` = '%d');".formatted(producer.getName(), producer.getId());
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Updated producer '{}' in the database, rows affected '{}'", producer.getId(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to update producer '{}', ", producer.getId(), e);
        }
    }

    public static List<Producer> findAll() {
        return findByName("");
    }

    public static List<Producer> preparedStatementFindAll() {
        return preparedStatementFindByName("");
    }

    public static List<Producer> preparedStatementFindByName(String name) {
        String sql = "SELECT * FROM anime_store.producer where name like ?;";
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);) {
            ps.setString(1, String.format("%%%s%%", name)); //SELECT * FROM anime_store.producer where name like %name%;
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Producer producer = Producer.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();
                producers.add(producer);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return producers;
    }


    public static List<Producer> findByName(String name) {
        String sql = "SELECT * FROM anime_store.producer where name like '%%%s%%';" //%anyHere% dessa forma eu consigo passar um valor para dentro
                .formatted(name);
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet result = stmt.executeQuery(sql)) {
            while (result.next()) {
                Producer producer = Producer.builder()
                        .id(result.getInt("id"))
                        .name(result.getString("name"))
                        .build();
                producers.add(producer);
            }

        } catch (SQLException e) {
            log.info("Error while trying to find all producers", e);
        }
        return producers;
    }


}
