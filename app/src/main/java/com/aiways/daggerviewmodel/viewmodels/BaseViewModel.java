package com.aiways.daggerviewmodel.viewmodels;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.support.annotation.NonNull;

import com.aiways.daggerviewmodel.di.ComponentHolder;
import com.aiways.daggerviewmodel.di.component.DaggerMainActivityComponent;

public class BaseViewModel extends AndroidViewModel {
    public BaseViewModel(@NonNull Application application) {
        super(application);
        //DaggerMainActivityComponent.builder().applicationComponent(ComponentHolder.getApplicationComponent()).build().inject(this);
    }
}
