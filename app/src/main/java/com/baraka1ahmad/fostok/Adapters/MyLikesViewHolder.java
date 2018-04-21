package com.baraka1ahmad.fostok.Adapters;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.baraka1ahmad.fostok.R;

/**
 * Created by Ah on 2018-04-21.
 */

public class MyLikesViewHolder extends RecyclerView.ViewHolder {
    public TextView title, count;
    public ImageView thumbnail, overflow;
    public CardView cardView;

    public MyLikesViewHolder(View view) {
        super(view);
        title = (TextView) view.findViewById(R.id.liketitle);
        thumbnail = (ImageView) view.findViewById(R.id.likeimg);
        cardView = (CardView) view.findViewById(R.id.likeCardView);
    }
}
