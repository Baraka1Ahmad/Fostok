package com.baraka1ahmad.fostok.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.baraka1ahmad.fostok.Helth1_Fragment;
import com.baraka1ahmad.fostok.Helth2_Fragment;

/**
 * Created by Ah on 2018-04-21.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                Helth1_Fragment tab1 = new Helth1_Fragment();
                return tab1;
            case 1:
                Helth2_Fragment tab2 = new Helth2_Fragment();
                return tab2;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}