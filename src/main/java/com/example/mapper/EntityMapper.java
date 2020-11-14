package com.example.mapper;
import com.example.entity.Entity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface EntityMapper {
    List<Entity> selectList();
    List<Entity> selectKeywords(@Param("keywords")String keywords);
}
