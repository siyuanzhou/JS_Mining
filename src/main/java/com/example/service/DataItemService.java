package com.example.service;

import com.example.entity.DataItem;
import com.example.mapper.DataItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataItemService {
    @Autowired
    DataItemMapper dataItemMapper;

    public DataItem Sel(int id){
        return dataItemMapper.Sel(id);
    }

    public List<DataItem> selectAllDataItem(){
        return dataItemMapper.selectAllDataItem();
    }
}
