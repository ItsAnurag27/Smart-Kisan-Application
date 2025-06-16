package com.example.optimizer;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.optimizer.Utils;

public class SplashScreen extends AppCompatActivity {

    private View img_logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        // Call the blackIconStatusBar method to change the status bar color
        Utils.blackIconStuatusBar(SplashScreen.this, R.color.light_Background);

        img_logo = findViewById(R.id.img_logo);

        // Delayed execution to start the Login activity after 3 seconds
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Start the Login activity with a shared element transition animation
                Intent intent = new Intent(SplashScreen.this, Login.class);
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(SplashScreen.this,
                        Pair.create(img_logo, "logo"));
                startActivity(intent, options.toBundle());
            }
        }, 3000);
    }
}
