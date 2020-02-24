package com.anthony.project.moodtracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewPager2 viewPager2;
    List<Mood> moodList;
    MoodAdapter moodAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
