package com.lunguhenschel.gadsleaderboard.ui.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.lunguhenschel.gadsleaderboard.R;
import com.lunguhenschel.gadsleaderboard.adapters.ViewPagerAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;

public class MainScreen extends AppCompatActivity {
    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        ViewPagerAdapter pagerAdapter = new ViewPagerAdapter(this, getApplicationContext());
        ViewPager2 viewPager2 = findViewById(R.id.view_pager);
        viewPager2.setAdapter(pagerAdapter);
        TabLayout tabLayout = findViewById(R.id.tabs);
        new TabLayoutMediator(tabLayout, viewPager2, (tab, position) -> tab.setText(TAB_TITLES[position])).attach();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.action_submit) {
            Intent intent = new Intent(MainScreen.this, SubmitActivity.class);
            startActivity(intent);
        }
        return true;
    }

    public void startSubmitActivity(View view) {
        Intent intent = new Intent(MainScreen.this, SubmitActivity.class);
        startActivity(intent);
    }
}