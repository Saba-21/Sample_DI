package com.example.saba.daggersamples.modules;

import android.app.Application;
import android.content.Context;
import com.example.saba.daggersamples.models.AGuy;
import com.example.saba.daggersamples.models.BGuy;
import com.example.saba.daggersamples.models.Fight;
import javax.annotation.Nonnull;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;

@Module( includes = GuysModule.class )
public class AppModule {

    @Provides
    @Singleton
    Context provideContext(@Nonnull final Application application) {
        return application.getApplicationContext();
    }

    @Provides
    @Singleton
    Fight getFightResult(AGuy aGuy, BGuy bGuy, Context context){
        return new Fight(aGuy, bGuy, context);
    }

}
