package com.crfchina.daggerdemo.dagger.module;

import com.crfchina.daggerdemo.MainSplash;

import dagger.Module;
import dagger.Provides;

/**
 * Created by xwh on 2017/4/17.
 */
@Module
public class MainMoudule {
    @Provides
    MainSplash provideMainActivity() {
        return new MainSplash();
    }
}
