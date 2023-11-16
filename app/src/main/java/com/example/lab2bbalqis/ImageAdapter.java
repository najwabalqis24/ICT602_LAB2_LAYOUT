package com.example.lab2bbalqis;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

    private Context mContext;

    public Integer[] thumbImages = {
            R.drawable.chefmarah, R.drawable.collete, R.drawable.collete2,
            R.drawable.guesteau, R.drawable.linguini, R.drawable.linguini2,
            R.drawable.linguinipenyapu, R.drawable.linguinipenyapu, R.drawable.emile4,
    };

    public ImageAdapter(Context c) { mContext = c;}
    public int getCount() {return thumbImages.length;}
    public Object getItem(int position){return thumbImages[position];}

    public long getItemId(int position){return 0;}
    public View getView(int position, View convertView, ViewGroup parent){
        ImageView imageView = new ImageView(mContext);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(250,250));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setPadding(8,8,8,8);
        imageView.setImageResource(thumbImages[position]);
        return imageView;
    }
    }


