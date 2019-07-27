
package com.aiways.daggerviewmodel.di.modules;

import android.app.Application;
import android.content.Context;

import com.aiways.daggerviewmodel.MainDataHolder;
import com.aiways.daggerviewmodel.MyApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Dagger module that provides objects which will live during the application lifecycle.
 */
@Module
public class ApplicationModule
{
    private final MyApplication application;

    public ApplicationModule(MyApplication application) {
        this.application = application;
    }

    @Singleton
    @Provides
    Context provideApplicationContext() {
        return this.application;
    }

    @Singleton
    @Provides
    Application provideApplication() {
        return this.application;
    }
}
