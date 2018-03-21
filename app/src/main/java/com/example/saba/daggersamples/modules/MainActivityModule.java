package com.example.saba.daggersamples.modules;


import com.example.saba.daggersamples.MainActivity;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class MainActivityModule {

    @ContributesAndroidInjector
    public abstract MainActivity contributeFeatureActivityInjector();

}
