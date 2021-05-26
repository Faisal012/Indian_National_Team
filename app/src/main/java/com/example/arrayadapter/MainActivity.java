package com.example.arrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView button1=(TextView) findViewById(R.id.cricket);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,CricketTeam.class);
                startActivity(intent);
            }
        });
        TextView button2=(TextView) findViewById(R.id.football);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,FoodballTeam.class);
                startActivity(intent);
            }
        });
        TextView button3=(TextView) findViewById(R.id.volleyball);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,VolleyballTeam.class);
                startActivity(intent);
            }
        });
        TextView button4=(TextView) findViewById(R.id.hockey);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,HockeyTeam.class);
                startActivity(intent);
            }
        });
    }
}