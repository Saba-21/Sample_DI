package com.example.saba.daggersamples;

import android.app.Application;

import com.example.saba.daggersamples.models.Fight;

public class App extends Application {

    private static AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent
                .builder()
                .application(this)
                .build();
    }

    public static void injectContext(Fight context) {
        appComponent.inject(context);
    }

    public static void injectContext(MainActivity context) {
        appComponent.inject(context);
    }
}
