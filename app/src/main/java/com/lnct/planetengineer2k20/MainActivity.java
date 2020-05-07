package com.lnct.planetengineer2k20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        videoView=findViewById(R.id.videoView);
        String VideoPath="android.resource://"+getPackageName()+"/"+R.raw.planet;
        Uri uri=Uri.parse(VideoPath);
        videoView.setVideoURI(uri);
        videoView.start();
        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(MainActivity.this, PlanetEngineer.class);
                startActivity(intent);
            }
        },7500);

    }
}
