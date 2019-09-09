package com.arent.ui.main;

import android.os.Bundle;

import com.arent.App;
import com.arent.ui.main.mainfragment.MainFragment;
import com.arent.ui.main.myvehiclesfragment.MyVehicles;
import com.arent.ui.main.myvehiclesfragment.initial.MyVehiclesInitialFragment;
import com.arent.ui.main.profilefragment.ProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.MenuItem;

import com.arent.R;

public class MainActivity extends AppCompatActivity {

    private Fragment fragment;
    private MainFragment mainFragment;
    private MyVehicles myVehicles;
    private MyVehiclesInitialFragment myVehiclesInitialFragment;
    private ProfileFragment profileFragment;
    public BottomNavigationView navView;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_main_fragment:
                    fragment = mainFragment;
                    break;
                case R.id.navigation_my_vehicles_fragment:
                    if (App.isLogged) fragment = myVehicles;
                    else fragment = myVehiclesInitialFragment;
                    break;
                case R.id.navigation_my_profile_fragment:
                    fragment = profileFragment;
                    break;
            }
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.main_activity_frame,fragment).commit();
            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navView = findViewById(R.id.nav_view);

        fragment = null;
        mainFragment = MainFragment.newInstance();
        myVehiclesInitialFragment = MyVehiclesInitialFragment.newInstance();
        profileFragment = ProfileFragment.newInstance();
        myVehicles = MyVehicles.newInstance();

        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navView.setSelectedItemId(R.id.navigation_main_fragment);

    }

}
