package com.example.saba.daggersamples;

import android.app.Application;
import com.example.saba.daggersamples.UI.ActivityContributionModule;
import dagger.BindsInstance;
import dagger.Component;

@Component(modules = {AppModule.class, ActivityContributionModule.class})
public interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(final Application app);

        AppComponent build();
    }

    void inject (App app);

}
