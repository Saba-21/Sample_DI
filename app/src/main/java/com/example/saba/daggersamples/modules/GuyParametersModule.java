package com.example.saba.daggersamples.modules;

import com.example.saba.daggersamples.models.GuyDefence;
import com.example.saba.daggersamples.models.GuyStrength;

import dagger.Module;
import dagger.Provides;

@Module
public class GuyParametersModule {

    @Provides
    GuyDefence getGuyDefence() {
        return new GuyDefence();
    }

    @Provides
    GuyStrength getGuyStrength() {
        return new GuyStrength();
    }

}
