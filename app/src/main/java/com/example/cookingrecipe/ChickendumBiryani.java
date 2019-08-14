package com.example.cookingrecipe;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.Locale;

public class ChickendumBiryani extends MainActivity {
    private TextToSpeech mTTS;
    private SeekBar seekBarPitch;
    private SeekBar seekBarSpeed;
    private Button btnSpeak;
    private TextView textView0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chickendum_biryani);

        textView0=(TextView)findViewById(R.id.textView0);


        seekBarPitch=(SeekBar)findViewById(R.id.seekBarPitch);
        seekBarSpeed=(SeekBar)findViewById(R.id.seekBarSpeed);
        btnSpeak=(Button)findViewById(R.id.btnSpeak);

        mTTS= new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if(i== TextToSpeech.SUCCESS){

                    int result=mTTS.setLanguage(Locale.ENGLISH);

                    if(result== TextToSpeech.LANG_MISSING_DATA|| result== TextToSpeech.LANG_NOT_SUPPORTED){
                        Log.e("TTS", "Language Not Supported");
                    }else {
                        btnSpeak.setEnabled(true);

                    }
                }else{
                    Log.e("TTS","Initialization Failed");
                }

            }
        });


        btnSpeak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String text0= textView0.getText().toString();


                float pitch =(float)seekBarPitch.getProgress()/50;
                if (pitch< 0.1)pitch= 0.1f;
                float speed =(float)seekBarSpeed.getProgress()/50;
                if (speed< 0.1)speed= 0.1f;

                mTTS.setPitch(pitch);
                mTTS.setSpeechRate(speed);

                mTTS.speak(text0, TextToSpeech.QUEUE_FLUSH,null);

            }

        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(mTTS!= null){
            mTTS.stop();
            mTTS.shutdown();
        }
    }

}
