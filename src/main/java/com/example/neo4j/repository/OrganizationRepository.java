package com.example.neo4j.repository;

import com.example.neo4j.model.Organization;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationRepository extends Neo4jRepository<Organization, Long> {
    Organization findByName(@Param("name") String name);
}
