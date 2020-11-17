package com.example.neo4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author DUCHONG
 * @since 2018-12-17 14:02
 **/
@Service
public class Neo4jUserService {

    @Autowired
    private UserRepository userRepository;


    public void addUserNode(UserNode userNode){

        userRepository.addUserNodeList(userNode.getUserName(),userNode.getAge());
    }
}