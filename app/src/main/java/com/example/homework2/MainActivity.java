package com.example.homework2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void OnLogInButtonClicked (View view) {
        Intent LogInIntent = new Intent(this, LogIn.class);
        startActivity(LogInIntent);
    }

    public void OnRegisterButtonClicked (View view) {
        Intent RegisterIntent = new Intent(this, Register.class);
        startActivity(RegisterIntent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}