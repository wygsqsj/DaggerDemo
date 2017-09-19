package com.crfchina.daggerdemo;

import com.crfchina.daggerdemo.moudel.Impl.PicImpl;

/**
 * Created by xwh on 2017/4/17.
 */
public class MainSplash{
    public MainSplash() {

    }
    public void show(){
        new PicImpl().Request();
    }
}
