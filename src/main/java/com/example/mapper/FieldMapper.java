package com.example.mapper;

import com.example.entity.Entity;
import com.example.entity.FieldBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface FieldMapper {
    List<FieldBean> selectList();
    List<FieldBean> selectKeywords(@Param("keywords")String keywords);
}
