package com.baraka1ahmad.fostok;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import com.baraka1ahmad.fostok.Adapters.CardFragmentPagerAdapter;
import com.baraka1ahmad.fostok.Adapters.CardPagerAdapter;
import com.baraka1ahmad.fostok.Models.CardItem;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainListFragment extends Fragment {


    private FragmentActivity myContext;


    private Button mButton;
    private ViewPager mViewPager;

    TextView more;

    private CardPagerAdapter mCardAdapter;
    private ShadowTransformer mCardShadowTransformer;
    private CardFragmentPagerAdapter mFragmentCardAdapter;
    private ShadowTransformer mFragmentCardShadowTransformer;

    private boolean mShowingFragments = false;

    public MainListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.main_list, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {

        mViewPager = (ViewPager) getView().findViewById(R.id.viewPager);
        mButton = (Button) getView().findViewById(R.id.cardTypeBtn);

        more =  getView().findViewById(R.id.more);


        ((CheckBox) getView().findViewById(R.id.checkBox)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(myContext, "onCheckedChanged", Toast.LENGTH_SHORT).show();
            }
        });
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(myContext, "setOnClickListener", Toast.LENGTH_SHORT).show();
            }
        });

        mCardAdapter = new CardPagerAdapter();
        mCardAdapter.addCardItem(new CardItem(R.string.title_1, R.string.text_1,R.drawable.r4));
        mCardAdapter.addCardItem(new CardItem(R.string.title_2, R.string.text_1,R.drawable.r7));
        mCardAdapter.addCardItem(new CardItem(R.string.title_3, R.string.text_1,R.drawable.r3));
        mCardAdapter.addCardItem(new CardItem(R.string.title_4, R.string.text_1,R.drawable.r5));
        mFragmentCardAdapter = new CardFragmentPagerAdapter(myContext.getSupportFragmentManager(),dpToPixels(2, getContext()));

        mCardShadowTransformer = new ShadowTransformer(mViewPager, mCardAdapter);
        mFragmentCardShadowTransformer = new ShadowTransformer(mViewPager, mFragmentCardAdapter);

        mViewPager.setAdapter(mCardAdapter);
        mViewPager.setPageTransformer(false, mCardShadowTransformer);
        mViewPager.setOffscreenPageLimit(3);

        mViewPager.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(myContext, "cccc", Toast.LENGTH_SHORT).show();
                Profile_Fragment profileFragment = new Profile_Fragment();
                FragmentManager fm = myContext.getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.contenar,profileFragment,"profileFragment");
                ft.commit();

            }
        });

        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LikesFragment likesFragment = new LikesFragment();
                FragmentManager fm = myContext.getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.contenar,likesFragment,"likesFragment");
                ft.commit();
            }
        });

        super.onActivityCreated(savedInstanceState);
    }


    @Override
    public void onAttach(Activity activity) {
        myContext=(FragmentActivity) activity;
        super.onAttach(activity);
    }


    public void onClick(View view) {
        if (!mShowingFragments) {
            mButton.setText("Views");
            mViewPager.setAdapter(mFragmentCardAdapter);
            mViewPager.setPageTransformer(false, mFragmentCardShadowTransformer);
        } else {
            mButton.setText("Fragments");
            mViewPager.setAdapter(mCardAdapter);
            mViewPager.setPageTransformer(false, mCardShadowTransformer);
        }

        mShowingFragments = !mShowingFragments;
    }

    public static float dpToPixels(int dp, Context context) {
        return dp * (context.getResources().getDisplayMetrics().density);
    }


    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        mCardShadowTransformer.enableScaling(b);
        mFragmentCardShadowTransformer.enableScaling(b);
    }

}
