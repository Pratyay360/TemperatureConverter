package com.pratyay.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class F2C extends AppCompatActivity {
    EditText entry;
    Button button, c2f;
    TextView ans1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f2_c);
        entry = findViewById(R.id.entry);
        button = findViewById(R.id.button);
        c2f = findViewById(R.id.c2f);
        ans1 = findViewById(R.id.ans1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                ans();
            }
        });



        //////////////////////////////////////////////////////////////////////////////////////////////////////
        c2f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent i = new Intent(F2C.this, C2F.class);
                startActivity(i);
            }
        });
    }
    private void ans() {
        try {
            String far = entry.getText().toString();
            int f = Integer.parseInt(far);
            double a = f - 32;
            double c = 0.556 * a;
            String ans = String.valueOf(c);
            ans1.setText(ans);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}