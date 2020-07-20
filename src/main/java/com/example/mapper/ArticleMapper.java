package com.example.mapper;

import com.example.entity.Article;
import com.example.entity.DataItem;
import com.example.entity.ReportQuaryTag;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArticleMapper {

    List<Article> Sel(int id);

    List<Article> Select(ReportQuaryTag reportQuaryTag);

    List<Article> selectAllArticle();

}