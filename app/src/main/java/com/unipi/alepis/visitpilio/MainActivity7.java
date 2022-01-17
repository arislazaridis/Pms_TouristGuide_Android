package com.unipi.alepis.visitpilio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity7 extends AppCompatActivity {
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        imageView = findViewById(R.id.imageView);


    }
    public void nextPhoto(View view){
        imageView.setImageResource(R.drawable.ipassia01);
    }

}