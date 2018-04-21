package com.baraka1ahmad.fostok;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
//                    mTextMessage.setText(R.string.title_home);
                    MainListFragment mainList = new MainListFragment();
                    FragmentManager fm = getSupportFragmentManager();
                    FragmentTransaction ft = fm.beginTransaction();
                    ft.replace(R.id.contenar,mainList,"mainList");
                    ft.addToBackStack("mainList");
                    ft.commit();

                    return true;
                case R.id.navigation_dashboard:
                    LikesFragment likesFragment = new LikesFragment();
                    FragmentManager fm1 = getSupportFragmentManager();
                    FragmentTransaction ft1 = fm1.beginTransaction();
                    ft1.replace(R.id.contenar,likesFragment,"likesFragment");
                    ft1.addToBackStack("likesFragment");
                    ft1.commit();

                    return true;
                case R.id.navigation_notifications:
//                    Game_Fragment gameFragment = new Game_Fragment();
                    PagerFragment pagerFragment = new PagerFragment();
                    FragmentManager fm2 = getSupportFragmentManager();
                    FragmentTransaction ft2 = fm2.beginTransaction();
                    ft2.replace(R.id.contenar,pagerFragment,"pagerFragment");
                    ft2.addToBackStack("pagerFragment");
                    ft2.commit();
                    return true;
                case R.id.navigation_settings:
//                    Profile_Fragment profileFragment = new Profile_Fragment();
                    ChildListFragment profileFragment = new ChildListFragment();
                    FragmentManager fm3 = getSupportFragmentManager();
                    FragmentTransaction ft3 = fm3.beginTransaction();
                    ft3.replace(R.id.contenar,profileFragment,"profileFragment");
                    ft3.addToBackStack("profileFragment");
                    ft3.commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        MainListFragment mainList = new MainListFragment();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.contenar,mainList);
        ft.commit();
    }

    public void fragmentReblaseing(Fragment fragment,String tag){

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.contenar,fragment,tag);
        ft.addToBackStack(tag);
        ft.commit();
    }

    public void thelikeClick(View view){
                    Profile_Fragment profileFragment = new Profile_Fragment();
        fragmentReblaseing(profileFragment,"profileFragment");
    }

    public void chClick(View view) {
    ChildProfileFragment childProfileFragment = new ChildProfileFragment();
        fragmentReblaseing(childProfileFragment,"childProfileFragment");
    }

    public void drsClick(View view) {
        Dr_Profile_Fragment drProfileFragment = new Dr_Profile_Fragment();
        fragmentReblaseing(drProfileFragment,"drProfileFragment");
    }

    public void ChChat(View view) {
        ChatFragment chatFragment = new ChatFragment();
        fragmentReblaseing(chatFragment,"chatFragmen");
    }

}
