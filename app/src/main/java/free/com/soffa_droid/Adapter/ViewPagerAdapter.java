package free.com.soffa_droid.Adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import free.com.soffa_droid.TipsFragments.FirstPageFragment;
import free.com.soffa_droid.TipsFragments.FourthPageFragment;
import free.com.soffa_droid.TipsFragments.SecondPageFragment;
import free.com.soffa_droid.TipsFragments.ThirdPageFragment;

/**
 * Created by wadihhannouch on 12/1/2017.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    Context context;

    public ViewPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment =null;
        switch (position) {
            case 0:
                fragment = Fragment.instantiate(context, FirstPageFragment.class.getName());
                break;
            case 1:
                fragment = Fragment.instantiate(context, SecondPageFragment.class.getName());
                break;

            case 2:
                fragment = Fragment.instantiate(context, ThirdPageFragment.class.getName());
                break;
            case 3:
                fragment = Fragment.instantiate(context, FourthPageFragment.class.getName());
                break;

        }

        return fragment;
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 4;
    }
}