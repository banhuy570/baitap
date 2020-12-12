package com.huy.thecoffeehouse;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;


public class CuaHangFragment extends Fragment {

    View myFragment;
    private TabLayout mTabLayout;
    private ViewPager mviewPager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        myFragment = inflater.inflate(R.layout.fragment_cuahang, container, false);

        return myFragment;
    }
}