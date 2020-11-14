package com.example.mapper;

import com.example.entity.Entity;
import com.example.entity.Tech;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TechMapper {
    List<Tech> selectList();
    List<Tech> selectKeywords(@Param("keywords")String keywords);
}
