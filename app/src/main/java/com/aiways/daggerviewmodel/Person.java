package com.aiways.daggerviewmodel;

import android.util.Log;

import javax.inject.Inject;

public class Person {

    @Inject
    public Person() {
    }

    public void printName(){
        Log.d("Leo", "Leon...");
    }
}
