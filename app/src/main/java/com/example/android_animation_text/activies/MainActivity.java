package com.example.android_animation_text.activies;

import
        android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;

import com.example.android_animation_text.Animationactivities.activities.Animation_7_1_4;
import com.example.android_animation_text.Animationactivities.activities.Animation_7_1_1;
import com.example.android_animation_text.Animationactivities.activities.Animation_7_1_2;
import com.example.android_animation_text.Animationactivities.activities.Animation_7_1_3;
import com.example.android_animation_text.Animationactivities.activities.Animation_7_1_5;
import com.example.android_animation_text.R;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView button01 = findViewById(R.id.animation_7_1_1);
        button01.setOnClickListener(this);

        CardView button02 = findViewById(R.id.animation_7_1_2);
        button02.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
        switch (v.getId()){
            case R.id.animation_7_1_1:
                startActivity(new Intent(MainActivity.this, FirstAnimationActivity.class));
                break;

            case R.id.animation_7_1_2:
                startActivity(new Intent(MainActivity.this, SecondAnimatorActivity.class));
                break;

        }
    }
}
