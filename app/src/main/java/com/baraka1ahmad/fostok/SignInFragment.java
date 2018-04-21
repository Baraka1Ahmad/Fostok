package com.baraka1ahmad.fostok;


import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SignInFragment extends Fragment {

ImageButton login;
TextView goSingUp;
    FragmentActivity myContext;

    public SignInFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.sign_in, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        login = getView().findViewById(R.id.singInBtn);
        goSingUp = getView().findViewById(R.id.goSingUp);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            MainListFragment mainListFragment = new MainListFragment();
                fragmentReblaseing(mainListFragment,"mainListFragment");
            }
        });

        goSingUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SignInFragment signInFragment = new SignInFragment();
                fragmentReblaseing(signInFragment,"mainListFragment");
            }
        });


        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onAttach(Context context) {
        myContext = (FragmentActivity)context;
        super.onAttach(context);
    }

    public void fragmentReblaseing(Fragment fragment, String tag){

        FragmentManager fm = myContext.getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.contenar,fragment,tag);
        ft.commit();
    }

}
