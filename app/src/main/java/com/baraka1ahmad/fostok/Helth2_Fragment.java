package com.baraka1ahmad.fostok;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.baraka1ahmad.fostok.Adapters.ImageTextAdapter;
import com.baraka1ahmad.fostok.Models.CardItem;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Helth2_Fragment extends Fragment {

    ListView list;
//    Toolbar toolbar;

    public Helth2_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.helth2, container, false);
    }
    public static Helth2_Fragment newInstance(int page, String title) {
        Helth2_Fragment helth2_fragment = new Helth2_Fragment();
        Bundle args = new Bundle();
        args.putInt("someInt2", page);
        args.putString("someTitle2", title);
        helth2_fragment.setArguments(args);
        return helth2_fragment;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {

        list = getView().findViewById(R.id.helth2List);
//        CardPagerAdapter adapter = new CardPagerAdapter();
        List<CardItem> data = new ArrayList<>();


        data.add(new CardItem(R.string.th1, R.string.text_1,R.drawable.th1));
        data.add(new CardItem(R.string.th3, R.string.text_1,R.drawable.th3));
        data.add(new CardItem(R.string.th2, R.string.text_1,R.drawable.th2));
        data.add(new CardItem(R.string.th4, R.string.text_1,R.drawable.th4));
        data.add(new CardItem(R.string.th5, R.string.text_1,R.drawable.th5));
        data.add(new CardItem(R.string.th1, R.string.text_1,R.drawable.th1));
        data.add(new CardItem(R.string.th2, R.string.text_1,R.drawable.th2));
        data.add(new CardItem(R.string.th4, R.string.text_1,R.drawable.th4));
        data.add(new CardItem(R.string.th5, R.string.text_1,R.drawable.th5));
        data.add(new CardItem(R.string.th3, R.string.text_1,R.drawable.th3));
        ImageTextAdapter adapter = new ImageTextAdapter(data,getContext(),R.layout.drs_cell,R.id.likeimg,R.id.liketitle,R.id.likesub);
        list.setAdapter(adapter);


//        toolbar = getView().findViewById(R.id.tool);
//        toolbar.setTitle("المفضلة");
        super.onActivityCreated(savedInstanceState);
    }
}

