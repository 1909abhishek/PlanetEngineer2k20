package com.lnct.planetengineer2k20.ui.planetteam2020;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lnct.planetengineer2k20.R;

public class Planetteam2020Fragment extends Fragment {

    private Planetteam2020ViewModel mViewModel;

    public static Planetteam2020Fragment newInstance() {
        return new Planetteam2020Fragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.planetteam2020_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(Planetteam2020ViewModel.class);
        // TODO: Use the ViewModel
    }

}
