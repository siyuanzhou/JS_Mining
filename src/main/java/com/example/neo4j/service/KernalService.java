package com.example.neo4j.service;

import com.example.neo4j.model.Domain;
import com.example.neo4j.model.Field;
import com.example.neo4j.model.Group;
import com.example.neo4j.model.Organization;
import com.example.neo4j.repository.DomainRepository;
import com.example.neo4j.repository.FieldRepository;
import com.example.neo4j.repository.GroupRepository;
import com.example.neo4j.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class KernalService {
    @Autowired
    private OrganizationRepository organizationRepository;
    @Autowired
    private GroupRepository groupRepository;
    @Autowired
    private FieldRepository fieldRepository;
    @Autowired
    private DomainRepository domainRepository;

    public Long createOrg(String name){
        //存储节点
        Organization organization=new Organization();
        organization.setName(name);
        organizationRepository.save(organization);
        return organization.getId();
    }

    public Long createGroup(Long id,String name){
        //存储节点
        Group group=new Group();
        group.setName(name);
        groupRepository.save(group);

        Optional<Organization> organization=organizationRepository.findById(id);
        if(organization.get().getId()!=id){
            organization.get().addGroup(group);
            organizationRepository.save(organization.get());
            return group.getId();
        }
        return -1L;
    }

    public Long createField(Long id,String name){
        //存储节点
        Field field=new Field();
        field.setName(name);
        fieldRepository.save(field);

        Optional<Group> group=groupRepository.findById(id);
        if(group.get().getId()!=id){
            group.get().addField(field);
            groupRepository.save(group.get());
            return field.getId();
        }
        return -1L;
    }

    public Long createDomain(Long id,String userId,String name){
        //存储节点
        Domain domain = new Domain();
        domain.setUserId(userId);
        domain.setName(name);
        domainRepository.save(domain);

        Optional<Field> fields = fieldRepository.findById(id);
        if(fields.get().getId()!=id){
            fields.get().addDomain(domain);
            fieldRepository.save(fields.get());
            return domain.getId();
        }
        return -1L;
    }

    public Long deleteAll(){
        domainRepository.deleteAll();
        return 200L;
    }
}
