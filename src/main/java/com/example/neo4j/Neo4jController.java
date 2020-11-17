package com.example.neo4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DUCHONG
 * @since 2018-12-17 14:14
 **/
@RestController
public class Neo4jController {

    @Autowired
    private Neo4jUserService userService;

    @RequestMapping("addUserNode")
    public String addUserNode(){

        UserNode userNode=new UserNode();
        userNode.setUserName("yuanhang");
        userNode.setAge(20);

        userService.addUserNode(userNode);

        return "add success ";
    }
}
