package com.example.foodease.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.foodease.MainActivity;
import com.example.foodease.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity {

    EditText editText2, editText3;
    Button button;

    FirebaseAuth mAuth;

    @Override
    public void onStart() {
        super.onStart();
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if(currentUser != null){
            Intent i = new Intent(getApplicationContext(), MainActivity.class) ;
            startActivity(i);
            finish();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        editText2 = findViewById(R.id.email);
        editText3 = findViewById(R.id.password);
        button = findViewById(R.id.button);
        mAuth = FirebaseAuth.getInstance();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email, password;
                email = String.valueOf(editText2.getText());
                password = String.valueOf(editText3.getText());

                if (TextUtils.isEmpty(email)) {
                    Toast.makeText(LoginActivity.this, "Enter Email", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (TextUtils.isEmpty(password)) {
                    Toast.makeText(LoginActivity.this, "Enter Password", Toast.LENGTH_SHORT).show();
                    return;
                }
                mAuth.signInWithEmailAndPassword(email, password)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    Toast.makeText(getApplicationContext(),"Login Sucessful",Toast.LENGTH_SHORT).show();
                                    Intent i = new Intent(getApplicationContext(), MainActivity.class) ;
                                    startActivity(i);
                                    finish();
                                } else {
                                    Toast.makeText(LoginActivity.this, "Authentication failed.",
                                            Toast.LENGTH_SHORT).show();
                                }
                            }
                        });

//        button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                String email, password;
//                email = String.valueOf(editText2.getText());
//                password = String.valueOf(editText3.getText());
//
//                if (TextUtils.isEmpty(email)) {
//
//                    Toast.makeText(LoginActivity.this,"Enter Email",Toast.LENGTH_SHORT).show();
//                    return;
//                }
//
//                if (TextUtils.isEmpty(password)) {
//
//                    Toast.makeText(LoginActivity.this, "Enter Password", Toast.LENGTH_SHORT).show();
//                    return;
//                }
//
//        });
//    public void sendData()
//    {
//        email = editText2.getText().toString();
//        password = editText3.getText().toString();
//        if(email.equals("sumitkgagrawal@gmail.com") && password.equals("password"))
//        {
//            Intent i = new Intent (LoginActivity.this, MainActivity.class);
//            startActivity(i);
//        }
//        else if (email.equals("") || password.equals(""))
//        {
//            Toast.makeText(getBaseContext(),"Enter Username & Password", Toast.LENGTH_SHORT).show();
//        }
//        else
//            Toast.makeText(getBaseContext(), "Invalid Username & Password", Toast.LENGTH_SHORT).show();
//    }
            }
        });
    }

    public void register(View view) {
        startActivity(new Intent(LoginActivity.this, RegistrationActivity.class));
    }

    public void mainActivity(View view) {
        startActivity(new Intent(LoginActivity.this, MainActivity.class));
    }
}
