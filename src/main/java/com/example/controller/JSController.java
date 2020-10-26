package com.example.controller;

import com.example.entity.DataItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class JSController {
    //首页
    @RequestMapping("index")
    public String index(){
        return "index";
    }

    @RequestMapping("JS_Index")
    public String JS_Index(){
        return "JS_Index";
    }

    @RequestMapping("JS_Entity")
    public String JS_Entity(){
        return "JS_Entity";
    }

    @RequestMapping("JS_NewField")
    public String JS_NewField(){return "JS_NewField";}

    @RequestMapping("JS_TextClassify")
    public String JS_TextClassify(){
        return "JS_TextClassify";
    }

    @RequestMapping("JS_TextSum")
    public String JS_TextSum(){
        return "JS_TextSum";
    }

    @RequestMapping("JS_LongTextSum")
    public String JS_LongTextSum(){
        return "JS_LongTextSum";
    }
    @RequestMapping("JS_Result")
    public String JS_Result(){
        return "JS_Result";
    }

    @RequestMapping("JS_Table")
    public String JS_Table(){
        return "JS_Table";
    }

    @RequestMapping("JS_Cross")
    public String JS_Cross(){
        return "JS_Cross";
    }

    @RequestMapping("JS_ShowImage")
    public String JS_ShowImage(){
        return "/JS_ShowImage";
    }

    @RequestMapping("JS_Multmodel")
    public String JS_Multmodel(){
        return "/JS_Multmodel";
    }

    @RequestMapping("Multmodel_Img")
    public String Multmodel_Img(){
        return "/Multmodel_Img";
    }

    @RequestMapping("Multmodel_Text")
    public String Multmodel_Text(){
        return "/Multmodel_Text";
    }

    @RequestMapping("JS_Report")
    public String JS_Report(){
        return "/JS_Report";
    }

    @RequestMapping("JS_ReportDetail")
    public String JS_ReportDetail(){
        return "/JS_ReportDetail";
    }

    @RequestMapping("JS_ReportPrepare")
    public String JS_ReportPrepare(){
        return "/JS_ReportPrepare";
    }

    @RequestMapping("JS_ReportUpload")
    public String JS_ReportUpload(){
        return "JS_ReportUpload";
    }

    @RequestMapping("/JS_PowerContrast")
    public String JS_PowerContrast(){
        return "/JS_PowerContrast";
    }

    @RequestMapping("/JS_PowerUpload")
    public String JS_PowerUpload(){
        return "/JS_PowerUpload";
    }

    @RequestMapping("/JS_PredictUpload")
    public String JS_PredictUpload(){
        return "/JS_PredictUpload";
    }

    @RequestMapping("/JS_Predict")
    public String JS_Predict(){
        return "/JS_Predict";
    }

    @RequestMapping("/JS_ReportItem")
    public String JS_ReportItem(){ return "JS_ReportItem"; }

    @RequestMapping("Test")
    public String JS_Test(){ return "Test"; }

}
