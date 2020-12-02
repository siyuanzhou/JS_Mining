package com.example.mapper;
import com.example.entity.DataQueryTag;
import com.example.entity.Entity;
import com.example.entity.Tech;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface EntityMapper {
    List<Entity> selectList();
    List<Entity> selectKeywords(@Param("keywords")String keywords);
    List<Entity> selectByQuery(DataQueryTag dataQueryTag);
}
