package com.lnct.planetengineer2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.lnct.planetengineer2020.ui.visitwebsite.VisitwebsiteFragment;

public class Visitwebsite extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.visitwebsite_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, VisitwebsiteFragment.newInstance())
                    .commitNow();
        }
    }
}
