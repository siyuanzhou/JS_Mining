package com.example.service;

import com.example.entity.DataItem;
import com.example.entity.Entity;
import com.example.entity.Tech;
import com.example.mapper.DataItemMapper;
import com.example.mapper.EntityMapper;
import com.example.mapper.TechMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataItemService {

    @Autowired
    DataItemMapper dataItemMapper;

    @Autowired
    EntityMapper entityMapper;

    @Autowired
    TechMapper techMapper;

    public DataItem Sel(int id){
        return dataItemMapper.Sel(id);
    }

    public List<DataItem> selectAllDataItem(){
        return dataItemMapper.selectAllDataItem();
    }

    public PageInfo selectList(Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum, pageSize); // 设定当前页码，以及当前页显示的条数
        //PageHelper.offsetPage(pageNum, pageSize);也可以使用此方式进行设置
        List<Entity> list = entityMapper.selectList();
        System.out.println(list);
        PageInfo<Entity> pageInfo = new PageInfo<Entity>(list);
        return pageInfo;
    }

    public PageInfo selectTechList(Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum, pageSize); // 设定当前页码，以及当前页显示的条数
        //PageHelper.offsetPage(pageNum, pageSize);也可以使用此方式进行设置
        List<Tech> list = techMapper.selectList();
        System.out.println(list);
        PageInfo<Tech> pageInfo = new PageInfo<Tech>(list);
        return pageInfo;
    }

}
