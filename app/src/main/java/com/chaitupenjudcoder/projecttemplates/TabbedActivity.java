package com.chaitupenjudcoder.projecttemplates;

import android.os.Bundle;

import com.chaitupenjudcoder.projecttemplates.databinding.ActivityTabbedBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.databinding.DataBindingUtil;
import androidx.appcompat.app.AppCompatActivity;

import com.chaitupenjudcoder.projecttemplates.tabsui.SectionsPagerAdapter;

public class TabbedActivity extends AppCompatActivity {

    ActivityTabbedBinding atb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        atb = DataBindingUtil.setContentView(this, R.layout.activity_tabbed);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        atb.viewPager.setAdapter(sectionsPagerAdapter);
        atb.tabs.setupWithViewPager(atb.viewPager);
        FloatingActionButton fab = atb.fab;

        fab.setOnClickListener(view -> Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show());
    }
}