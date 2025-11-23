package com.ronoyaro.javacore.jdbc.service;

import com.ronoyaro.javacore.jdbc.dominio.Producer;
import com.ronoyaro.javacore.jdbc.repository.ProducerRepository;

import java.util.List;

public class ProducerService {
    //Serve como uma camada entre a camada de  e o repositorio
    public static void save(Producer producer) {
        ProducerRepository.save(producer);
    }

    public static void delete(Integer id) {
        requiredValidId(id);
        ProducerRepository.delete(id);
    }

    public static void update(Producer producer) {
        requiredValidId(producer.getId());
        ProducerRepository.update(producer);
    }

    public static List<Producer> findAll() {
        return ProducerRepository.findAll();
    }

    public static List<Producer> preparedStatementFindByName(String name) {
        return ProducerRepository.preparedStatementFindByName(name);
    }

    public static List<Producer> preparedStatementFindAll() {
        return ProducerRepository.preparedStatementFindByName("");
    }

    public static List<Producer> findByName(String name) {
        return ProducerRepository.findByName(name);
    }

    private static void requiredValidId(Integer id) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("Invalid value for id");
        }
    }


}
