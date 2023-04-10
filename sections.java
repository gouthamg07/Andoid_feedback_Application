package com.example.feedbak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class sections extends AppCompatActivity {
Button a,b,c,d,e,f,l;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sections);
        a = findViewById(R.id.A);
        b = findViewById(R.id.B);
        c = findViewById(R.id.first);
        d = findViewById(R.id.higher);
        e = findViewById(R.id.E);
        f = findViewById(R.id.F);
        l =findViewById(R.id.log);


        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logout();
            }
        });
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                feedbacka();
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                feedbackb();
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                feedbackc();
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                feedbackd();
            }
        });
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                feedbacke();
            }
        });
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                feedbackf();
            }
        });
    }

    private void feedbacka() {
        Intent intent = new Intent(this,FEEDBACK.class);
        startActivity(intent);
    }
    private void feedbackb() {
        Intent intent = new Intent(this,feedback_b.class);
        startActivity(intent);
    }
    private void feedbackc() {
        Intent intent = new Intent(this,feedback_c.class);
        startActivity(intent);
    }
    private void feedbackd() {
        Intent intent = new Intent(this,feedback_d.class);
        startActivity(intent);
    }    private void feedbacke() {
        Intent intent = new Intent(this,feedback_e.class);
        startActivity(intent);
    }    private void feedbackf() {
        Intent intent = new Intent(this,feedback_f.class);
        startActivity(intent);
    }
    public void logout() {
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent( sections.this,MainActivity.class));
    }


}