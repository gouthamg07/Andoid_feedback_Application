package com.example.feedbak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class first extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Button A,B,C,D,E,F,G,H,I,J,K,L,M,N;
        A = findViewById(R.id.A);
        B = findViewById(R.id.B);
        C = findViewById(R.id.C);
        D = findViewById(R.id.D);
        E = findViewById(R.id.E);
        F = findViewById(R.id.F);
        G = findViewById(R.id.G);
        H = findViewById(R.id.H);
        I = findViewById(R.id.I);
        J = findViewById(R.id.J);
        K = findViewById(R.id.K);
        L = findViewById(R.id.L);
        M = findViewById(R.id.M);
        N = findViewById(R.id.N);


        A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(first.this,A.class);
                startActivity(intent);

            }
        });
        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(first.this,B.class);
                startActivity(intent);
            }
        });
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(first.this,C.class);
                startActivity(intent);
            }
        });
        D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(first.this,D.class);
                startActivity(intent);
            }
        });
        E.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(first.this,E.class);
                startActivity(intent);
            }
        });
        F.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(first.this,F.class);
                startActivity(intent);
            }
        });
        G.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(first.this,G.class);
                startActivity(intent);
            }
        });
        H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(first.this,H.class);
                startActivity(intent);
            }
        });
        I.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(first.this,I.class);
                startActivity(intent);
            }
        });
        J.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(first.this,J.class);
                startActivity(intent);
            }
        });
        K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(first.this,K.class);
                startActivity(intent);
            }
        });
        L.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(first.this,L.class);
                startActivity(intent);
            }
        });
        M.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(first.this,M.class);
                startActivity(intent);
            }
        });
        N.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(first.this,N.class);
                startActivity(intent);
            }
        });













    }
}