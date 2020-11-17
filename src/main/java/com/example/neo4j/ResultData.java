package com.example.neo4j;

import com.alibaba.fastjson.JSONObject;

public class ResultData {

    private Integer RetCode;
    private String RetMessage;
    private JSONObject data;

    public Integer getRetCode() {
        return RetCode;
    }

    public void setRetCode(Integer retCode) {
        RetCode = retCode;
    }

    public String getRetMessage() {
        return RetMessage;
    }

    public void setRetMessage(String retMessage) {
        RetMessage = retMessage;
    }

    public JSONObject getData() {
        return data;
    }

    public void setData(JSONObject data) {
        this.data = data;
    }
}
