package com.example.service;

import com.example.entity.Article;
import com.example.entity.DataItem;
import com.example.entity.ReportQuaryTag;
import com.example.mapper.ArticleMapper;
import com.example.mapper.DataItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {
    @Autowired
    ArticleMapper articleMapper;

    public List<Article> Sel(int id){
        return articleMapper.Sel(id);
    }

    public List<Article> Select(ReportQuaryTag reportQuaryTag){
        return articleMapper.Select(reportQuaryTag);
    }

    public List<Article> selectAllArticle(){
        return articleMapper.selectAllArticle();
    }
}
