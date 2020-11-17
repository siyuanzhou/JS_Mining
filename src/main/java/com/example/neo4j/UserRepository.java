package com.example.neo4j;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author DUCHONG
 * @since 2018-12-17 11:42
 **/
@Component
public interface UserRepository extends CrudRepository<UserNode,Long> {

    @Query("MATCH (n: User) RETURN n")
    List<UserNode> getUserNodeList();

    @Query("CREATE (n: User{age:{age},userName:{userName}}) RETURN n")
    List<UserNode> addUserNodeList(@Param("userName") String userName, @Param("age") int age);

}
