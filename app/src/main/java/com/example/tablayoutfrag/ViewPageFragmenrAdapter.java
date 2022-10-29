package com.example.tablayoutfrag;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPageFragmenrAdapter extends FragmentPagerAdapter {
    public ViewPageFragmenrAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        if (position==0){
            return new Callragment();
        }else if (position==1){
            return new ChatFragment();
        }else {
            return new StatusFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position==0){
            return "Calls";
        }
        else if(position==1){
            return "Chats";
        }else {
            return "Status";
        }
    }
}
