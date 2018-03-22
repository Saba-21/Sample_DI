package com.example.saba.daggersamples.UI;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.example.saba.daggersamples.R;
import javax.inject.Inject;
import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends DaggerAppCompatActivity implements MainView {

    @Inject
    MainPresenterImpl presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter.attach(this);
    }

    public void fight(View view){
        presenter.loadMain();
    }

    @Override
    public void ShowResult(Toast toast) {
        toast.show();
    }

    @Override
    protected void onDestroy() {
        presenter.detach();
        super.onDestroy();
    }
}
