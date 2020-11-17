package com.example.neo4j.model;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.ArrayList;
import java.util.List;

//定义组织节点数据结构
@NodeEntity(label = "Organization")
public class Organization {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @Relationship(type = "group", direction = Relationship.OUTGOING)
    private List<Group> groups=new ArrayList<>();

    public void addGroup(Group node) {
        this.groups.add(node);
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