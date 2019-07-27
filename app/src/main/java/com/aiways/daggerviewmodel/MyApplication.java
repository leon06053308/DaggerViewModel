/**
 * Copyright (C) 2019-2022 AIWays  all rights reserved.
 */
package com.aiways.daggerviewmodel;


import android.support.multidex.MultiDexApplication;

import com.aiways.daggerviewmodel.di.ComponentHolder;
import com.aiways.daggerviewmodel.di.component.ApplicationComponent;
import com.aiways.daggerviewmodel.di.component.DaggerApplicationComponent;
import com.aiways.daggerviewmodel.di.modules.ApplicationModule;


public class MyApplication extends MultiDexApplication
{
    private static String TAG = "MyApplication";

    private ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate()
    {
        super.onCreate();
        this.initializeInjector();
        this.initializeLeakDetection();
    }

    private void initializeInjector()
    {
        this.mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();

        ComponentHolder.setApplicationComponent(mApplicationComponent);
    }

    private void initializeLeakDetection()
    {
    }

}
