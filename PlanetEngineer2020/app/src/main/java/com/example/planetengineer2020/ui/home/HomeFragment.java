package com.lnct.planetengineer2020.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.lnct.planetengineer2020.R;
import com.lnct.planetengineer2020.ui.events.EventsFragment;

public class HomeFragment extends Fragment {
    ViewFlipper v_flipper;
    ImageButton b1;
    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_home, container, false);

        b1=view.findViewById(R.id.imgbtn1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventsFragment eventsFragment=new EventsFragment();
                FragmentManager manager=getFragmentManager();
                manager.beginTransaction().replace(R.id.nav_host_fragment,eventsFragment,eventsFragment.getTag()).commit();

            }
        });

        int images[] = {R.drawable.f1,R.drawable.f2,R.drawable.f3,R.drawable.f4};
        v_flipper=view.findViewById(R.id.v_flipper);
        for (int image:images)
        {
            flipperImages(image);

        }

        return view;

    }
    public void flipperImages(int image)
    {
        ImageView imageView=new ImageView(getContext());

        imageView.setBackgroundResource(image);
        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(3000);
        v_flipper.setAutoStart(true);
        v_flipper.setInAnimation(getActivity(),android.R.anim.slide_in_left);
        v_flipper.setOutAnimation(getActivity(),android.R.anim.slide_out_right);

    }


}