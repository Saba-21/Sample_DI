package com.example.saba.daggersamples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FightComponent fightComponent = DaggerFightComponent
                .builder()
                .build();
        Fight fight = fightComponent.getFightInstance();
        Toast.makeText(this, fight.showResult(), Toast.LENGTH_SHORT).show();

    }
}
