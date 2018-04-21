package com.baraka1ahmad.fostok;


import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.baraka1ahmad.fostok.Adapters.CustomPagerAdapter;
import com.baraka1ahmad.fostok.Adapters.PagerAdapter;
import com.ogaclejapan.smarttablayout.SmartTabLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class PagerFragment extends Fragment {


    ViewPager vp;
    FragmentPagerAdapter adapterViewPager;
    private FragmentActivity myContext;

    public PagerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pager, container, false);
    }

    @Override
    public void onAttach(Activity activity) {
        myContext=(FragmentActivity) activity;
        super.onAttach(activity);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {

        TabLayout tabLayout = (TabLayout) getView().findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("Psychological plan"));
        tabLayout.addTab(tabLayout.newTab().setText("Academic Plan"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = (ViewPager) getView().findViewById(R.id.viewpager);
        final PagerAdapter adapter = new PagerAdapter
                (myContext.getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        super.onActivityCreated(savedInstanceState);
    }

    ////////

//        vp = getView().findViewById(R.id.viewpager);
//
//        vp.setAdapter(new CustomPagerAdapter(getContext()));
//
//        SmartTabLayout viewPagerTab = getView().findViewById(R.id.viewpagertab);
//        viewPagerTab.setViewPager(vp);
//
//        adapterViewPager = new MyPagerAdapter(myContext.getSupportFragmentManager());
//        vp.setAdapter(adapterViewPager);
//        vp.setCurrentItem(0);


    }
//
//    public static class MyPagerAdapter extends FragmentPagerAdapter {
//        private static int NUM_ITEMS = 2;
//
//        public MyPagerAdapter(FragmentManager fragmentManager) {
//            super(fragmentManager);
//        }
//
//        // Returns total number of pages
//        @Override
//        public int getCount() {
//            return NUM_ITEMS;
//        }
//
//        // Returns the fragment to display for that page
//        @Override
//        public Fragment getItem(int position) {
//            switch (position) {
//                case 0: // Fragment # 0 - This will show FirstFragment
//                    return Helth1_Fragment.newInstance(0, "Page # 1");
//                case 1: // Fragment # 0 - This will show FirstFragment different title
//                    return Helth2_Fragment.newInstance(1, "Page # 2");
//                default:
//                    return null;
//            }
//        }
//
//        // Returns the page title for the top indicator
//        @Override
//        public CharSequence getPageTitle(int position) {
//            return "Page " + position;
//        }
//
//    }

