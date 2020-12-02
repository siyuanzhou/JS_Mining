package com.example.service;

import com.example.entity.*;
import com.example.mapper.*;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DataItemService {

    @Autowired
    DataItemMapper dataItemMapper;

    @Autowired
    EntityMapper entityMapper;

    @Autowired
    TechMapper techMapper;

    @Autowired
    FieldMapper fieldMapper;

    @Autowired
    TextMapper textMapper;


    public DataItem Sel(int id){
        return dataItemMapper.Sel(id);
    }

    public List<DataItem> selectAllDataItem(){
        return dataItemMapper.selectAllDataItem();
    }

    public PageInfo selectList(Integer pageNum, Integer pageSize,String keywords){
        PageHelper.startPage(pageNum, pageSize); // 设定当前页码，以及当前页显示的条数
        //PageHelper.offsetPage(pageNum, pageSize);也可以使用此方式进行设置
        List<Entity> list = new ArrayList<>();
        if(keywords.equals("")) {
            list = entityMapper.selectList();
        }else{
            list = entityMapper.selectKeywords(keywords);
        }
        System.out.println(list);
        PageInfo<Entity> pageInfo = new PageInfo<Entity>(list);
        return pageInfo;
    }

    public PageInfo selectTechList(Integer pageNum, Integer pageSize,String keywords){
        PageHelper.startPage(pageNum, pageSize); // 设定当前页码，以及当前页显示的条数
        //PageHelper.offsetPage(pageNum, pageSize);也可以使用此方式进行设置
        List<Tech> list = new ArrayList<>();
        if(keywords.equals("")) {
            list = techMapper.selectList();
        }else{
            list = techMapper.selectKeywords(keywords);
        }
        System.out.println(list.toString());
        PageInfo<Tech> pageInfo = new PageInfo<Tech>(list);
        return pageInfo;
    }

    public PageInfo selectTextList(Integer pageNum, Integer pageSize,String keywords){
        PageHelper.startPage(pageNum, pageSize); // 设定当前页码，以及当前页显示的条数
        //PageHelper.offsetPage(pageNum, pageSize);也可以使用此方式进行设置
        List<Text> list = new ArrayList<>();
        if(keywords.equals("")) {
            list = textMapper.selectList();
        }else{
            list = textMapper.selectKeywords(keywords);
        }
        for(int i=0;i<list.size();i++){
            Text t = list.get(i);
            int len = 5-t.id.length();
            for(int j=0;j<len;j++){
                t.id = "0"+t.id;
            }
        }
        System.out.println(list.toString());
        PageInfo<Text> pageInfo = new PageInfo<Text>(list);
        return pageInfo;
    }

    public PageInfo selectFieldList(Integer pageNum, Integer pageSize,String keywords){
        PageHelper.startPage(pageNum, pageSize); // 设定当前页码，以及当前页显示的条数
        //PageHelper.offsetPage(pageNum, pageSize);也可以使用此方式进行设置
        List<FieldBean> list = new ArrayList<>();
        if(keywords.equals("")) {
            list = fieldMapper.selectList();
        }else{
            list = fieldMapper.selectKeywords(keywords);
        }
        System.out.println(list.toString());
        PageInfo<FieldBean> pageInfo = new PageInfo<FieldBean>(list);
        return pageInfo;
    }


}
