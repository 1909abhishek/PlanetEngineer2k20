package com.lnct.planetengineer2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.lnct.planetengineer2020.ui.register.MainRegisterFragment;

public class MainRegister extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_register_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainRegisterFragment.newInstance())
                    .commitNow();
        }
    }
}
