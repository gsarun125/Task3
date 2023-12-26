package com.example.myapplication.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.myapplication.Fragments.ChartsFragment;
import com.example.myapplication.Fragments.GroupFragment;

public class FragmentsAdapter extends FragmentPagerAdapter {

    public FragmentsAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        // Return the corresponding fragment based on the position
        switch (position) {
            case 0:
                return new ChartsFragment(); // Fragment for "CHATS"
            case 1:
                return new GroupFragment(); // Fragment for "GROUP CHARTS"
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        // Return the total number of fragments
        return 2; // Assuming you have two fragments
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        // Return the title for each tab
        switch (position) {
            case 0:
                return "CHATS";
            case 1:
                return "GROUP CHARTS";
            default:
                return null;
        }
    }
}
