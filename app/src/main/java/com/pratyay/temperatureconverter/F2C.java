package com.pratyay.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class F2C extends AppCompatActivity {
    EditText entry;
    Button button, c2f, back;
    TextView ans1;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f2_c);
        entry = findViewById(R.id.entry);
        button = findViewById(R.id.button);
        back = findViewById(R.id.back);
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
        ////////////////////////////////////////////////////////////////////////////////////////////////
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(F2C.this, MainActivity.class);
                startActivity(a);
            }
        });
    }
    private void ans() {
        try {
            String far = entry.getText().toString();
            double f = Double.parseDouble(far);
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