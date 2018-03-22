package com.example.saba.daggersamples;


import com.example.saba.daggersamples.UI.MainActivity;
import com.example.saba.daggersamples.UI.MainActivityModule;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBindingModule {

    @ContributesAndroidInjector(modules = MainActivityModule.class)
    public abstract MainActivity contributeMainActivityInjector();

}
