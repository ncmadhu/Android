package com.example.navigationdrawer;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MainActivity extends Activity
        implements NavigationDrawerFragment.NavigationDrawerCallbacks {

    /**
     * Fragment managing the behaviors, interactions and presentation of the navigation drawer.
     */
    private NavigationDrawerFragment mNavigationDrawerFragment;

    /**
     * Used to store the last screen title. For use in {@link #restoreActionBar()}.
     */
    private CharSequence mTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        


        mNavigationDrawerFragment = (NavigationDrawerFragment)
                getFragmentManager().findFragmentById(R.id.navigation_drawer);
        mTitle = getTitle();

        // Set up the drawer.
        mNavigationDrawerFragment.setUp(
                R.id.navigation_drawer,
                (DrawerLayout) findViewById(R.id.drawer_layout));
    }

    @Override
    public void onNavigationDrawerItemSelected(int position) {
        // update the main content by replacing fragments
        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.container, PlaceholderFragment.newInstance(position + 1))
                .commit();
    }

    public void onSectionAttached(int number) {
        switch (number) {
            case 1:
                mTitle = getString(R.string.title_section1);
                break;
            case 2:
                mTitle = getString(R.string.title_section2);
                break;
            case 3:
                mTitle = getString(R.string.title_section3);
                break;
        }
    }

    public void restoreActionBar() {
        ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setTitle(mTitle);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if (!mNavigationDrawerFragment.isDrawerOpen()) {
            // Only show items in the action bar relevant to this screen
            // if the drawer is not showing. Otherwise, let the drawer
            // decide what to show in the action bar.
            getMenuInflater().inflate(R.menu.main, menu);
            restoreActionBar();
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
        	
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            
            TabHost tabHost;
            tabHost=(TabHost)rootView.findViewById(android.R.id.tabhost);
            tabHost.setup();
            
            TabSpec spec1=tabHost.newTabSpec("TAB 1");
            spec1.setContent(R.id.tab1);
            spec1.setIndicator("1");
         
         
            TabSpec spec2=tabHost.newTabSpec("TAB 2");
            spec2.setIndicator("2");
            spec2.setContent(R.id.tab2);
         
         
            TabSpec spec3=tabHost.newTabSpec("TAB 3");
            spec3.setContent(R.id.tab3);
            spec3.setIndicator("3");
            
            
            TabSpec spec4=tabHost.newTabSpec("TAB 4");
            spec4.setContent(R.id.tab4);
            spec4.setIndicator("4");
            
            
            TabSpec spec5=tabHost.newTabSpec("TAB 5");
            spec5.setContent(R.id.tab5);
            spec5.setIndicator("5");
            
            TabSpec spec6=tabHost.newTabSpec("TAB 6");
            spec6.setContent(R.id.tab6);
            spec6.setIndicator("6");
            
            TabSpec spec7=tabHost.newTabSpec("TAB 7");
            spec7.setContent(R.id.tab7);
            spec7.setIndicator("7");
            
            TabSpec spec8=tabHost.newTabSpec("TAB 8");
            spec8.setContent(R.id.tab8);
            spec8.setIndicator("8");
            
            TabSpec spec9=tabHost.newTabSpec("TAB 9");
            spec9.setContent(R.id.tab9);
            spec9.setIndicator("9");
            
            tabHost.addTab(spec1);
            tabHost.addTab(spec2);
            tabHost.addTab(spec3);
            tabHost.addTab(spec4);
            tabHost.addTab(spec5);
            tabHost.addTab(spec6);
            tabHost.addTab(spec7);
            tabHost.addTab(spec8);
            tabHost.addTab(spec9);

            return rootView;
        }

        @Override
        public void onAttach(Activity activity) {
            super.onAttach(activity);
            ((MainActivity) activity).onSectionAttached(
                    getArguments().getInt(ARG_SECTION_NUMBER));
        }
    }

}
