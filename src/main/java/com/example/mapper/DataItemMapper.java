package com.example.mapper;


import com.example.entity.DataItem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DataItemMapper {

    DataItem Sel(int id);

    List<DataItem> selectAllDataItem();

}
