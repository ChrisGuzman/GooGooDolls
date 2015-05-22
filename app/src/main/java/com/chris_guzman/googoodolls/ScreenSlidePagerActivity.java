package com.chris_guzman.googoodolls;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;

import com.viewpagerindicator.CirclePageIndicator;


public class ScreenSlidePagerActivity extends FragmentActivity {

    private static final int NUM_PAGES = 3;

    private ViewPager mPager;

    private PagerAdapter mPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_slide);

        mPager = (ViewPager) findViewById(R.id.pager);
        mPagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        mPager.setAdapter(mPagerAdapter);

        CirclePageIndicator titlePageIndicator = (CirclePageIndicator)findViewById(R.id.titles);
        titlePageIndicator.setViewPager(mPager);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_screen_slide, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {

        public ScreenSlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            Fragment frag = new ScreenSlideFragment();

            Bundle bundle = new Bundle();
            switch (position) {
                case 1:
                    bundle.putString("TITLE", "Group Ordering");
                    bundle.putString("MSG", "Four dollar toast gluten-free slow-carb deep v. Tilde sustainable meh hoodie, chambray biodiesel lo-fi mixtape Austin cred Tumblr");
                    bundle.putInt("PIC", R.drawable.tacos);
                    break;
                case 2:
                    bundle.putString("TITLE", "Order Ahead");
                    bundle.putString("MSG", "Meowwww. Hiss at vacuum cleaner stare at the wall, play with food and get confused by dust yet hide at bottom of staircase to trip human knock dis off table");
                    bundle.putInt("PIC", R.drawable.meal);
                    break;
                case 3:
                    bundle.putString("TITLE", "Synergy");
                    bundle.putString("MSG", "Collaboratively administrate empowered markets via plug-and-play networks. Dynamically procrastinate B2C users after installed base benefits");
                    bundle.putInt("PIC", R.drawable.eggs);
                    break;

            }
            bundle.putString("TITLE", "Group Ordering");
            bundle.putString("MSG", "Four dollar toast gluten-free slow-carb deep v. Tilde sustainable meh hoodie, chambray biodiesel lo-fi mixtape Austin cred Tumblr");
            bundle.putInt("PIC", R.drawable.tacos);
            frag.setArguments(bundle);

            return frag;
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }
    }
}
