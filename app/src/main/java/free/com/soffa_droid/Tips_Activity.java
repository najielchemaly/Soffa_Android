package free.com.soffa_droid;

import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import free.com.soffa_droid.Adapter.ViewPagerAdapter;

public class Tips_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips_);





        try {
            ViewPager viewPager = (ViewPager) findViewById(R.id.tipsViewPager);
            ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager(), this);
            viewPager.setAdapter(adapter);
            TabLayout tipsTabLayout = (TabLayout) findViewById(R.id.tipsTabLayout);
            tipsTabLayout.setupWithViewPager(viewPager);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
