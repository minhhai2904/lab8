package com.bt.navigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class bai2 extends AppCompatActivity {
    ActionBar actionBar;
    FrameLayout frameLayout;
    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);


        actionBar = getSupportActionBar();
        frameLayout = (FrameLayout) findViewById(R.id.frameFragNav);
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNav);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId()== R.id.b2_itemMenuNavHome) {
                    actionBar.setTitle("HOME");
                    loadFragment(new homeFragment());
                }else if (item.getItemId()== R.id.b2_itemMenuNavNofi) {
                    actionBar.setTitle("NOTIFICATION");
                    loadFragment(new notifiFrag());

                }else if (item.getItemId()== R.id.b2_itemMenuNavSearch) {
                    actionBar.setTitle("SEARCH");
                    loadFragment(new searchFrag());

                }else if (item.getItemId()== R.id.b2_itemMenuNavCf){
                    actionBar.setTitle("user");
                    loadFragment(new Fuser());

                }
                return true;
            }
        });
    }
    public void loadFragment(androidx.fragment.app.Fragment
                                     fragment)
    {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft= fm.beginTransaction();
        ft.replace(R.id.frameFragNav,fragment);
        ft.commit();
    }
}