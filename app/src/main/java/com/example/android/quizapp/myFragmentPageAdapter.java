package com.example.android.quizapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by abdulrahmanaminu on 9/2/17.
 */

public class myFragmentPageAdapter extends FragmentPagerAdapter {

   private Context mContext;


    public myFragmentPageAdapter (Context context, FragmentManager fm){
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new Civil();
        } else if (position == 1) {
            return new Electrical();
        } else {
            return new Mechanical();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_civil);
        } else if (position == 1) {
            return mContext.getString(R.string.category_electrical);
        } else {
            return mContext.getString(R.string.category_mechanical);
        }
    }
}
