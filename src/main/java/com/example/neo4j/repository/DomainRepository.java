package com.example.neo4j.repository;

import com.example.neo4j.model.Domain;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DomainRepository extends Neo4jRepository<Domain,Long> {
    Domain findByName(@Param("name") String name);
    @Query(" match(n) detach delete n ")
    void deleteAll();
}
