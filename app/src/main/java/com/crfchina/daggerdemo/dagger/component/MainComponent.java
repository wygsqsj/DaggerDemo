package com.crfchina.daggerdemo.dagger.component;

import com.crfchina.daggerdemo.MainActivity;
import com.crfchina.daggerdemo.dagger.module.MainMoudule;

import dagger.Component;

/**
 * Created by xwh on 2017/4/17.
 */
@Component(modules = MainMoudule.class)
public interface MainComponent {
    void inject(MainActivity activity);
}
