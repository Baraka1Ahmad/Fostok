package com.baraka1ahmad.fostok.Models;

/**
 * Created by Ah on 2018-04-19.
 */

public class CardItem {

    private int mTextResource;
    private int mTitleResource;
    private int mImgResource;

    public CardItem(int title, int text, int img) {
        mTitleResource = title;
        mTextResource = text;
        mImgResource = img;
    }

    public int getText() {
        return mTextResource;
    }

    public int getTitle() {
        return mTitleResource;
    }

    public int getImge() {
        return mImgResource;
    }
}
