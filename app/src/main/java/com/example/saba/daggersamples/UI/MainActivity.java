package com.example.saba.daggersamples.UI;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.example.saba.daggersamples.R;
import com.example.saba.daggersamples.models.Fight;
import javax.inject.Inject;
import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity{

    @Inject
    Fight fight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        AndroidInjection.inject(this);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void fight(View view){
        fight.showResult();
    }

}
