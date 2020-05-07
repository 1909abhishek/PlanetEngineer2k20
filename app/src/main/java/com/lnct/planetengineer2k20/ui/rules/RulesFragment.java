package com.lnct.planetengineer2k20.ui.rules;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.lnct.planetengineer2k20.Admadrule;
import com.lnct.planetengineer2k20.CodeRule;
import com.lnct.planetengineer2k20.Extempore;
import com.lnct.planetengineer2k20.Gameattire;
import com.lnct.planetengineer2k20.Generalrule;
import com.lnct.planetengineer2k20.Grooverule;
import com.lnct.planetengineer2k20.Incric;
import com.lnct.planetengineer2k20.Kavisamelan;
import com.lnct.planetengineer2k20.Lanrule;
import com.lnct.planetengineer2k20.Lncthaat;
import com.lnct.planetengineer2k20.Mehendirule;
import com.lnct.planetengineer2k20.Moherangrule;
import com.lnct.planetengineer2k20.Nailrule;
import com.lnct.planetengineer2k20.Paperrule;
import com.lnct.planetengineer2k20.R;
import com.lnct.planetengineer2k20.Rangshrijanrule;
import com.lnct.planetengineer2k20.RuleE1;
import com.lnct.planetengineer2k20.Shakerule;
import com.lnct.planetengineer2k20.Slingshotrule;
import com.lnct.planetengineer2k20.Snacksrule;
import com.lnct.planetengineer2k20.Splashrule;
import com.lnct.planetengineer2k20.Surrule;
import com.lnct.planetengineer2k20.Technicalrule;
import com.lnct.planetengineer2k20.Tugwarrule;
import com.lnct.planetengineer2k20.Welcomehogwart;
import com.lnct.planetengineer2k20.Youthrule;

public class RulesFragment extends Fragment {

    private RulesViewModel mViewModel;

