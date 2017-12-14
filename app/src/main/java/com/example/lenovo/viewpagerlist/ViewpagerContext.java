package com.example.lenovo.viewpagerlist;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by lenovo on 2017/12/14.
 */

public class ViewpagerContext extends FragmentPagerAdapter {

    private Context context;
    private ArrayList<String> list_tab;
    private ArrayList<Fragment> list_pag;

    public ViewpagerContext(FragmentManager fm, Context context, ArrayList<String> list_tab, ArrayList<Fragment> list_pag) {
        super(fm);
        this.context = context;
        this.list_tab = list_tab;
        this.list_pag = list_pag;
    }

    public ViewpagerContext(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return list_pag.get(position);
    }

    @Override
    public int getCount() {
        return list_pag.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return list_tab.get(position);
    }
}
