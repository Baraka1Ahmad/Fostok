package com.baraka1ahmad.fostok.Models;


import com.baraka1ahmad.fostok.R;

/**
 * Created by Ah on 2018-04-12.
 */

public enum ModelObject {


    BLUE(R.string.tap1, R.layout.helth1_),
    RED(R.string.tap2, R.layout.helth2);


    private int mTitleResId;
    private int mLayoutResId;

    ModelObject(int titleResId, int layoutResId) {
        mTitleResId = titleResId;
        mLayoutResId = layoutResId;
    }

    public int getTitleResId() {
        return mTitleResId;
    }

    public int getLayoutResId() {
        return mLayoutResId;
    }
}
