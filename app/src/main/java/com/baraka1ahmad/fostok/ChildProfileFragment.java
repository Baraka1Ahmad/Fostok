package com.baraka1ahmad.fostok;


import android.app.Activity;
import android.arch.lifecycle.ReportFragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.ListView;
import android.widget.Toast;

import com.baraka1ahmad.fostok.Adapters.ImageTextAdapter;
import com.baraka1ahmad.fostok.Models.CardItem;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ChildProfileFragment extends Fragment {


    public ChildProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_child_profile, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        CalendarView simpleCalendarView = (CalendarView) getView().findViewById(R.id.simpleCalendarView); // get the reference of CalendarView
        simpleCalendarView.setFirstDayOfWeek(2);
        simpleCalendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView simpleCalendarView, int i, int i1, int i2) {
                ChReportFragment reportFragment = new ChReportFragment();

                FragmentManager fm = myContext.getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.contenar,reportFragment,"reportFragment");
                ft.commit();

            }
        });

        super.onActivityCreated(savedInstanceState);
    }


    private FragmentActivity myContext;

    @Override
    public void onAttach(Activity activity) {
        myContext=(FragmentActivity) activity;
        super.onAttach(activity);
    }
}
