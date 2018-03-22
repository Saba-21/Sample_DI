package com.example.saba.daggersamples.models;

import dagger.Module;
import dagger.Provides;

@Module
public class GuyParametersModule {

    @Provides
    public GuyDefence getGuyDefence() {
        return new GuyDefence();
    }

    @Provides
    public GuyStrength getGuyStrength() {
        return new GuyStrength();
    }

}
