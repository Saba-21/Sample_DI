package com.example.saba.daggersamples.models;

import android.content.Context;
import android.widget.Toast;


public class Fight {

    private Context context;
    private AGuy aGuy;
    private BGuy bGuy;

    Fight(AGuy aGuy, BGuy bGuy, Context context) {
        this.aGuy = aGuy;
        this.bGuy = bGuy;
        this.context = context;
    }

    public Toast GetResult(){
        String result;

        if (aGuy.getStrength()+aGuy.getDefence()>bGuy.getStrength()+bGuy.getDefence())
            result = aGuy.toString() + " has won the fight";
        else
            result = bGuy.toString() + " has won the fight";

        return Toast.makeText(context, result, Toast.LENGTH_SHORT);
    }
}
