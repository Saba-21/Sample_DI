package com.example.saba.daggersamples;


import dagger.Component;

@Component(modules = FightModule.class)
public interface FightComponent {

    Fight getFightInstance();

}
