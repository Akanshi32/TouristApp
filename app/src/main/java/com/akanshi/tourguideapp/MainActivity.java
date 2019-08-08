package com.akanshi.tourguideapp;

import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.akanshi.tourguideapp.Adapter.ViewPagerAdapter;
import com.akanshi.tourguideapp.Fragments.Fragment1;
import com.akanshi.tourguideapp.Fragments.Fragment2;

public class MainActivity extends AppCompatActivity implements Fragment1.OnFragmentInteractionListener,  Fragment2.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager()));

        TabLayout tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
