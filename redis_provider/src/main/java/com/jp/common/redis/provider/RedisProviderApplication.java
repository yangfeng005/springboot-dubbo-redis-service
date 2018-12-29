package com.jp.common.redis.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:conf/*.xml" })
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class RedisProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisProviderApplication.class, args);
    }

}

