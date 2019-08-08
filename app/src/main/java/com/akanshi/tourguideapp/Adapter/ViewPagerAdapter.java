package com.akanshi.tourguideapp.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.akanshi.tourguideapp.Fragments.Fragment1;
import com.akanshi.tourguideapp.Fragments.Fragment2;

import java.util.ArrayList;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return new Fragment1(); //ChildFragment1 at position 0
            case 1:
                return new Fragment2(); //ChildFragment2 at position 1

        }
        return null; //does not happen
    }

    @Override
    public int getCount() {
        return 2; //three fragments
    }

    @Override
    public CharSequence getPageTitle(int position) {
        ArrayList<String> fragmentNames = new ArrayList<String>();
        fragmentNames.add("Events");
        fragmentNames.add("Tourist Spots");
        String title = fragmentNames.get(position);
        return title.subSequence(title.lastIndexOf(".") + 1, title.length());
    }
}