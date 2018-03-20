package com.example.saba.daggersamples.models;


import android.content.Context;
import android.widget.Toast;
import com.example.saba.daggersamples.App;
import javax.inject.Inject;

public class Fight {

    @Inject
    public Context context;

    private AGuy aGuy;
    private BGuy bGuy;

    public Fight(AGuy aGuy, BGuy bGuy) {
        this.aGuy = aGuy;
        this.bGuy = bGuy;
        App.injectContext(this);
    }

    public void showResult(){
        String result;

        if (aGuy.getStrength()+aGuy.getDefence()>bGuy.getStrength()+bGuy.getDefence())
            result = aGuy.toString() + " has won the fight";
        else
            result = bGuy.toString() + " has won the fight";

         Toast.makeText(context, result, Toast.LENGTH_SHORT).show();
    }
}
