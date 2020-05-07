package com.lnct.planetengineer2k20.ui.events;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.lnct.planetengineer2k20.BrainEvent;
import com.lnct.planetengineer2k20.ColorEvent;
import com.lnct.planetengineer2k20.DanceEvent;
import com.lnct.planetengineer2k20.FoodEvent;
import com.lnct.planetengineer2k20.FunEvent;
import com.lnct.planetengineer2k20.MicEvent;
import com.lnct.planetengineer2k20.R;
import com.lnct.planetengineer2k20.SportsEvent;
import com.lnct.planetengineer2k20.StageEvent;
import com.lnct.planetengineer2k20.TechnicalEvent;

public class EventsFragment extends Fragment {

    private EventsViewModel mViewModel;

    public static EventsFragment newInstance() {
        return new EventsFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.events_fragment, container, false);
        ImageButton colorbtn=view.findViewById(R.id.imgbtn1);
        ImageButton dancebtn=view.findViewById(R.id.imgbtn2);
        ImageButton foodbtn=view.findViewById(R.id.imgbtn3);
        ImageButton funbtn=view.findViewById(R.id.imgbtn4);
        ImageButton brainbtn=view.findViewById(R.id.imgbtn5);
        ImageButton technicalbtn=view.findViewById(R.id.imgbtn6);
        ImageButton micbtn=view.findViewById(R.id.imgbtn7);
        ImageButton sportsbtn=view.findViewById(R.id.imgbtn8);
        ImageButton stagebtn=view.findViewById(R.id.imgbtn9);
        colorbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), ColorEvent.class);
                startActivity(intent);

            }
        });
        dancebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), DanceEvent.class);
                startActivity(intent);

            }
        });
        foodbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), FoodEvent.class);
                startActivity(intent);

            }
        });
        funbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(getActivity(), FunEvent.class);
                startActivity(intent);
            }
        });
        brainbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(getActivity(), BrainEvent.class);
                startActivity(intent);
            }
        });
        technicalbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(getActivity(), TechnicalEvent.class);
                startActivity(intent);
            }
        });
        micbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(getActivity(), MicEvent.class);
                startActivity(intent);
            }
        });
        sportsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), SportsEvent.class);
                startActivity(intent);

            }
        });
        stagebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(getActivity(), StageEvent.class);
                startActivity(intent);
            }
        });
        return  view;
    }



}
