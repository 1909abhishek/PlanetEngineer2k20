package com.lnct.planetengineer2020.ui.visitwebsite;

import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lnct.planetengineer2020.R;

public class VisitwebsiteFragment extends Fragment {

    private VisitwebsiteViewModel mViewModel;

    public static VisitwebsiteFragment newInstance() {
        return new VisitwebsiteFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.visitwebsite_fragment, container, false);


    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(VisitwebsiteViewModel.class);
        // TODO: Use the ViewModel
    }

}
