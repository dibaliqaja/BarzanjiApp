package com.iqbal.barzanji;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class babSatuAdapter extends PagerAdapter {

    private Context mContext;

    babSatuAdapter (Context context) {
        this.mContext = context;
    }

    @Override
    public int getCount() {
        return babSatu.length;
    }

    private int[] babSatu = new int[] {
            R.drawable.a, R.drawable.b, R.drawable.c
    };

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imgView = new ImageView(mContext);
        imgView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imgView.setImageResource(babSatu[position]);
        container.addView(imgView, 0);
        return imgView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ImageView) object);
    }
}
