package com.crfchina.daggerdemo.moudel.bean;

import com.google.gson.JsonObject;

/**
 * Created by xwh on 2017/5/3.
 */
public class UrlBean {


    private String result;
    private JsonObject data;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }


    public void setData(JsonObject Data) {
        this.data = data;
    }

    public JsonObject getData() {
        return data;
    }
}
