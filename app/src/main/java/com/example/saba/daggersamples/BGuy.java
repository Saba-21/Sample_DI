package com.example.saba.daggersamples;


public class BGuy {

    private GuyStrength guyStrength;
    private GuyDefence guyDefence;

    BGuy(GuyStrength guyStrength, GuyDefence guyDefence) {
        this.guyStrength = guyStrength;
        this.guyDefence = guyDefence;
        guyStrength.setStrength(9);
        guyDefence.setDefence(9);
    }

    int getStrength(){return guyStrength.getStrength();}

    int getDefence(){return guyDefence.getDefence();}

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
