package com.example.mapper;

import com.example.entity.Tech;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TechMapper {
    List<Tech> selectList();
}
