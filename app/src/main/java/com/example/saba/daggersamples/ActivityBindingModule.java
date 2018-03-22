package com.example.saba.daggersamples;


import android.app.Activity;
import com.example.saba.daggersamples.UI.MainActivity;
import com.example.saba.daggersamples.UI.MainSubcomponent;
import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = MainSubcomponent.class)
abstract class ActivityBindingModule {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindMainActivityInjectorFactory(MainSubcomponent.Builder builder);

}
