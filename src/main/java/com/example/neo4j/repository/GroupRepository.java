package com.example.neo4j.repository;
import com.example.neo4j.model.Group;
import com.example.neo4j.model.Organization;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends Neo4jRepository<Group, Long> {
    Group findByName(@Param("name") String name);
}
