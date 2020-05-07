package com.lnct.planetengineer2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.lnct.planetengineer2020.ui.developerzone.DeveloperzoneFragment;

public class Developerzone extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.developerzone_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, DeveloperzoneFragment.newInstance())
                    .commitNow();
        }
    }
}
