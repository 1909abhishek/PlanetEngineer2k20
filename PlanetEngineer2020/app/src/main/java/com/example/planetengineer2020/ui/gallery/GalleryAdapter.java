package com.lnct.planetengineer2020.ui.gallery;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import androidx.fragment.app.FragmentActivity;

import com.lnct.planetengineer2020.R;

public class GalleryAdapter extends BaseAdapter {
    private FragmentActivity context;
    public GalleryAdapter(FragmentActivity context){
        this.context=context;

    }


    @Override
    public int getCount() {
        return galleryArray.length;
    }

    @Override
    public Object getItem(int position) {
        return galleryArray[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;

        if (convertView == null) {
            imageView = new ImageView(context);
            imageView.setLayoutParams(new GridView.LayoutParams(400, 400));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(20, 20, 20, 20);
        }
        else
        {
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(galleryArray[position]);
        return imageView;

    }
    public int[] galleryArray={
            R.drawable.lnct,
            R.drawable.lnct1,
            R.drawable.l10,
            R.drawable.l2,
            R.drawable.l2,
            R.drawable.l6,
            R.drawable.l7,
            R.drawable.l8,
            R.drawable.l9,
            R.drawable.l10,
            R.drawable.l12,
            R.drawable.l3,
            R.drawable.l4,
            R.drawable.l14,
            R.drawable.l15,
            R.drawable.p,
            R.drawable.p1,
            R.drawable.p2,
            R.drawable.p3,
            R.drawable.p4,
            R.drawable.p5,
            R.drawable.p6,
            R.drawable.p7,
            R.drawable.p8,
            R.drawable.p9,
            R.drawable.p10,
            R.drawable.p11,
            R.drawable.p14,
            R.drawable.p13,
            R.drawable.p15,
            R.drawable.p16,

    };

}
