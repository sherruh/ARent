package com.arent.ui.main;

import android.os.Build;
import android.os.Bundle;

import com.arent.ui.main.mainfragment.MainFragment;
import com.arent.ui.main.mycarsfragment.MyCarsFragment;
import com.arent.ui.main.profilefragment.ProfileFragment;
import com.arent.utils.Logger;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.MenuItem;

import com.arent.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    private Fragment fragment;
    private MainFragment mainFragment;
    private MyCarsFragment myCarsFragment;
    private ProfileFragment profileFragment;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_main_fragment:
                    fragment = mainFragment;
                    break;
                case R.id.navigation_new_anouncement_fragment:
                    fragment = myCarsFragment;
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
        BottomNavigationView navView = findViewById(R.id.nav_view);

        fragment = null;
        mainFragment = MainFragment.newInstance();
        myCarsFragment = MyCarsFragment.newInstance();
        profileFragment = ProfileFragment.newInstance();

        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navView.setSelectedItemId(R.id.navigation_main_fragment);

    }

}
