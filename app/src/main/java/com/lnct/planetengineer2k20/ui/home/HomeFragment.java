package com.lnct.planetengineer2k20.ui.home;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.lnct.planetengineer2k20.Newevent;
import com.lnct.planetengineer2k20.R;
import com.lnct.planetengineer2k20.RegisterNew;
import com.lnct.planetengineer2k20.ui.events.EventsFragment;

public class HomeFragment extends Fragment {
    ViewFlipper v_flipper;
    ImageButton b1,imgreg;
    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_home, container, false);

        b1=view.findViewById(R.id.imgbtn1);
        imgreg=view.findViewById(R.id.reg1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), Newevent.class);
                startActivity(intent);


            }
        });
        imgreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), RegisterNew.class);
                startActivity(intent);


            }
        });


        int images[] = {R.drawable.f3,R.drawable.f4,R.drawable.f5,R.drawable.f6,R.drawable.f7,R.drawable.f8,R.drawable.f9};
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