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
public class Game_Fragment extends Fragment {

    ListView list ;
    Toolbar toolbar;

    public Game_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.game_, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {


        list = getView().findViewById(R.id.gamelist);
//        CardPagerAdapter adapter = new CardPagerAdapter();
        List<CardItem> data = new ArrayList<>();

        data.add(new CardItem(R.string.game1, R.string.text_1,R.drawable.r1));
        data.add(new CardItem(R.string.game2, R.string.text_1,R.drawable.r2));
        data.add(new CardItem(R.string.game3, R.string.text_1,R.drawable.r3));
        data.add(new CardItem(R.string.game4, R.string.text_1,R.drawable.r4));
        data.add(new CardItem(R.string.game1, R.string.text_1,R.drawable.r5));
        data.add(new CardItem(R.string.game2, R.string.text_1,R.drawable.r6));
        data.add(new CardItem(R.string.game3, R.string.text_1,R.drawable.r7));
        data.add(new CardItem(R.string.game4, R.string.text_1,R.drawable.r8));
        data.add(new CardItem(R.string.game1, R.string.text_1,R.drawable.r9));
        data.add(new CardItem(R.string.game2, R.string.text_1,R.drawable.r1));
        data.add(new CardItem(R.string.game3, R.string.text_1,R.drawable.r2));
        data.add(new CardItem(R.string.game4, R.string.text_1,R.drawable.r3));
        data.add(new CardItem(R.string.game1, R.string.text_1,R.drawable.r4));

        ImageTextAdapter adapter = new ImageTextAdapter(data,getContext(),R.layout.game_row,R.id.gameimg,R.id.gametxt,R.id.gametxt2);
        list.setAdapter(adapter);


        toolbar = getView().findViewById(R.id.tool);
        toolbar.setTitle("ألعاب");
        super.onActivityCreated(savedInstanceState);
    }
}
