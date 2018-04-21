package com.baraka1ahmad.fostok;


import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.baraka1ahmad.fostok.Adapters.ImageTextAdapter;
import com.baraka1ahmad.fostok.Models.CardItem;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ChildListFragment extends Fragment {

    ListView list ;
    Toolbar toolbar;


    public ChildListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_child_list, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {



        list = getView().findViewById(R.id.chlist);
//        CardPagerAdapter adapter = new CardPagerAdapter();
        List<CardItem> data = new ArrayList<>();

        data.add(new CardItem(R.string.game1, R.string.text_1,R.drawable.r1));
        data.add(new CardItem(R.string.game2, R.string.text_1,R.drawable.ch));
        data.add(new CardItem(R.string.game3, R.string.text_1,R.drawable.ch2));

        ImageTextAdapter adapter = new ImageTextAdapter(data,getContext(),R.layout.ch_cell,R.id.profile_image,R.id.chtitle,R.id.sub);
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

        toolbar = getView().findViewById(R.id.tool);
        toolbar.setTitle("My sons' profiles");

        super.onActivityCreated(savedInstanceState);
    }

    private FragmentActivity myContext;

    @Override
    public void onAttach(Activity activity) {
        myContext=(FragmentActivity) activity;
        super.onAttach(activity);
    }
}
