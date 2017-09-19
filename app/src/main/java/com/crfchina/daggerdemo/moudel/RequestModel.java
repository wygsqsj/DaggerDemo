package com.crfchina.daggerdemo.moudel;

import android.util.Log;

import com.crfchina.daggerdemo.moudel.Impl.BaseApi;
import com.crfchina.daggerdemo.moudel.bean.ResponseBean;
import com.crfchina.daggerdemo.moudel.httpconfig.HttpParams;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by xwh on 2017/5/5.
 */
public abstract class RequestModel extends BaseApi {

    public void Request() {
        Service service = retrofit.create(Service.class);
        service.mainRequest(getHttpParams().getInfoJson())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<ResponseBean>() {
                    @Override
                    public void onCompleted() {
                        Log.i("2r", "rx請求結束");
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.i("2r", "rx請求出错:" + e.toString());
                    }

                    @Override
                    public void onNext(ResponseBean responseBean) {
                        Log.i("2r", "rx請求成功：" + responseBean.toString());
                    }
                });
    }

    public abstract HttpParams getHttpParams();
}
