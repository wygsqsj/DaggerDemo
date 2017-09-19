package com.crfchina.daggerdemo.moudel;

import com.crfchina.daggerdemo.moudel.bean.ResponseBean;
import com.crfchina.daggerdemo.moudel.bean.UrlBean;

import java.util.Map;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import rx.Observable;

/**
 * Created by xwh on 2017/5/3.
 */
public interface Service {
    @FormUrlEncoded
    @POST("crf_finance/main.do")
    public Observable<ResponseBean> mainRequest(@Field("infoJson") String infoJson);

    @Multipart
    @POST("crf_finance/uploadPic.do")
    public Call<UrlBean> upLoad(
            @PartMap Map<String, RequestBody> map,
            @Part MultipartBody.Part file);


    @Multipart
    @POST("user/updUserHeadPortrait.htm")
    public Call<UrlBean> updUser(
            @PartMap Map<String, RequestBody> map,
            @Part MultipartBody.Part file);

}
