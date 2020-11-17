package com.example.neo4j;

import org.apache.ibatis.mapping.Environment;
import org.neo4j.ogm.session.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.transaction.Neo4jTransactionManager;


public class Config {
    
    @Bean
    public org.neo4j.ogm.config.Configuration getConfiguration(){
        org.neo4j.ogm.config.Configuration configuration = new org.neo4j.ogm.config.Configuration.Builder()
                .uri("http://localhost:7474").connectionPoolSize(100).credentials("neo4j", "root")
                .build();
        return configuration;
    }

    @Bean
    public SessionFactory sessionFactory(){
        return new SessionFactory(getConfiguration());
    }

    @Bean("neo4jTransaction")
    public Neo4jTransactionManager neo4jTransactionManager(SessionFactory sessionFactory){
        return new Neo4jTransactionManager(sessionFactory);
    }

}
