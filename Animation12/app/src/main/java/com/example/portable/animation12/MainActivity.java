package com.example.portable.animation12;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView marketImage=(ImageView) findViewById(R.id.id_image);
        marketImage.setBackgroundResource(R.drawable.frame_animation);
        final AnimationDrawable marketAnimation=(AnimationDrawable) marketImage.getBackground();
        marketImage.post(new Runnable() {
            @Override
            public void run() {
                if(marketAnimation!=null)
                    marketAnimation.start();
            }
        });


    }
}
