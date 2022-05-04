package com.example.kursach2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    Button btn;
    Button btn2;
    Button btn3;
    TextView name;
    CalendarView calendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        name = findViewById(R.id.name);
        calendar = findViewById(R.id.calend);

        btn.setOnClickListener(this::onClick);
        btn2.setOnClickListener(this::onClick);
        btn3.setOnClickListener(this::onClick);

    }
    public void onClick (View view) {
        Fragment fragment = null;

        switch (view.getId()) {
            case (R.id.btn):
                fragment = new HomeFragment();
                break;
            case (R.id.btn2):
                fragment = new SettingsFragment();
                break;
            case (R.id.btn3):
                fragment = new SpisokFragment();
                break;
        }
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        assert fragment != null;
        ft.replace(R.id.HomeFragment, fragment);
        ft.commit();
    }
}