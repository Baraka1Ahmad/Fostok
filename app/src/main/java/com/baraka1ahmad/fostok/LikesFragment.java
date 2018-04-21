package com.baraka1ahmad.fostok;


import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.baraka1ahmad.fostok.Adapters.CardPagerAdapter;
import com.baraka1ahmad.fostok.Adapters.ImageTextAdapter;
import com.baraka1ahmad.fostok.Models.CardItem;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class LikesFragment extends Fragment {

    ListView list ;
    Toolbar toolbar;
    CardView cardView;
    public LikesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.likes, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        
        list = getView().findViewById(R.id.likeslist);
        cardView = getView().findViewById(R.id.likeCardView);
//        CardPagerAdapter adapter = new CardPagerAdapter();
        List<CardItem> data = new ArrayList<>();

        data.add(new CardItem(R.string.title_1, R.string.text_1,R.drawable.r3));
        data.add(new CardItem(R.string.title_2, R.string.text_1,R.drawable.r7));
        data.add(new CardItem(R.string.title_3, R.string.text_1,R.drawable.r3));
        data.add(new CardItem(R.string.title_4, R.string.text_1,R.drawable.r4));
        data.add(new CardItem(R.string.title_1, R.string.text_1,R.drawable.r5));
        data.add(new CardItem(R.string.title_2, R.string.text_1,R.drawable.r6));
        data.add(new CardItem(R.string.title_3, R.string.text_1,R.drawable.r7));
        data.add(new CardItem(R.string.title_4, R.string.text_1,R.drawable.r8));
        data.add(new CardItem(R.string.title_1, R.string.text_1,R.drawable.r9));
        data.add(new CardItem(R.string.title_2, R.string.text_1,R.drawable.r3));
        data.add(new CardItem(R.string.title_3, R.string.text_1,R.drawable.r7));
        data.add(new CardItem(R.string.title_4, R.string.text_1,R.drawable.r3));
        data.add(new CardItem(R.string.title_4, R.string.text_1,R.drawable.r4));

        ImageTextAdapter adapter = new ImageTextAdapter(data,getContext(),R.layout.likes_list_cell,R.id.likeimg,R.id.liketitle,R.id.likesub);
        list.setAdapter(adapter);



        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getContext(), "cccc", Toast.LENGTH_SHORT).show();
                Profile_Fragment profileFragment = new Profile_Fragment();
                FragmentManager fm = myContext.getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.contenar,profileFragment,"profileFragment");
                ft.commit();
            }
        });

//        cardView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Toast.makeText(getContext(), "cardView", Toast.LENGTH_SHORT).show();
//                Profile_Fragment profileFragment = new Profile_Fragment();
//                FragmentManager fm = myContext.getSupportFragmentManager();
//                FragmentTransaction ft = fm.beginTransaction();
//                ft.replace(R.id.contenar,profileFragment,"profileFragment");
//                ft.commit();
//            }
//        });
        toolbar = getView().findViewById(R.id.tool);
        toolbar.setTitle("Look for a kindergarten");
        super.onActivityCreated(savedInstanceState);
    }


    private FragmentActivity myContext;

    @Override
    public void onAttach(Activity activity) {
        myContext=(FragmentActivity) activity;
        super.onAttach(activity);
    }
}
