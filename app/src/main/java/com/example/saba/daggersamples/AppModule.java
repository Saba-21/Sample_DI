package com.example.saba.daggersamples;

import android.app.Application;
import android.content.Context;
import javax.annotation.Nonnull;
import dagger.Binds;
import dagger.Module;

@Module
abstract class AppModule {

    @Binds
    abstract Context provideContext(@Nonnull final Application application);

}
