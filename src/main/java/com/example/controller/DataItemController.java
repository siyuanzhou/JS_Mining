package com.example.controller;

import com.example.entity.Article;
import com.example.entity.DataItem;
import com.example.entity.ReportQuaryTag;
import com.example.entity.Weapon;
import com.example.service.ArticleService;
import com.example.service.DataItemService;
import org.activiti.engine.impl.util.json.JSONArray;
import org.activiti.engine.impl.util.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class DataItemController {

    @Autowired
    private DataItemService dataItemService;

    @Autowired
    private ArticleService articleService;

    @RequestMapping("JS_MulDataShow")
    public String JS_MulDataShow(@RequestParam("para") String para, Model model){
        System.out.println(para);
        List<DataItem> list =dataItemService.selectAllDataItem();
        model.addAttribute("list",list);
        model.addAttribute("title",para);
        return "JS_DataShow";
    }

    @ResponseBody
    @RequestMapping(value = "JS_ArticleShow")
    public String JS_ArticleShow(@RequestParam("start") String start,@RequestParam("end") String end,
                                 @RequestParam("publisher") String publisher,@RequestParam("country") String country,
                                 @RequestParam("firstScope") String firstScope,@RequestParam("secondScope") String secondScope){
        ReportQuaryTag reportQuaryTag = new ReportQuaryTag();
        reportQuaryTag.setCountry(country);
        reportQuaryTag.setStart(start);
        reportQuaryTag.setEnd(end);
        reportQuaryTag.setPublisher(publisher);
        reportQuaryTag.setFirstScope(firstScope);
        reportQuaryTag.setSecondScope(secondScope);
        System.out.println(reportQuaryTag.toString());
        List<Article> lists = articleService.Select(reportQuaryTag);
        List<Map<String,String>> result = new ArrayList<>();
        for( Article article : lists){
            HashMap<String,String> temp_obj = new HashMap();
            temp_obj.put("id",article.getId().toString());
            temp_obj.put("country",article.getCountry());
            temp_obj.put("name",article.getName());
            temp_obj.put("date",article.getDate());
            temp_obj.put("realScope",article.getRealScope());
            temp_obj.put("publisher",article.getPublisher());
            if(article.getUrl().length()>20) {
                temp_obj.put("url", article.getUrl().substring(0, 20));
            }
           result.add(temp_obj);
        }
        JSONArray array = new JSONArray();
        JSONObject obj = new JSONObject();
        obj.put("resultlist", result);
        System.out.println("obj=="+obj);
        array.put(obj);
        return array.toString();
    }

}
