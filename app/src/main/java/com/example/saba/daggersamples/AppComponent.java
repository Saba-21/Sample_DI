package com.example.saba.daggersamples;

import android.app.Application;

import com.example.saba.daggersamples.models.Fight;
import com.example.saba.daggersamples.modules.AppModule;

import javax.inject.Singleton;
import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(final Application app);

        AppComponent build();
    }

    void inject (MainActivity mainActivity);

    void inject (Fight fight);

}
