package com.example.saba.daggersamples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.saba.daggersamples.models.Fight;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Fight fight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        App.injectContext(this);

        fight.showResult();

    }

}
