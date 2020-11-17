package com.example.neo4j.model;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.ArrayList;
import java.util.List;

//定义部门节点数据结构
@NodeEntity(label = "Field")
public class Field {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @Relationship(type = "field", direction = Relationship.OUTGOING)
    private List<Field> fields=new ArrayList<>();
    @Relationship(type = "domain", direction = Relationship.OUTGOING)
    private List<Domain> domains=new ArrayList<>();

    public void addField(Field node) {
        this.fields.add(node);
    }

    public void addDomain(Domain node) {
        this.domains.add(node);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
