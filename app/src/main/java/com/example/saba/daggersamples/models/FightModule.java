package com.example.saba.daggersamples.models;


import android.content.Context;
import dagger.Module;
import dagger.Provides;

@Module(includes = GuysModule.class)
public class FightModule {

    @Provides
    public static Fight getFightResult(AGuy aGuy, BGuy bGuy, Context context){
        return new Fight(aGuy, bGuy, context);
    }

}
