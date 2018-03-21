package com.example.saba.daggersamples.UI;


import android.content.Context;
import com.example.saba.daggersamples.models.AGuy;
import com.example.saba.daggersamples.models.BGuy;
import com.example.saba.daggersamples.models.Fight;
import com.example.saba.daggersamples.modules.GuysModule;
import dagger.Module;
import dagger.Provides;

@Module(includes = GuysModule.class )
public class MainActivityModule {

    @Provides
    static Fight getFightResult(AGuy aGuy, BGuy bGuy, Context context){
        return new Fight(aGuy, bGuy, context);
    }
}
