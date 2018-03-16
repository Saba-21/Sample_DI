package com.example.saba.daggersamples;


import dagger.Module;
import dagger.Provides;

@Module(includes = GuyParametersModule.class)
public class GuysModule {

    @Provides
    public AGuy getAGuy(GuyDefence guyDefence, GuyStrength guyStrength){
        return new AGuy(guyStrength, guyDefence);
    }

    @Provides
    public BGuy getBGuy(GuyDefence guyDefence, GuyStrength guyStrength){
        return new BGuy(guyStrength, guyDefence);
    }

}
