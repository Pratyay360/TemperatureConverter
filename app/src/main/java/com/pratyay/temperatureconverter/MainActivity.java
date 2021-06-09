package com.pratyay.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button c2f, f2c;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "Created By Pratyay",Toast.LENGTH_SHORT).show();
        c2f = findViewById(R.id.c2f);
        f2c = findViewById(R.id.f2c);
        c2f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =  new Intent(MainActivity.this, C2F.class);
                startActivity(i);
            }
        });
        f2c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent i = new Intent(MainActivity.this, F2C.class);
                startActivity(i);
            }
        });


    }
}