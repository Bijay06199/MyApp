package com.example.cookingrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    MediaPlayer mysong;
    private TextView rate;


    private TextView recipe;
    private TextView nonVeg;
    private  TextView veg;
    private Button beef_willington;
    private  Button chilli_corn;
    private Button corn_pudding;
    private Button creamy_grape;
    private  Button crustless_spinach;
    private Button funnel_cakes;
    private Button hearty_vegetables;
    private Button lasanga;
    private Button pumpkin_bread;
    private Button rubhab;
    private Button butter_chicken;
    private Button chicken;
    private Button chicken_tandori;
    private Button chicken_tikka;
    private Button chickendum_biryani;
    private Button handi_biryani;
    private Button hot_dog;
    private Button hyderbadi_biryani;
    private Button naan;
    private RatingBar ratingBar;
    private RatingBar ratingBar1;
    private Button cauliflower_soup;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ratingBar=(RatingBar)findViewById(R.id.ratingBar);
        ratingBar1= (RatingBar)findViewById(R.id.ratingBar1);


        rate= (TextView)findViewById(R.id.rate);
        recipe=(TextView)findViewById(R.id.recipe);
        nonVeg=(TextView)findViewById(R.id.nonVeg);
        veg=(TextView)findViewById(R.id.veg);
        beef_willington=(Button)findViewById(R.id.beef_wilington);
        butter_chicken=(Button)findViewById(R.id.butter_chicken);
        chicken= (Button)findViewById(R.id.chicken);
        chicken_tikka=(Button)findViewById(R.id.chicken_tikka);
        chicken_tandori=(Button)findViewById(R.id.chicken_tandori);
        chickendum_biryani=(Button)findViewById(R.id.chickendum_biryani);
        handi_biryani=(Button)findViewById(R.id.handi_biryani);
        hot_dog=(Button)findViewById(R.id.hot_dog);
        hyderbadi_biryani=(Button)findViewById(R.id. hyderbadi_biryani);
        naan=(Button)findViewById(R.id.naan);
        chilli_corn=(Button)findViewById(R.id.chilli_corn);
        corn_pudding=(Button)findViewById(R.id.corn_pudding);
        creamy_grape=(Button)findViewById(R.id.creamy_grape);
        crustless_spinach=(Button)findViewById(R.id.crustless_spinach);
        funnel_cakes=(Button)findViewById(R.id.funnel_cakes);
        hearty_vegetables=(Button)findViewById(R.id.hearty_vegetables);
        lasanga=(Button)findViewById(R.id.lasanga);
        pumpkin_bread=(Button)findViewById(R.id.pumpkin_bread);
        rubhab=(Button)findViewById(R.id.rubhbab);
        cauliflower_soup=(Button)findViewById(R.id.cauliflower_soup);

       // mysong=MediaPlayer.create(getApplicationContext(), R.raw.mymusic);
        //mysong.start();
        //mysong.setLooping(true);

        Typeface myFont= Typeface.createFromAsset(getAssets(),"fonts/MOCKER.ttf");
         Typeface myfont1= Typeface.createFromAsset(getAssets(),"fonts/Space Comics.ttf");
        Typeface myfont2= Typeface.createFromAsset(getAssets(),"fonts/PirataOne.ttf");
        recipe.setTypeface(myFont);
        nonVeg.setTypeface(myfont1);
        veg.setTypeface(myfont1);
        rate.setTypeface(myfont2);


        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                Toast.makeText(MainActivity.this,"Your Rating For  Vegetarian Food is "+ v,Toast.LENGTH_SHORT).show();

                }

        });



        ratingBar1.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                Toast.makeText(MainActivity.this,"Your Rating For Non Vegetarian Food is "+ v,Toast.LENGTH_SHORT).show();

            }

        });


        beef_willington.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent();
                intent.setClass(MainActivity.this,BeefWilington.class);
                startActivity(intent);
            }
        });


        butter_chicken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent();
                intent.setClass(MainActivity.this,ButterChicken.class);
                startActivity(intent);
            }
        });

        chicken_tikka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent();
                intent.setClass(MainActivity.this,ChickenTikka.class);
                startActivity(intent);
            }
        });

        chicken_tandori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent();
                intent.setClass(MainActivity.this,Chicken_tandori.class);
                startActivity(intent);
            }
        });

        chicken.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                           Intent intent = new Intent();
                                           intent.setClass(MainActivity.this, Chicken.class);
                                           startActivity(intent);
                                       }
                                   });

        chickendum_biryani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent();
                intent.setClass(MainActivity.this,ChickenBiryani.class);
                startActivity(intent);
            }
        });


        handi_biryani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent();
                intent.setClass(MainActivity.this,HandiBiryani.class);
                startActivity(intent);
            }
        });

        chickendum_biryani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent();
                intent.setClass(MainActivity.this,ChickendumBiryani.class);
                startActivity(intent);
            }
        });


        hot_dog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent();
                intent.setClass(MainActivity.this,HotDog.class);
                startActivity(intent);
            }
        });

        hyderbadi_biryani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent();
                intent.setClass(MainActivity.this,HyderBadiBiryani.class);
                startActivity(intent);
            }
        });


        naan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent();
                intent.setClass(MainActivity.this,Naan.class);
                startActivity(intent);
            }
        });


        lasanga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent();
                intent.setClass(MainActivity.this,Lasanga.class);
                startActivity(intent);
            }
        });


        rubhab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent();
                intent.setClass(MainActivity.this,Rhubarb.class);
                startActivity(intent);
            }
        });

        chilli_corn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent();
                intent.setClass(MainActivity.this,ChilliCorn.class);
                startActivity(intent);
            }
        });

        funnel_cakes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent();
                intent.setClass(MainActivity.this,FunnelCakes.class);
                startActivity(intent);
            }
        });

        hearty_vegetables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent();
                intent.setClass(MainActivity.this,HeartyVegetable.class);
                startActivity(intent);
            }
        });

        crustless_spinach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent();
                intent.setClass(MainActivity.this,CrustlessSpinach.class);
                startActivity(intent);
            }
        });

        corn_pudding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent();
                intent.setClass(MainActivity.this,CornPudding.class);
                startActivity(intent);
            }
        });

        creamy_grape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent();
                intent.setClass(MainActivity.this,CreamyGrape.class);
                startActivity(intent);
            }
        });



        pumpkin_bread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent();
                intent.setClass(MainActivity.this,PumpkinBread.class);
                startActivity(intent);
            }
        });


        cauliflower_soup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent();
                intent.setClass(MainActivity.this,CauliFlowerSoup.class);
                startActivity(intent);
            }
        });





    }

  /*  @Override
    protected void onDestroy() {
        super.onDestroy();
        mysong.stop();
        mysong.release();


    }*/
}
