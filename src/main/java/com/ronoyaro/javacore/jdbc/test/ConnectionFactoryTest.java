package com.ronoyaro.javacore.jdbc.test;

import com.ronoyaro.javacore.jdbc.dominio.Producer;
import com.ronoyaro.javacore.jdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.util.List;
@Log4j2
public class ConnectionFactoryTest {
    public static void main(String[] args) {
        Producer producer1 = Producer.builder()
                .name("NHK")
                .build();
        Producer produceToUpdate = Producer.builder()
                .id(2)
                .name("Wit Studio")
                .build();

//      ProducerService.save(producer1);
//      ProducerService.delete(11);
//      ProducerService.update(produceToUpdate);




//        List<Producer> producerList = ProducerService.findAll();
//        log.info("Producers found: '{}'", producerList);
//
//        List<Producer> name = ProducerService.findByName("Wit");
//        log.info("Producer found: '{}'", name);

//        List<Producer> producers = ProducerService.preparedStatementFindByName("Wit");
        List<Producer> producers2 = ProducerService.preparedStatementFindAll();
//        log.info("Producer find '{}' ", producers);
        log.info("Producer find '{}' ", producers2);

    }
}
