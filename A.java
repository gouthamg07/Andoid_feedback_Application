package com.example.feedbak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class A extends AppCompatActivity {
    Button a,b,c,d,e,f,l;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        a = findViewById(R.id.ss1);
        b = findViewById(R.id.ss2);
        c = findViewById(R.id.ss3);
        d = findViewById(R.id.ss4);




        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                session1();
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                session2();
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                session3();
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                session4();
            }
        });

    }

    private void session1() {
        Intent intent = new Intent(this,session1.class);
        startActivity(intent);
    }
    private void session2() {
        Intent intent = new Intent(this,session2.class);
        startActivity(intent);
    }
    private void session3() {
        Intent intent = new Intent(this,session3.class);
        startActivity(intent);
    }
    private void session4() {
        Intent intent = new Intent(this,session4.class);
        startActivity(intent);
    }


}