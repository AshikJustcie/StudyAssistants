package com.ashik.justice.developer.studyassistants;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.ashik.justice.developer.studyassistants.Fragmnet_BNavigation.Favourite_Fragment;
import com.ashik.justice.developer.studyassistants.Fragmnet_BNavigation.Home_Fragment;
import com.ashik.justice.developer.studyassistants.Fragmnet_BNavigation.Search_Fragment;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.main_activity );
        Toolbar toolbar = (Toolbar) findViewById( R.id.toolbar );
        setSupportActionBar( toolbar );

        DrawerLayout drawer = (DrawerLayout) findViewById( R.id.drawer_layout );
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close );
        drawer.addDrawerListener( toggle );
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById( R.id.nav_view );
        navigationView.setNavigationItemSelectedListener( this );

        BottomNavigationView bottomNavigationView = findViewById( R.id.bottom_nav );
        bottomNavigationView.setOnNavigationItemSelectedListener( navListner );
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        switch (id) {
            case R.id.NFirst:
                break;

            case R.id.NSecond:
                break;

            case R.id.NThird:
                break;

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer( GravityCompat.START);
        return true;
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListner  = new
            BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedFragment = null;

            switch (item.getItemId()) {
                case R.id.nav_home:
                    selectedFragment = new Home_Fragment();
                    break;

                case R.id.nav_fav:
                    selectedFragment = new Favourite_Fragment();
                    break;

                case R.id.nav_search:
                    selectedFragment = new Search_Fragment();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace( R.id.fragment_container, selectedFragment).commit();
            return true;
        }
    };

}
