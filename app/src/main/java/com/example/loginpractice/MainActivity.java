package com.example.loginpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mUsernameView, mEmailView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUsernameView = findViewById(R.id.username);
        mEmailView = findViewById(R.id.email);

        Intent intent = getIntent();
        String username = intent.getExtras().getString("key_name");
        String email = intent.getExtras().getString("key_email");

        mUsernameView.setText(username);
        mEmailView.setText(email);
    }
}