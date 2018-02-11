package free.com.soffa_droid;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import free.com.soffa_droid.MainFragment.AddVehicleFragment;
import free.com.soffa_droid.MainFragment.ContactUsFragment;
import free.com.soffa_droid.MainFragment.LoyalityPointFragment;
import free.com.soffa_droid.MainFragment.MyProfileFragment;
import free.com.soffa_droid.MainFragment.ParkingFragment;
import free.com.soffa_droid.MainFragment.SettingsFragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayShowTitleEnabled(false);
        //toolbar.setNavigationIcon(R.drawable.ic_toolbar);
        toolbar.setTitle("");
        toolbar.setSubtitle("");



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        try {
            android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            android.support.v4.app.Fragment fragment = new android.support.v4.app.Fragment();
            int id = item.getItemId();
            switch (id) {
                case R.id.nav_profile:
                    fragment = new MyProfileFragment();
                    break;
                case R.id.nav_parking:
                    fragment = new ParkingFragment();
                    break;
                case R.id.nav_addvehicle:
                    fragment = new AddVehicleFragment();
                    break;
                case R.id.nav_loyalitypoints:
                    fragment = new LoyalityPointFragment();
                    break;
                case R.id.nav_settings:
                    fragment = new SettingsFragment();
                    break;
                case R.id.nav_contactus:
                    fragment = new ContactUsFragment();
                    break;

            }

            ft.replace(R.id.content_frame, fragment)
                    .addToBackStack(null)
                    .commit();


            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
            drawer.closeDrawer(GravityCompat.START);
        }catch (Exception e){
            e.printStackTrace();
        }
        return true;
    }
}
