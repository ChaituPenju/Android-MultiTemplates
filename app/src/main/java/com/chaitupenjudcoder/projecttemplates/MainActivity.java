package com.chaitupenjudcoder.projecttemplates;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loginScreen(View view) {
        startActivity(new Intent(MainActivity.this, LoginActivity.class));
    }

    public void signupScreen(View view) {
        startActivity(new Intent(MainActivity.this, SignupActivity.class));
    }

    public void tabbedScreen(View view) {
        startActivity(new Intent(MainActivity.this, TabbedActivity.class));
    }

    public void bottomNavigationScreen(View view) {
    }
}
