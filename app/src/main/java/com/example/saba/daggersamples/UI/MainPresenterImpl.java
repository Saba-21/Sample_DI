package com.example.saba.daggersamples.UI;


import com.example.saba.daggersamples.models.Fight;
import javax.inject.Inject;

public class MainPresenterImpl extends BasePresenter<MainView> implements MainPresenter{

    private Fight fight;

    @Inject
    public MainPresenterImpl(Fight fight) {
        this.fight = fight;
    }

    @Override
    public void loadMain() {
        mView.ShowResult(fight.GetResult());
    }
}
