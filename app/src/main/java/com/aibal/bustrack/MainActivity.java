package com.aibal.bustrack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button si = findViewById(R.id.button);
        Button ab = findViewById(R.id.button2);
        Button sch = findViewById(R.id.button3);
        Button pro = findViewById(R.id.button4);
        Intent a = new Intent(this, MapsActivity.class);
        Intent b = new Intent(this, About.class );
        Intent c = new Intent(this, Detail.class);
        Intent d = new Intent(this, Profile.class );
        si.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(a);
            }
        });
        ab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(b);
            }
        });
        sch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(c);
            }
        });
        pro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(d);
            }
        });
    }
}