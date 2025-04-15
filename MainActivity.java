package com.example.fragments;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button B1,B2,B3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        B1=findViewById(R.id.button);
        B2=findViewById(R.id.button2);
        B3=findViewById(R.id.button3);

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent I =new Intent(MainActivity.this,MainActivity2.class);
                startActivity(I);
            }
        });
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent I =new Intent(MainActivity.this,MainActivity3.class);
                startActivity(I);
            }
        });
        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent I =new Intent(MainActivity.this,MainActivity4.class);
                startActivity(I);
            }
        });





    }
}