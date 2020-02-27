package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

public class MainActivity extends AppCompatActivity {

    boolean bartIsShowing = true;

    public void fade(View view){
        Log.i("Info", "ImageView has been tapped");

        ImageView bart = (ImageView) findViewById(R.id.iv_bart);

        ImageView homer = (ImageView) findViewById(R.id.iv_homer);

        if (bartIsShowing){
            bartIsShowing = false;
            bart.animate().alpha(0).setDuration(2000);
            homer.animate().alpha(1).setDuration(2000);
        } else {
            bartIsShowing = true;
            bart.animate().alpha(1).setDuration(2000);
            homer.animate().alpha(0).setDuration(2000);
        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
