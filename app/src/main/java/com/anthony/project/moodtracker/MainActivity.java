package com.anthony.project.moodtracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import com.jakewharton.threetenabp.AndroidThreeTen;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewPager2 viewPager2;
    List<Mood> moodList;
    MoodAdapter moodAdapter;
    Button historicButton;
    Button addMoodButton;
    TextView text_view;
    String comment;


    public static final int[] tableauImg = new int[]{
            R.drawable.smiley_sad,
            R.drawable.smiley_disappointed,
            R.drawable.smiley_normal,
            R.drawable.smiley_happy,
            R.drawable.smiley_super_happy,


    };

    public static final int[] tableauFnd = new int[]{
            R.color.faded_red,
            R.color.warm_grey,
            R.color.cornflower_blue_65,
            R.color.light_sage,
            R.color.banana_yellow,


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidThreeTen.init(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager2 = findViewById(R.id.viewPager2);
        historicButton = findViewById(R.id.btnHist);
        addMoodButton = findViewById(R.id.btnComm);

        moodList = new ArrayList<>();
        moodList.add(new Mood(tableauImg[0], "ca"));
        moodList.add(new Mood(tableauImg[1], "ca"));
        moodList.add(new Mood(tableauImg[2], "ca"));
        moodList.add(new Mood(tableauImg[3], "ca"));
        moodList.add(new Mood(tableauImg[4], "ca"));

        moodAdapter = new MoodAdapter(this, moodList);
        viewPager2.setAdapter(moodAdapter);
        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                viewPager2.setBackgroundColor(getResources().getColor(tableauFnd[position]));
                Log.i("test position", "onPageSelected: position" + position);
            }
        });

    }
}
