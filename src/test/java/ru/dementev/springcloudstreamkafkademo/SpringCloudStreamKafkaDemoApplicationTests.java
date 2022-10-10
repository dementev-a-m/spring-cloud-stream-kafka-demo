package ru.dementev.springcloudstreamkafkademo;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.springframework.kafka.core.KafkaTemplate;

import java.util.List;

class SpringCloudStreamKafkaDemoApplicationTests {
    private KafkaTemplate<String, List<String>> kafkaTemplate;

    @SneakyThrows
    @Test
    void contextLoads() {
        byte[] b1 = {1, 2, 3};
        byte[] b2 = {1, 2, 3};
        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());
    }
    @Test
    void contextLoads1() {
        byte[] b1 = {1, 2, 3};
        byte[] b2 = {1, 2, 3};
        System.out.println(b2.hashCode());
        System.out.println(b1.hashCode());
    }

}


