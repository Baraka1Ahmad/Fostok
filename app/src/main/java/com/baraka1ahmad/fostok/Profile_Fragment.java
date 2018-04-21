package com.baraka1ahmad.fostok;


import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v4.widget.NestedScrollView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Profile_Fragment extends Fragment {

    NestedScrollView scrl;
    TextView tv;
    ImageView schead;
    public Profile_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.profile_, container, false);
    }

    public void onActivityCreated(@Nullable Bundle savedInstanceState) {

        scrl = getView().findViewById(R.id.nscrol);
        tv = getView().findViewById(R.id.rname);
        schead = getView().findViewById(R.id.schead
        );
//        tv.setText("ddd");
//        tv.setText(scrollX+"\t"+scrollY+"\t"+oldScrollX+"\t"+oldScrollY+"\t");
//        Toast.makeText(getContext(), "ddd", Toast.LENGTH_SHORT).show();
        scrl.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() {
            @Override
            public void onScrollChange(NestedScrollView v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {

//                tv.setText(scrollX+"\t"+scrollY+"\t"+oldScrollX+"\t"+oldScrollY+"\t");
                if (scrollX >=0 && scrollX <=100){
                    schead.setVisibility(View.INVISIBLE);
                }
else
                if (scrollX ==0){
                    schead.setVisibility(View.VISIBLE);
                }

//                if (scrollY > oldScrollY) {
//                    Toast.makeText(getContext(), "Scroll DOWN", Toast.LENGTH_SHORT).show();
////                    Log.i(TAG, "Scroll DOWN");
//                }
//                if (scrollY < oldScrollY) {
//                    Toast.makeText(getContext(), "Scroll UP", Toast.LENGTH_SHORT).show();
////                    Log.i(TAG, "Scroll UP");
//                }
//
//                if (scrollY == 0) {
//                    Toast.makeText(getContext(), "TOP SCROLL", Toast.LENGTH_SHORT).show();
////                    Log.i(TAG, "TOP SCROLL");
//                }
//
//                if (scrollY == ( v.getChildAt(0).getMeasuredHeight() - v.getMeasuredHeight() )) {
//                    Toast.makeText(getContext(), "BOTTOM SCROLL", Toast.LENGTH_SHORT).show();
////                    Log.i(TAG, "BOTTOM SCROLL");
//                }
            }
        });

        super.onActivityCreated(savedInstanceState);
    }
}
