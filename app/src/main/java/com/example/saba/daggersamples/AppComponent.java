package com.example.saba.daggersamples;

import android.app.Application;
import com.example.saba.daggersamples.modules.AppModule;
import com.example.saba.daggersamples.modules.MainActivityModule;
import javax.inject.Singleton;
import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = {
        AppModule.class,
        MainActivityModule.class
        })
public interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(final Application app);

        AppComponent build();
    }

    void inject (App app);

}
