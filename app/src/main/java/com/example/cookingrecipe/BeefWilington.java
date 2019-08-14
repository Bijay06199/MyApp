package com.example.cookingrecipe;

import android.graphics.Typeface;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.Locale;

public class BeefWilington extends MainActivity {

    private TextToSpeech mTTS;
    private SeekBar seekBarPitch;
    private SeekBar seekBarSpeed;
    private Button btnSpeak;

    private TextView textView;
    private TextView textView0;
    private TextView textView1;
    private TextView textView2;
    private TextView textView3;
    private TextView textView4;
    private TextView textView5;
    private TextView textView6;
    private TextView textView7;
    private TextView textView9;
    private TextView textView10;
    private TextView textView11;
    private TextView textView12;
    private TextView textView13;
    private TextView textView14;
    private TextView textView15;
    private TextView textView16;
    private TextView textView17;
    private TextView textView18;
    private TextView textView19;
    private TextView textView20;
    private TextView textView21;
    private TextView textView22;
    private TextView textView23;
    private TextView textView24;
    private TextView textView25;
    private TextView textView26;
    private TextView textView27;
    private TextView textView28;
    private TextView textView29;
    private TextView textView30;
    private TextView textView31;
    private TextView textView41;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beef_wilington);


        textView=(TextView)findViewById(R.id.textView);
        textView0=(TextView)findViewById(R.id.textView0);
        textView1=(TextView)findViewById(R.id.textView1);
        textView2=(TextView)findViewById(R.id.textView2);
        textView3 =(TextView)findViewById(R.id.textView3);
        textView4=(TextView)findViewById(R.id.textView4);
        textView5=(TextView)findViewById(R.id.textView5);
        textView6 =(TextView)findViewById(R.id.textView6);
        textView7=(TextView)findViewById(R.id.textView7);
        textView9=(TextView)findViewById(R.id.textView9);
        textView10=(TextView)findViewById(R.id.textView10);
        textView11=(TextView)findViewById(R.id.textView11);
        textView12=(TextView)findViewById(R.id.textView12);
        textView13=(TextView)findViewById(R.id.textView13);
        textView14=(TextView)findViewById(R.id.textView14);
        textView15=(TextView)findViewById(R.id.textView15);
        textView16=(TextView)findViewById(R.id.textView16);
        textView17=(TextView)findViewById(R.id.textView17);
        textView18=(TextView)findViewById(R.id.textView18);
        textView19=(TextView)findViewById(R.id.textView19);
        textView20=(TextView)findViewById(R.id.textView20);
        textView21=(TextView)findViewById(R.id.textView21);
        textView22=(TextView)findViewById(R.id.textView22);
        textView23=(TextView)findViewById(R.id.textView23);
        textView24=(TextView)findViewById(R.id.textView24);
        textView25=(TextView)findViewById(R.id.textView25);
        textView26=(TextView)findViewById(R.id.textView26);
        textView27=(TextView)findViewById(R.id.textView27);
        textView28=(TextView)findViewById(R.id.textView28);
        textView29=(TextView)findViewById(R.id.textView29);
        textView30=(TextView)findViewById(R.id.textView30);
        textView31=(TextView)findViewById(R.id.textView31);
        textView41=(TextView)findViewById(R.id.textView41);






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
                String text= textView.getText().toString();
                String text0= textView0.getText().toString();
                String text1= textView1.getText().toString();
                String text2= textView2.getText().toString();
                String text3= textView3.getText().toString();
                String text4= textView4.getText().toString();
                String text5= textView5.getText().toString();
                String text6= textView6.getText().toString();
                String text7= textView7.getText().toString();
                String text9= textView9.getText().toString();
                String text10= textView10.getText().toString();
                String text11= textView11.getText().toString();
                String text12= textView12.getText().toString();
                String text13= textView13.getText().toString();
                String text14= textView14.getText().toString();
                String text15= textView15.getText().toString();
                String text16= textView16.getText().toString();
                String text17= textView17.getText().toString();
                String text18= textView18.getText().toString();
                String text19= textView19.getText().toString();
                String text20= textView20.getText().toString();
                String text21= textView21.getText().toString();
                String text22= textView22.getText().toString();
                String text23= textView23.getText().toString();
                String text24= textView24.getText().toString();
                String text25= textView25.getText().toString();
                String text26= textView26.getText().toString();
                String text27= textView27.getText().toString();
                String text28= textView28.getText().toString();
                String text29= textView29.getText().toString();
               String text41= textView41.getText().toString();



                float pitch =(float)seekBarPitch.getProgress()/50;
                if (pitch< 0.1)pitch= 0.1f;
                float speed =(float)seekBarSpeed.getProgress()/50;
                if (speed< 0.1)speed= 0.1f;

                mTTS.setPitch(pitch);
                mTTS.setSpeechRate(speed);

                mTTS.speak(text, TextToSpeech.QUEUE_ADD,null);
                mTTS.speak(text0, TextToSpeech.QUEUE_FLUSH,null);
                mTTS.speak(text1, TextToSpeech.QUEUE_FLUSH,null);
                mTTS.speak(text2, TextToSpeech.QUEUE_FLUSH,null);
                mTTS.speak(text3, TextToSpeech.QUEUE_FLUSH,null);
                mTTS.speak(text4, TextToSpeech.QUEUE_FLUSH,null);
                mTTS.speak(text5, TextToSpeech.QUEUE_FLUSH,null);
                mTTS.speak(text6, TextToSpeech.QUEUE_FLUSH,null);
                mTTS.speak(text7, TextToSpeech.QUEUE_FLUSH,null);
                mTTS.speak(text9, TextToSpeech.QUEUE_FLUSH,null);
                mTTS.speak(text10, TextToSpeech.QUEUE_FLUSH,null);
                mTTS.speak(text11, TextToSpeech.QUEUE_FLUSH,null);
                mTTS.speak(text12, TextToSpeech.QUEUE_FLUSH,null);
                mTTS.speak(text13, TextToSpeech.QUEUE_FLUSH,null);
                mTTS.speak(text14, TextToSpeech.QUEUE_FLUSH,null);
                mTTS.speak(text15, TextToSpeech.QUEUE_FLUSH,null);
                mTTS.speak(text16, TextToSpeech.QUEUE_FLUSH,null);
                mTTS.speak(text17, TextToSpeech.QUEUE_FLUSH,null);
                mTTS.speak(text18, TextToSpeech.QUEUE_FLUSH,null);
                mTTS.speak(text19, TextToSpeech.QUEUE_FLUSH,null);
                mTTS.speak(text20, TextToSpeech.QUEUE_FLUSH,null);
                mTTS.speak(text21, TextToSpeech.QUEUE_FLUSH,null);
                mTTS.speak(text22, TextToSpeech.QUEUE_FLUSH,null);
                mTTS.speak(text23, TextToSpeech.QUEUE_FLUSH,null);
                mTTS.speak(text24, TextToSpeech.QUEUE_FLUSH,null);
                mTTS.speak(text25, TextToSpeech.QUEUE_FLUSH,null);
                mTTS.speak(text26, TextToSpeech.QUEUE_FLUSH,null);
                mTTS.speak(text27, TextToSpeech.QUEUE_FLUSH,null);
                mTTS.speak(text28, TextToSpeech.QUEUE_FLUSH,null);
                mTTS.speak(text29, TextToSpeech.QUEUE_FLUSH,null);
                 mTTS.speak(text41, TextToSpeech.QUEUE_FLUSH,null);




            }
        });



        //Typeface beef= Typeface.createFromAsset(getAssets(),"fonts/MOCKER.ttf");


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
