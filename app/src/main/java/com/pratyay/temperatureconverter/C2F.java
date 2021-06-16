package com.pratyay.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class C2F extends AppCompatActivity {
    EditText entry;
    Button button, f2c, back;
    TextView ans1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c2_f);
        entry = findViewById(R.id.entry);
        button = findViewById(R.id.button);
        back = findViewById(R.id.back);
        f2c = findViewById(R.id.f2c);
        ans1 = findViewById(R.id.ans1);
        button.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v){
               ans();
           }
        });


//////////////////////////////////////////////////////////////////////////////////////////////////////
        f2c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent i = new Intent(C2F.this, F2C.class);
                startActivity(i);
            }
        });
        //////////////////////////////////////////////////////////////////
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(C2F.this, MainActivity.class);
                startActivity(a);
            }
        });

    }
    private void ans(){
       try {
           String cel = entry.getText().toString();
           double c = Double.parseDouble(cel);
           double a = 9 * c;
           double b = a + 160;
           double d = b / 5;
           String ans = String.valueOf(d);
           ans1.setText(ans);
       }
       catch (Exception e){
           e.printStackTrace();
       }

    }
}