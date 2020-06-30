package com.example.service;

import com.example.entity.Weapon;
import io.searchbox.client.JestClient;
import io.searchbox.core.Search;
import io.searchbox.core.SearchResult;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class EsService {

    @Autowired
    JestClient jestClient;
    //RestHighLevelClient restHighLevelClient;

    public List<Weapon> searchPage(String keyword, int pageNo, int pageSize){
        /*if(pageNo<=1){
            pageNo=1;
        }
        //条件搜索
        SearchRequest searchRequest = new SearchRequest("multmodel");
        SearchSourceBuilder sourceBuilder = new SearchSourceBuilder();

        //分页
        sourceBuilder.from(pageNo);
        sourceBuilder.size(pageSize);

        //精准匹配
        TermQueryBuilder termQueryBuilder = QueryBuilders.termQuery("name", keyword);
        sourceBuilder.query(termQueryBuilder);
        sourceBuilder.timeout(new TimeValue(60, TimeUnit.SECONDS));

        //并行搜索
        searchRequest.source(sourceBuilder);
        //解析结果
        List<Map<String,Object>> list = new ArrayList<>();
        try {
            SearchResponse searchResponse = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);
            for(SearchHit documentFields: searchResponse.getHits().getHits()){
                list.add(documentFields.getSourceAsMap());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;*/
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        searchSourceBuilder.query(QueryBuilders.queryStringQuery(keyword));
        searchSourceBuilder.size(pageSize);
        searchSourceBuilder.from(pageNo);
        Search search = new Search.Builder(searchSourceBuilder.toString()).addIndex("multmodel").build();
        SearchResult result = null ;
        List<Weapon> res = new ArrayList<>();
        try {
            result = jestClient.execute(search);
            System.out.println("本次查询共查到："+result.getTotal()+"个结果！");
            List<SearchResult.Hit<Weapon, Void>> hits = result.getHits(Weapon.class);
            System.out.println("Size:" + hits.size());
            for (SearchResult.Hit<Weapon, Void> hit : hits) {
                Weapon weapon = hit.source;
                res.add(weapon);
                System.out.println(weapon.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<Weapon> sortres = new ArrayList<>();
        for(int i=0;i<res.size();i++){
            if(res.get(i).getTime().equals("冷战后至今")){
                sortres.add(res.get(i));
            }
        }
        for(int i=0;i<res.size();i++){
            if(res.get(i).getTime().equals("二战后至冷战期间")){
                sortres.add(res.get(i));
            }
        }
        for(int i=0;i<res.size();i++){
            if(res.get(i).getTime().equals("二战期间")){
                sortres.add(res.get(i));
            }
        }
        for(int i=0;i<res.size();i++){
            if(res.get(i).getTime().equals("二战前")){
                sortres.add(res.get(i));
            }
        }
        return sortres;
    }
}
