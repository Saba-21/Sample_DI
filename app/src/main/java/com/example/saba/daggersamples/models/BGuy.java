package com.example.saba.daggersamples.models;


public class BGuy {

    private GuyStrength guyStrength;
    private GuyDefence guyDefence;

    BGuy(GuyStrength guyStrength, GuyDefence guyDefence) {
        this.guyStrength = guyStrength;
        this.guyDefence = guyDefence;
        guyStrength.setStrength(5);
        guyDefence.setDefence(4);
    }

    int getStrength(){return guyStrength.getStrength();}

    int getDefence(){return guyDefence.getDefence();}

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
