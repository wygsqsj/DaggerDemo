package com.crfchina.daggerdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.crfchina.daggerdemo.dagger.component.DaggerMainComponent;
import com.crfchina.daggerdemo.dagger.module.MainMoudule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    MainSplash mSplash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerMainComponent.builder().mainMoudule(new MainMoudule()).build().inject(this);
        mSplash.show();
    }

}

