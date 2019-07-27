package com.aiways.daggerviewmodel.di.component;


import com.aiways.daggerviewmodel.MainActivity;
import com.aiways.daggerviewmodel.di.modules.MainActivityModule;
import com.aiways.daggerviewmodel.di.scope.PerActivity;
import com.aiways.daggerviewmodel.viewmodels.BaseViewModel;

import dagger.Component;

@PerActivity
@Component(dependencies = ApplicationComponent.class,modules = {MainActivityModule.class})
public interface MainActivityComponent {
    void inject(MainActivity mainActivity);
    //void inject(BaseViewModel baseViewModel);
}
