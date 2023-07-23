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

public class bai1 extends AppCompatActivity {
    ActionBar actionBar;
    FrameLayout frameLayout;
    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1);


        actionBar = getSupportActionBar();
        frameLayout = (FrameLayout) findViewById(R.id.frameFragNav);
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNav);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId()== R.id.itemMenuNavShop) {
                    actionBar.setTitle("shop");
                    loadFragment(new FragmentNav());
                }else if (item.getItemId()== R.id.itemMenuNavCart) {
                    actionBar.setTitle("cart");
                    loadFragment(new FCart());

                }else if (item.getItemId()== R.id.itemMenuNavGift) {
                    actionBar.setTitle("gift");
                    loadFragment(new FGift());

                }else {
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