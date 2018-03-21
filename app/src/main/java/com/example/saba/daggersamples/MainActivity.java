package com.example.saba.daggersamples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.saba.daggersamples.models.Fight;
import javax.inject.Inject;
import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity {

    @Inject
    Fight fight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        AndroidInjection.inject(this);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fight.showResult();

    }
}
