package com.aiways.daggerviewmodel;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.aiways.daggerviewmodel.di.ComponentHolder;
import com.aiways.daggerviewmodel.di.component.DaggerMainActivityComponent;
import com.aiways.daggerviewmodel.viewmodels.MyViewModel;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    ViewModelProvider.Factory mFactory;
    MyViewModel mViewModel;
    MyViewModel mViewModel2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerMainActivityComponent.builder().applicationComponent(ComponentHolder.getApplicationComponent()).build().inject(this);

        mViewModel = ViewModelProviders.of(this, mFactory).get(MyViewModel.class);
        mViewModel2 = ViewModelProviders.of(this, mFactory).get(MyViewModel.class);

        //mViewModel.call();


        Log.d("Leo", "viewmodel1: " + mViewModel);
        Log.d("Leo", "viewmodel2: " + mViewModel2);

    }
}
