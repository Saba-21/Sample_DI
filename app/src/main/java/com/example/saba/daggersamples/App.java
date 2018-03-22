package com.example.saba.daggersamples;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

public class App extends DaggerApplication {

    protected AndroidInjector<? extends dagger.android.DaggerApplication> applicationInjector() {

        AppComponent appComponent = DaggerAppComponent
                .builder()
                .application(this)
                .build();

        appComponent.inject(this);

        return appComponent;
    }

}
