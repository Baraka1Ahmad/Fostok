package com.baraka1ahmad.fostok;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
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
public class Helth1_Fragment extends Fragment {

    ListView list;
//    Toolbar toolbar;
    public Helth1_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.helth1_, container, false);
    }


    public static Helth1_Fragment newInstance(int page, String title) {
        Helth1_Fragment helth1_fragment = new Helth1_Fragment();
        Bundle args = new Bundle();
        args.putInt("someInt1", page);
        args.putString("someTitle1", title);
        helth1_fragment.setArguments(args);
        return helth1_fragment;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {

        list = getView().findViewById(R.id.helthList);
//        CardPagerAdapter adapter = new CardPagerAdapter();
        List<CardItem> data = new ArrayList<>();

        data.add(new CardItem(R.string.doc1, R.string.text_1,R.drawable.dr8));
        data.add(new CardItem(R.string.doc2, R.string.text_1,R.drawable.dr1));
        data.add(new CardItem(R.string.doc3, R.string.text_1,R.drawable.dr2));
        data.add(new CardItem(R.string.doc1, R.string.text_1,R.drawable.dr3));
        data.add(new CardItem(R.string.doc2, R.string.text_1,R.drawable.dr4));
        data.add(new CardItem(R.string.doc3, R.string.text_1,R.drawable.dr5));
        data.add(new CardItem(R.string.doc1, R.string.text_1,R.drawable.dr6));
        data.add(new CardItem(R.string.doc2, R.string.text_1,R.drawable.dr7));
        data.add(new CardItem(R.string.doc3, R.string.text_1,R.drawable.dr8));
        data.add(new CardItem(R.string.doc2, R.string.text_1,R.drawable.dr1));
        data.add(new CardItem(R.string.doc3, R.string.text_1,R.drawable.dr2));
        data.add(new CardItem(R.string.doc1, R.string.text_1,R.drawable.dr3));
        data.add(new CardItem(R.string.doc2, R.string.text_1,R.drawable.dr4));
        data.add(new CardItem(R.string.doc3, R.string.text_1,R.drawable.dr5));
        data.add(new CardItem(R.string.doc1, R.string.text_1,R.drawable.dr6));
        data.add(new CardItem(R.string.doc2, R.string.text_1,R.drawable.dr7));
        data.add(new CardItem(R.string.doc3, R.string.text_1,R.drawable.dr8));

        ImageTextAdapter adapter = new ImageTextAdapter(data,getContext(),R.layout.drs_cell,R.id.likeimg,R.id.liketitle,R.id.likesub);
        list.setAdapter(adapter);


//        toolbar = getView().findViewById(R.id.tool);
//        toolbar.setTitle("المفضلة");
        super.onActivityCreated(savedInstanceState);
    }
}

