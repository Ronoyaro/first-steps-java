package com.ronoyaro.javacore.jdbc.test;

import com.ronoyaro.javacore.jdbc.conn.ConnectionFactory;
import com.ronoyaro.javacore.jdbc.dominio.Producer;
import com.ronoyaro.javacore.jdbc.repository.ProducerRepository;

public class ConnectionFactoryTest {
    public static void main(String[] args) {
        Producer producer = Producer.ProducerBuilder.aProducer()
                .name("NHK")
                .build();
        ProducerRepository.save(producer);
    }
}
