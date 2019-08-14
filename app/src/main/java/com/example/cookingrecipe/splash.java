package com.example.cookingrecipe;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class splash extends AppCompatActivity {

private TextView splashText;
    private TextView splashText1;
    MediaPlayer mysong;




    private static  int screen= 2000;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
splashText=(TextView)findViewById(R.id.splashText);
        splashText1=(TextView)findViewById(R.id.splashText1);

        mysong=MediaPlayer.create(getApplicationContext(), R.raw.mymusic);
        mysong.start();
        mysong.setLooping(true);

        Typeface myFont= Typeface.createFromAsset(getAssets(),"fonts/MOCKER.ttf");



        Typeface myfont= Typeface.createFromAsset(getAssets(),"fonts/PirataOne.ttf");

        splashText.setTypeface(myfont);
        splashText1.setTypeface(myfont);


        Thread myThread = new Thread(){
            @Override
            public void run(){

                try {
                    sleep(2000);
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                    finish();

                }catch (InterruptedException e){

                    e.printStackTrace();
                }
            }
        };
        myThread.start();

    }


    @Override
    protected void onPause() {
        super.onPause();
        mysong.release();

        finish();
    }
}



