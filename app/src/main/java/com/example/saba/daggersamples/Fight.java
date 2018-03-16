package com.example.saba.daggersamples;


class Fight {

    private AGuy aGuy;
    private BGuy bGuy;

    Fight(AGuy aGuy, BGuy bGuy) {
        this.aGuy = aGuy;
        this.bGuy = bGuy;
    }

    String showResult(){
        if (aGuy.getStrength()+aGuy.getDefence()>bGuy.getStrength()+bGuy.getDefence())
            return aGuy.toString() + " has won the fight";
        return bGuy.toString() + " has won the fight";
    }
}
