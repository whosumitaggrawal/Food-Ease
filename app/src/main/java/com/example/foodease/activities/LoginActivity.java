package com.example.foodease.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.foodease.MainActivity;
import com.example.foodease.R;

public class LoginActivity extends AppCompatActivity {

    private EditText unametext,passtext;
    private String uname,pass;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        unametext=findViewById(R.id.uname);
        passtext=findViewById(R.id.pass);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendData();
            }
        });

    }
    public void sendData()
    {
        uname = unametext.getText().toString();
        pass = passtext.getText().toString();
        if(uname.equals("sumitkgagrawal@gmail.com") && pass.equals("password"))
        {
            Intent i = new Intent (LoginActivity.this, MainActivity.class);
            startActivity(i);
        }
        else if (uname.equals("") || pass.equals(""))
        {
            Toast.makeText(getBaseContext(),"Enter Username & Password", Toast.LENGTH_SHORT).show();
        }
        else
            Toast.makeText(getBaseContext(), "Invalid Username & Password", Toast.LENGTH_SHORT).show();
    }

    public void register(View view) {
        startActivity(new Intent(LoginActivity.this, RegistrationActivity.class));
    }

    public void mainActivity(View view) {
        startActivity(new Intent( LoginActivity.this, MainActivity.class));
    }
}