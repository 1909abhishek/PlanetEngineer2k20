package com.lnct.planetengineer2020.ui.emergencycontact;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lnct.planetengineer2020.R;

public class EmergencycontactFragment extends Fragment {

    private EmergencycontactViewModel mViewModel;

    public static EmergencycontactFragment newInstance() {
        return new EmergencycontactFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.emergencycontact_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(EmergencycontactViewModel.class);
        // TODO: Use the ViewModel
    }

}
