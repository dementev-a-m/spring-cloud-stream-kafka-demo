package ru.dementev.springcloudstreamkafkademo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.dementev.springcloudstreamkafkademo.domain.Foo;

import java.util.function.Function;

@Configuration
public class KafkaConfig {
    @Bean
    public Function<Foo, String> uppercase() {
        return foo -> {
            System.out.println(foo.toString());
            return foo.toString();
        };

    }
}
