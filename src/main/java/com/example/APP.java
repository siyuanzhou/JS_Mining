package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@EnableNeo4jRepositories
@SpringBootApplication
@MapperScan("com.example.mapper")
public class APP {

    public static void main(String[] args) {
        SpringApplication.run(APP.class, args);
    }
}
