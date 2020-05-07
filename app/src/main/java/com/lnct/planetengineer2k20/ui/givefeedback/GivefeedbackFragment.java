package com.lnct.planetengineer2k20.ui.givefeedback;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.lnct.planetengineer2k20.R;

public class GivefeedbackFragment extends Fragment {

    private GivefeedbackViewModel mViewModel;

    public static GivefeedbackFragment newInstance() {
        return new GivefeedbackFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.givefeedback_fragment, container, false);
        Button btn=view.findViewById(R.id.bt_givefeedback);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_SEND);
                intent.setType("message/html");
                intent.putExtra(Intent.EXTRA_EMAIL,new String("planetengineering27@gmail.com" ));
                intent.putExtra(Intent.EXTRA_SUBJECT,"Feedback of App");
                try {
                    startActivity(Intent.createChooser(intent,"Please Select Email"));
                } catch (Exception e) {
                    e.printStackTrace();
                }


            }
        });

        return view;
    }


}
