package com.lnct.planetengineer2k20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Newevent extends AppCompatActivity {

    ImageButton colorbtn, dancebtn, foodbtn, funbtn, brainbtn, technicalbtn, micbtn, sportsbtn, stagebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newevent);

        colorbtn=findViewById(R.id.imgbtn1);
        dancebtn=findViewById(R.id.imgbtn2);
        foodbtn=findViewById(R.id.imgbtn3);
        funbtn=findViewById(R.id.imgbtn4);
        brainbtn=findViewById(R.id.imgbtn5);
        technicalbtn=findViewById(R.id.imgbtn6);
        micbtn=findViewById(R.id.imgbtn7);
        sportsbtn=findViewById(R.id.imgbtn8);
        stagebtn=findViewById(R.id.imgbtn9);
        colorbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Newevent.this, ColorEvent.class);
                startActivity(intent);

            }
        });
        dancebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Newevent.this, DanceEvent.class);
                startActivity(intent);

            }
        });
        foodbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Newevent.this, FoodEvent.class);
                startActivity(intent);

            }
        });
        funbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Newevent.this, FunEvent.class);
                startActivity(intent);
            }
        });
        brainbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Newevent.this, BrainEvent.class);
                startActivity(intent);
            }
        });
        technicalbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Newevent.this, TechnicalEvent.class);
                startActivity(intent);
            }
        });
        micbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Newevent.this, MicEvent.class);
                startActivity(intent);
            }
        });
        sportsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Newevent.this, SportsEvent.class);
                startActivity(intent);

            }
        });
        stagebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Newevent.this, StageEvent.class);
                startActivity(intent);
            }
        });
    }
}
