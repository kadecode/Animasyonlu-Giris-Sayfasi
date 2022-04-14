package com.example.animasyonlugirissayfasi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button buttonGiris;
    private ImageView imageViewBulut;
    private TextView textViewHava;
    private Animation animasyon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonGiris = findViewById(R.id.buttonGiris);
        imageViewBulut = findViewById(R.id.imageViewBulut);
        textViewHava =  findViewById(R.id.textViewHava);

        animasyon = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.anime_oynat);

        buttonGiris.setAnimation(animasyon);
    }
}