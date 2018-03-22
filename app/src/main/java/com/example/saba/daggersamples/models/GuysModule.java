package com.example.saba.daggersamples.models;

import dagger.Module;
import dagger.Provides;

@Module(includes = {GuyParametersModule.class})
public class GuysModule {

    @Provides
    AGuy getAGuy(GuyDefence guyDefence, GuyStrength guyStrength){
        return new AGuy(guyStrength, guyDefence);
    }

    @Provides
    BGuy getBGuy(GuyDefence guyDefence, GuyStrength guyStrength){
        return new BGuy(guyStrength, guyDefence);
    }

}
