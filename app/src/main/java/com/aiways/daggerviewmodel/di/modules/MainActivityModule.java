package com.aiways.daggerviewmodel.di.modules;

import android.arch.lifecycle.ViewModelProviders;
import android.support.v7.app.AppCompatActivity;

import com.aiways.daggerviewmodel.di.scope.PerActivity;
import com.aiways.daggerviewmodel.viewmodels.MyViewModel;

import dagger.Module;
import dagger.Provides;

@Module(includes = ViewModelModule.class)
public class MainActivityModule {
    private final AppCompatActivity activity;

    public MainActivityModule(AppCompatActivity activity)
    {
        this.activity = activity;
    }

    @Provides
    AppCompatActivity activity()
    {
        return this.activity;
    }


}
