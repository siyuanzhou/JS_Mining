package com.example.neo4j.repository;

import com.example.neo4j.model.Field;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FieldRepository extends Neo4jRepository<Field, Long> {
    Field findByName(@Param("name") String name);
}
