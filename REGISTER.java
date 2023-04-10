package com.example.feedbak;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.widget.Toast;


import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class REGISTER extends AppCompatActivity {
    private FirebaseAuth mAuth;
    private EditText email,password,name;
    private Button btnregister;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        mAuth = FirebaseAuth.getInstance();
        email =findViewById(R.id.register_email);
        password =findViewById(R.id.register_password);
        btnregister = findViewById(R.id.register_button);
        name = findViewById(R.id.register_name);

        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Register();
            }


        });

    }

    private void Register() {
        String nam = name.getText().toString().trim();
        String user = email.getText().toString().trim();
        String pass = password.getText().toString().trim();
        if(nam.isEmpty())
        {
            name.setError("name cannot be empty");
        }

        if(user.isEmpty())
        {
            email.setError("email cannot be empty");
        }
        if (pass.isEmpty())
        {
            password.setError("password cannot be empty");
        }

        else if (Patterns.EMAIL_ADDRESS.matcher(user).matches())
        {
            mAuth.createUserWithEmailAndPassword(user,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful()){
                        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
                        if(user.isEmailVerified()){

                            Toast.makeText(REGISTER.this, "User registered successfully", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(REGISTER.this, LOGIN.class));
                        }else{
                            user.sendEmailVerification();
                            Toast.makeText(REGISTER.this, "Check your email to verify your account", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(REGISTER.this, LOGIN.class));
                        }

                    }
                    else{
                        Toast.makeText(REGISTER.this, "Registration failed"+task.getException(), Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }

}