package com.crfchina.daggerdemo.moudel.httpconfig;

import android.os.Build;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by xwh on 2017/5/5.
 */
public class HttpParams {

    private static HttpParams params;
    private JSONObject infoJson;
    private JSONObject bizJson;
    private JSONObject mainJson;

    private HttpParams() {
        infoJson = new JSONObject();
        mainJson = new JSONObject();
        bizJson = new JSONObject();
        try {
            bizJson.put("version", "2.2.1");
            bizJson.put("deviceType", "1");
            bizJson.put("deviceName", Build.BRAND + "," + Build.MODEL);
            bizJson.put("deviceToken", "");
            bizJson.put("deviceId", "");
            bizJson.put("deviceOs", "");
            bizJson.put("ipType", "");
            mainJson.put("token", "");
            infoJson.put("biz", bizJson);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static HttpParams obtion() {
        if (params == null) {
            synchronized (HttpParams.class) {
                if (params == null) {
                    params = new HttpParams();
                }
            }
        }
        return params;
    }

    public HttpParams setParams(String key, String value) {
        try {
            mainJson.put(key, value);
            return this;
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

    public HttpParams setMethod(String method) {
        try {
            infoJson.put("method", method);
            return this;
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getInfoJson() {
        return infoJson.toString();
    }
}
