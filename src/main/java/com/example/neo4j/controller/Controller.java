package com.example.neo4j.controller;


import com.alibaba.fastjson.JSONObject;
import com.example.neo4j.ResultData;
import com.example.neo4j.service.KernalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private KernalService kernalService;

    @RequestMapping(value = "/createOrg")
    public ResultData createOrg(@RequestParam String orgName) {
        ResultData result=new ResultData();
        Long orgId=kernalService.createOrg(orgName);
        if(orgId>0) {
            result.setRetCode(0);
            result.setRetMessage("创建组织成功！");
            JSONObject data = new JSONObject();
            data.put("orgId", orgId);
            data.put("orgName", orgName);
            result.setData(data);
        }
        else {
            result.setRetCode(-100);
            result.setRetMessage("创建组织失败！");
        }
        return result;
    }

    @RequestMapping(value = "/deleteAll")
    public ResultData deleteAll() {
        ResultData result=new ResultData();
        Long orgId=kernalService.deleteAll();
        if(orgId>0) {
            result.setRetCode(0);
            result.setRetMessage("删除成功！");
        }
        else {
            result.setRetCode(-100);
            result.setRetMessage("删除失败！");
        }
        return result;
    }


}
