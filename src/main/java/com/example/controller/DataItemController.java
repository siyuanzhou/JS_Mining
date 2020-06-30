package com.example.controller;

import com.example.entity.DataItem;
import com.example.service.DataItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@Controller
public class DataItemController {

    @Autowired
    private DataItemService dataItemService;

    @RequestMapping("JS_MulDataShow")
    public String JS_MulDataShow(@RequestParam("para") String para, Model model){
        System.out.println(para);
        List<DataItem> list =dataItemService.selectAllDataItem();
        model.addAttribute("list",list);
        model.addAttribute("title",para);
        return "JS_DataShow";
    }


}
