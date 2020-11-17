package com.example.neo4j.model;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.ArrayList;
import java.util.List;

//定义集团节点数据结构
@NodeEntity(label = "Group")
public class Group {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @Relationship(type = "Field", direction = Relationship.OUTGOING)
    private List<Field> fields=new ArrayList<Field>();

    public void addField(Field node) {
        this.fields.add(node);
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