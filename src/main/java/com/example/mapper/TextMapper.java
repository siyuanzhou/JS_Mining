package com.example.mapper;

import com.example.entity.Tech;
import com.example.entity.Text;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TextMapper {
    List<Text> selectList();
    List<Text> selectKeywords(@Param("keywords")String keywords);
}
