package com.example.saba.daggersamples.modules;

import com.example.saba.daggersamples.models.AGuy;
import com.example.saba.daggersamples.models.BGuy;
import com.example.saba.daggersamples.models.GuyDefence;
import com.example.saba.daggersamples.models.GuyStrength;
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
