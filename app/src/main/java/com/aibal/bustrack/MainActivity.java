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
        Intent a = new Intent(this, MapsActivity.class);
        Intent b = new Intent(this, About.class );
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
    }
}