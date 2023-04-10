package com.example.feedbak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class year extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_year);
        Button pri,high;
        pri =findViewById(R.id.first);
        high = findViewById(R.id.higher);
        pri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(year.this,first.class);
                startActivity(intent);
            }
        });

            high.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(year.this,sections.class);
            startActivity(intent);
        }
    });
}
}