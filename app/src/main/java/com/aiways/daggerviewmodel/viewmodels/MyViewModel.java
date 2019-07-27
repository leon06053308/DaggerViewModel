package com.aiways.daggerviewmodel.viewmodels;

import android.app.Application;
import android.support.annotation.NonNull;

import com.aiways.daggerviewmodel.Person;

import javax.inject.Inject;

public class MyViewModel extends BaseViewModel {
    /*@Inject
    public Person mPerson;*/

    @Inject
    public MyViewModel(@NonNull Application application) {
        super(application);
    }

    /*public void call(){
        mPerson.printName();
    }*/
}
