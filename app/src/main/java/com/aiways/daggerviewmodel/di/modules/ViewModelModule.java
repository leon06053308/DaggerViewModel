/**
 * Copyright (C) 2018-2021 AIWays all rights reserved.
 */
package com.aiways.daggerviewmodel.di.modules;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;

import com.aiways.daggerviewmodel.ViewModelFactory;
import com.aiways.daggerviewmodel.viewmodels.MyViewModel;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Map;

import javax.inject.Provider;

import dagger.Binds;
import dagger.MapKey;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;

/**
 * A module to wrap the Activity state and expose it to the graph.
 */
@Module
abstract public class ViewModelModule {

    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    @MapKey
    @interface ViewModelKey{
        Class<? extends ViewModel> value();
    }

    @Binds
    abstract ViewModelProvider.Factory viewModelFactory(ViewModelFactory factory);

    @Binds
    @IntoMap
    @ViewModelKey(MyViewModel.class)
    abstract ViewModel myViewModel(MyViewModel viewModel);

    /*@Provides
    ViewModelFactory viewModelFactory(Map<Class<? extends ViewModel>, Provider<ViewModel>> providerMap) {
        return new ViewModelFactory(providerMap);
    }*/

    /*@Provides
    @IntoMap
    @ViewModelKey(MyViewModel.class)
    ViewModel myViewModel(MyViewModel viewModel){
        return new MyViewModel();
    }*/

    /*@Provides
    @IntoMap
    @ViewModelKey(AViewModel.class)
    ViewModel aViewModel(AViewModel aViewModel){
        return aViewModel;
    }*/

}
