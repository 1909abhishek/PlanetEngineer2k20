package com.lnct.planetengineer2020.ui.gallery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.lnct.planetengineer2020.R;

public class SingleView extends AppCompatActivity {
ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_view);
        getActionBar().hide();
        getActionBar().setTitle("Gallery");
        Intent i=getIntent();
        int position=i.getExtras().getInt("id");
        GalleryAdapter galleryAdapter=new GalleryAdapter(this);
        imageView=findViewById(R.id.gallery_image);
        imageView.setImageResource(galleryAdapter.galleryArray[position]);
    }
}
