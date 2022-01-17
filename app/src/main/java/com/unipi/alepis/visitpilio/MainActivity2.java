package com.unipi.alepis.visitpilio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity2 extends AppCompatActivity {
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = findViewById(R.id.textView);
        Intent intent = getIntent();



    }
    public void gorestaurant(View view) {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);


    }

    public void gonature(View view) {
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);


    }
    public void gomuseum(View view) {
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);

    }
    public void gostay(View view) {
        Intent intent = new Intent(this, MainActivity6.class);
        startActivity(intent);

    }
    public void goactivities(View view) {
        Intent intent = new Intent(this, MainActivity7.class);
        startActivity(intent);

    }
}