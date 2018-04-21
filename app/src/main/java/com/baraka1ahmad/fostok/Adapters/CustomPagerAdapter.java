package com.baraka1ahmad.fostok.Adapters;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.baraka1ahmad.fostok.Models.ModelObject;

/**
 * Created by Ah on 2018-04-12.
 */

public class CustomPagerAdapter extends PagerAdapter {


//    private static int NUM_ITEMS = 3;
//    Context context;
//    public CustomPagerAdapter(FragmentManager fragmentManager) {
//        super(fragmentManager);
//    }
//
//    // Returns total number of pages
//    @Override
//    public int getCount() {
//        return NUM_ITEMS;
//    }
//
//    @Override
//    public boolean isViewFromObject(View view, Object object) {
//        return false;
//    }
//
//    // Returns the fragment to display for that page
//    @Override
//    public Fragment getItem(int position) {
//        switch (position) {
//            case 0: // Fragment # 0 - This will show FirstFragment
//                return Ch_Data_Fragment.newInstance(0, "Page # 1");
//            case 1: // Fragment # 0 - This will show FirstFragment different title
//                return Come_Vaccine_Fragment.newInstance(1, "Page # 2");
//            case 2: // Fragment # 1 - This will show SecondFragment
//                return Last_Vaccine_Fragment.newInstance(2, "Page # 3");
//            default:
//                return null;
//        }
//    }
//
//    // Returns the page title for the top indicator
//    @Override
//    public CharSequence getPageTitle(int position) {
//        return "Page " + position;
//    }
//
//}


    private Context context;

    public CustomPagerAdapter(Context context){
        this.context = context;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ModelObject modelObject = ModelObject.values()[position];
        LayoutInflater inflater = LayoutInflater.from(context);
        ViewGroup layout = (ViewGroup) inflater.inflate(modelObject.getLayoutResId(), container, false);
        container.addView(layout);
        return layout;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public int getCount() {
        return  ModelObject.values().length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        ModelObject customPagerEnum = ModelObject.values()[position];
        return context.getString(customPagerEnum.getTitleResId());
    }
}