    public static RulesFragment newInstance() {
        return new RulesFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.rules_fragment, container, false);
        Button rb1,rb2,rb3,rb4,rb5,rb6,rb7,rb8,rb9,rb10,rb11,rb12,rb13,rb14,rb15,rb16,rb17,rb18,rb19,rb20,rb21,rb22,rb23,rb24,rb25,rb26,rb27,rb28,rb29,rb30,rb31,rb32,rb33,rb34,rb35,rb36,rb37,rb38,rb39,rb40,rb41,rb42,rb43,rb44,rb45,rb46,rb47,rb48,rb49,rb50,rb51,rb52,rb53,rb54,rb55,rb56,rb57,rb58,rb59,rb60;
        rb1=view.findViewById(R.id.t1);
        rb2=view.findViewById(R.id.t2);
        rb3=view.findViewById(R.id.t3);
        rb4=view.findViewById(R.id.t4);
        rb5=view.findViewById(R.id.t5);
        rb6=view.findViewById(R.id.t6);
        rb7=view.findViewById(R.id.t7);
        rb8=view.findViewById(R.id.t8);
        rb9=view.findViewById(R.id.t9);
        rb10=view.findViewById(R.id.t10);
        rb11=view.findViewById(R.id.t11);
        rb12=view.findViewById(R.id.t12);
        rb13=view.findViewById(R.id.t13);
        rb14=view.findViewById(R.id.t14);
        rb15=view.findViewById(R.id.t15);
        rb16=view.findViewById(R.id.t16);
        rb17=view.findViewById(R.id.t17);
        rb18=view.findViewById(R.id.t18);
        rb19=view.findViewById(R.id.t19);
        rb20=view.findViewById(R.id.t20);
        rb21=view.findViewById(R.id.t21);
        rb22=view.findViewById(R.id.t22);
        rb23=view.findViewById(R.id.t23);
        rb24=view.findViewById(R.id.t24);
        rb25=view.findViewById(R.id.t25);
        rb26=view.findViewById(R.id.t26);
        rb27=view.findViewById(R.id.t27);
        rb28=view.findViewById(R.id.t28);
        rb29=view.findViewById(R.id.t29);
        rb30=view.findViewById(R.id.t30);
        rb31=view.findViewById(R.id.t31);
        rb32=view.findViewById(R.id.t32);
        rb33=view.findViewById(R.id.t33);
        rb34=view.findViewById(R.id.t34);
        rb35=view.findViewById(R.id.t35);
        rb36=view.findViewById(R.id.t36);
        rb37=view.findViewById(R.id.t37);
        rb38=view.findViewById(R.id.t38);
        rb39=view.findViewById(R.id.t39);
        rb40=view.findViewById(R.id.t40);
        rb41=view.findViewById(R.id.t41);
        rb42=view.findViewById(R.id.t42);
        rb43=view.findViewById(R.id.t43);
        rb44=view.findViewById(R.id.t44);
        rb45=view.findViewById(R.id.t45);
        rb46=view.findViewById(R.id.t46);
        rb47=view.findViewById(R.id.t47);
        rb48=view.findViewById(R.id.t48);
        rb49=view.findViewById(R.id.t49);
        rb50=view.findViewById(R.id.t50);
        rb51=view.findViewById(R.id.t51);
        rb52=view.findViewById(R.id.t52);
        rb53=view.findViewById(R.id.t53);
        rb54=view.findViewById(R.id.t54);
        rb55=view.findViewById(R.id.t55);
        rb56=view.findViewById(R.id.t56);
        rb57=view.findViewById(R.id.t57);
        rb58=view.findViewById(R.id.t58);
        rb59=view.findViewById(R.id.t59);
        rb60=view.findViewById(R.id.t60);
        rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent=new Intent(getActivity(), RuleE1.class);
               startActivity(intent);
            }
        });
        rb47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), Admadrule.class);
                startActivity(intent);
            }
        });
        rb27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), CodeRule.class);
                startActivity(intent);
            }
        });
        rb28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), Lanrule.class);
                startActivity(intent);
            }
        });
        rb9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), Grooverule.class);
                startActivity(intent);
            }
        });
        rb19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), Technicalrule.class);
                startActivity(intent);
            }
        });
        rb41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), Incric.class);
                startActivity(intent);
            }
        });
        rb52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), Gameattire.class);
                startActivity(intent);
            }
        });
        rb10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), Shakerule.class);
                startActivity(intent);
            }
        });
        rb13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), Welcomehogwart.class);
                startActivity(intent);
            }
        });
        rb31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), Kavisamelan.class);
                startActivity(intent);
            }
        });
        rb12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), Lncthaat.class);
                startActivity(intent);
            }
        });
        rb15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), Snacksrule.class);
                startActivity(intent);
            }
        });
        rb33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), Surrule.class);
                startActivity(intent);
            }
        });
        rb22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), Generalrule.class);
                startActivity(intent);
            }
        });
        rb38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), Extempore.class);
                startActivity(intent);
            }
        });
        rb24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), Paperrule.class);
                startActivity(intent);
            }
        });
        rb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), Splashrule.class);
                startActivity(intent);
            }
        });
        rb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), Rangshrijanrule.class);
                startActivity(intent);
            }
        });
        rb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), Mehendirule.class);
                startActivity(intent);
            }
        });
        rb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), Moherangrule.class);
                startActivity(intent);
            }
        });
        rb6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), Nailrule.class);
                startActivity(intent);
            }
        });
        rb51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), Youthrule.class);
                startActivity(intent);
            }
        });
        rb45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), Tugwarrule.class);
                startActivity(intent);
            }
        });
        rb7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), RuleE1.class);
                startActivity(intent);
            }
        });
        rb8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), RuleE1.class);
                startActivity(intent);
            }
        });
        rb11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), RuleE1.class);
                startActivity(intent);
            }
        });
        rb14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), RuleE1.class);
                startActivity(intent);
            }
        });
        rb16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), RuleE1.class);
                startActivity(intent);
            }
        });
        rb17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), RuleE1.class);
                startActivity(intent);
            }
        });
        rb18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), RuleE1.class);
                startActivity(intent);
            }
        });
        rb20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), RuleE1.class);
                startActivity(intent);
            }
        });
        rb21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), RuleE1.class);
                startActivity(intent);
            }
        });
        rb23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), RuleE1.class);
                startActivity(intent);
            }
        });
        rb25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), RuleE1.class);
                startActivity(intent);
            }
        });
        rb26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), RuleE1.class);
                startActivity(intent);
            }
        });
        rb29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), RuleE1.class);
                startActivity(intent);
            }
        });
        rb30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), RuleE1.class);
                startActivity(intent);
            }
        });
        rb32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), RuleE1.class);
                startActivity(intent);
            }
        });
        rb34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), RuleE1.class);
                startActivity(intent);
            }
        });
        rb35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), RuleE1.class);
                startActivity(intent);
            }
        });
        rb36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), RuleE1.class);
                startActivity(intent);
            }
        });
        rb37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), RuleE1.class);
                startActivity(intent);
            }
        });
        rb39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), RuleE1.class);
                startActivity(intent);
            }
        });
        rb40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), RuleE1.class);
                startActivity(intent);
            }
        });
        rb42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), RuleE1.class);
                startActivity(intent);
            }
        });
        rb43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), RuleE1.class);
                startActivity(intent);
            }
        });
        rb44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), RuleE1.class);
                startActivity(intent);
            }
        });
        rb46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), RuleE1.class);
                startActivity(intent);
            }
        });
        rb48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), RuleE1.class);
                startActivity(intent);
            }
        });
        rb49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), RuleE1.class);
                startActivity(intent);
            }
        });
        rb50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), RuleE1.class);
                startActivity(intent);
            }
        });
        rb52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), RuleE1.class);
                startActivity(intent);
            }
        });
        rb53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), Slingshotrule.class);
                startActivity(intent);
            }
        });
        rb54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), RuleE1.class);
                startActivity(intent);
            }
        });
        rb55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), RuleE1.class);
                startActivity(intent);
            }
        });
        rb56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), RuleE1.class);
                startActivity(intent);
            }
        });
        rb57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), RuleE1.class);
                startActivity(intent);
            }
        });
        rb58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), RuleE1.class);
                startActivity(intent);
            }
        });
        rb59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), RuleE1.class);
                startActivity(intent);
            }
        });
        rb60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), RuleE1.class);
                startActivity(intent);
            }
        });


        return view;
    }
}
