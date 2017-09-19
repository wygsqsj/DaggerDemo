package com.crfchina.daggerdemo.moudel.Impl;

import com.crfchina.daggerdemo.moudel.RequestModel;
import com.crfchina.daggerdemo.moudel.httpconfig.HttpParams;

/**
 * Created by xwh on 2017/5/5.
 */
public class PicImpl extends RequestModel {

    @Override
    public HttpParams getHttpParams() {
        return HttpParams.obtion().setMethod("openPic");
    }
}
