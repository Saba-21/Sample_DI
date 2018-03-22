package com.example.saba.daggersamples.UI;


import com.example.saba.daggersamples.models.Fight;
import com.example.saba.daggersamples.models.FightModule;
import dagger.Module;
import dagger.Provides;

@Module(includes = FightModule.class )
public abstract class MainActivityModule {

    @Provides
    static MainPresenter provideMainPresenter(Fight fight) {
        return new MainPresenterImpl(fight);
    }

}
