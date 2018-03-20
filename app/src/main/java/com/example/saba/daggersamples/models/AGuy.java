package com.example.saba.daggersamples.models;


public class AGuy {

    private GuyStrength guyStrength;
    private GuyDefence guyDefence;

    public AGuy(GuyStrength guyStrength, GuyDefence guyDefence) {
        this.guyStrength = guyStrength;
        this.guyDefence = guyDefence;
        guyStrength.setStrength(8);
        guyDefence.setDefence(9);
    }

    public int getStrength(){return guyStrength.getStrength();}

    public int getDefence(){return guyDefence.getDefence();}

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
