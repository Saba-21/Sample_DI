package com.example.saba.daggersamples.models;


public class BGuy {

    private GuyStrength guyStrength;
    private GuyDefence guyDefence;

    public BGuy(GuyStrength guyStrength, GuyDefence guyDefence) {
        this.guyStrength = guyStrength;
        this.guyDefence = guyDefence;
        guyStrength.setStrength(7);
        guyDefence.setDefence(8);
    }

    public int getStrength(){return guyStrength.getStrength();}

    public int getDefence(){return guyDefence.getDefence();}

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
