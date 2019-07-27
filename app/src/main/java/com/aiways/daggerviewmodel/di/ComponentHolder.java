package com.aiways.daggerviewmodel.di;

import com.aiways.daggerviewmodel.di.component.ApplicationComponent;

public class ComponentHolder {
    private static ApplicationComponent sApplicationComponent;

    public static void setApplicationComponent(ApplicationComponent component){
        sApplicationComponent = component;
    }

    public static ApplicationComponent getApplicationComponent(){
        return sApplicationComponent;
    }
}
