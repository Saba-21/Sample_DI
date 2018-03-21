package com.example.saba.daggersamples.UI;


import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityContributionModule {

    @ContributesAndroidInjector(modules = MainActivityModule.class)
    public abstract MainActivity contributeMainActivityInjector();

}
