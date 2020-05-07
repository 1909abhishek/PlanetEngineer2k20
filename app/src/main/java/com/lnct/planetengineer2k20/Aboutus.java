package com.lnct.planetengineer2k20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.lnct.planetengineer2k20.ui.aboutus.AboutusFragment;

public class Aboutus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aboutus_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, AboutusFragment.newInstance())
                    .commitNow();
        }
    }
}
