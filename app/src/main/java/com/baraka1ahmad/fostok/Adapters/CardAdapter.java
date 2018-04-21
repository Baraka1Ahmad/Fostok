package com.baraka1ahmad.fostok.Adapters;

/**
 * Created by Ah on 2018-04-19.
 */
import android.support.v7.widget.CardView;

public interface CardAdapter {

    int MAX_ELEVATION_FACTOR = 8;

    float getBaseElevation();

    CardView getCardViewAt(int position);

    int getCount();
}