package com.example.myanimki;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button FrameBtn;
    private Button TweenBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FrameBtn = findViewById(R.id.start_frame);

        TweenBtn = findViewById(R.id.pause_frame);

        Animation fadeanim = AnimationUtils.loadAnimation(this, R.anim.fade_anim);

        FrameBtn.startAnimation(fadeanim);
        TweenBtn.startAnimation(fadeanim);
    }



    public void startNewActivity(View v) {
        Intent intent = new Intent(this, SecondPrikolAnimka.class);
        startActivity(intent);
    }

    public void startNewActivity2(View v) {
        Intent intent = new Intent(this, ThirdPrikolNonFrame.class);
        startActivity(intent);
    }
}