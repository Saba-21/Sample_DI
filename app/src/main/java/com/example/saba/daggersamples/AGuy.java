package com.example.saba.daggersamples;


public class AGuy {

    private GuyStrength guyStrength;
    private GuyDefence guyDefence;

    AGuy(GuyStrength guyStrength, GuyDefence guyDefence) {
        this.guyStrength = guyStrength;
        this.guyDefence = guyDefence;
        guyStrength.setStrength(8);
        guyDefence.setDefence(9);
    }

    int getStrength(){return guyStrength.getStrength();}

    int getDefence(){return guyDefence.getDefence();}

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
