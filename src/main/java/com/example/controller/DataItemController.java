package com.example.controller;

import com.example.entity.Article;
import com.example.entity.DataItem;
import com.example.entity.Entity;
import com.example.entity.ReportQuaryTag;
import com.example.service.ArticleService;
import com.example.service.DataItemService;
import com.github.pagehelper.PageInfo;
import org.activiti.engine.impl.util.json.JSONArray;
import org.activiti.engine.impl.util.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;
import java.util.stream.Collectors;

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
                                 @RequestParam("firstScope") String firstScope,@RequestParam("secondScope") String secondScope,
                                 @RequestParam("keywords") String keywords){
        ReportQuaryTag reportQuaryTag = new ReportQuaryTag();
        System.out.println(country);
        ArrayList<String> list = new ArrayList<>();
        String[] countrys = country.split(",");
        for(String str : countrys){
            list.add(str);
        }
        reportQuaryTag.setCountry(list);
        reportQuaryTag.setStart(start);
        reportQuaryTag.setEnd(end);
        reportQuaryTag.setPublisher(publisher);
        reportQuaryTag.setFirstScope(firstScope);
        reportQuaryTag.setSecondScope(secondScope);
        reportQuaryTag.setKeywords(keywords);
        System.out.println(reportQuaryTag.toString());
        List<Article> lists = articleService.Select(reportQuaryTag);
        /*lists = lists.subList(0,10);*/
        //方法二  根据时间进行排序
        Collections.sort(lists, (Comparator) (o1, o2) -> {
            Article u1 = (Article) o1;
            Article u2 = (Article) o2;
            return u2.getDate().compareTo(u1.getDate());
        });

        List<Map<String,String>> result = new ArrayList<>();

        for( Article article : lists){
            HashMap<String,String> temp_obj = new HashMap();
            temp_obj.put("id",(article.getId()*100+5)+"");
            temp_obj.put("country",article.getCountry());
            temp_obj.put("name",article.getName());
            if(article.getDate().length()>4) {
                temp_obj.put("date", article.getDate().substring(0,4));
            }else {
                temp_obj.put("date", article.getDate());
            }
            temp_obj.put("realScope",article.getRealScope());
            temp_obj.put("publisher",article.getPublisher());
            temp_obj.put("content",article.getContent());
            System.out.println(article.getContent());
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

    @RequestMapping(value = "JS_Helper")
    public String Helper(Model model, @RequestParam(defaultValue = "1", value = "pageNum") Integer pageNum){
        PageInfo pageInfo = dataItemService.selectList(pageNum,10);
        model.addAttribute("pageInfo",pageInfo);
        return "JS_DataShow";
    }

}
