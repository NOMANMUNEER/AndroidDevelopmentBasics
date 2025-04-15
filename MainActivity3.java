package com.example.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity {
Button BTn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        BTn=findViewById(R.id.back_1);
        BTn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent I =new Intent(MainActivity3.this,MainActivity.class);
                startActivity(I);
            }
        });

    }
}