package com.kalpnil.ksinfotech.tsec.tsec;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kalpnil.ksinfotech.tsec.rsstabs.SlidingTabLayout;
import com.kalpnil.ksinfotech.tsec.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SlidingFragment extends Fragment {
    private SlidingTabLayout mSlidingTabLayout;
    private ViewPager mViewPager;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_sample, container, false);
    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        setUpPager(view);
        setUpTabColor();
    }
    void setUpPager(View view){
        mViewPager = (ViewPager) view.findViewById(R.id.viewpager);
        mViewPager.setAdapter(new TabsPagerAdapter(getActivity()));
        mSlidingTabLayout = (SlidingTabLayout) view.findViewById(R.id.sliding_tabs);
        mSlidingTabLayout.setViewPager(mViewPager);
    }
    void setUpTabColor(){
        mSlidingTabLayout.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {
            @Override
            public int getIndicatorColor(int position) {
                // TODO Auto-generated method stub
                return Color.WHITE;
            }
            @Override
            public int getDividerColor(int position) {
                // TODO Auto-generated method stub
                return Color.WHITE;
            }
        });
    }


}
