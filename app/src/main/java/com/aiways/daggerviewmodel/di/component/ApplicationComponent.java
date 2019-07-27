
package com.aiways.daggerviewmodel.di.component;

import android.app.Application;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import com.aiways.daggerviewmodel.MainDataHolder;
import com.aiways.daggerviewmodel.di.modules.ApplicationModule;


import javax.inject.Singleton;

import dagger.Component;

/**
 * A component whose lifetime is the life of the application.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent
{
    Context context();

    Application application();

    MainDataHolder mainDataHolder();
}
