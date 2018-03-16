package com.example.saba.daggersamples;


import dagger.Module;
import dagger.Provides;

@Module(includes = GuysModule.class)
public class FightModule {

    @Provides
    public Fight getFight(AGuy aGuy, BGuy bGuy){
        return new Fight(aGuy, bGuy);
    }

}
