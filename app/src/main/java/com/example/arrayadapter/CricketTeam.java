package com.example.arrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CricketTeam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.commen);
        ArrayList<Word> words=new ArrayList<Word>();
        words.add(new Word("Shikher Dhavan",32));
        words.add(new Word("Rohit Sharma",33));
        words.add(new Word("Virat Kohli",34));
        words.add(new Word("Sury Kumar Yadav",30));
        words.add(new Word("shreyas iyar",27));
        words.add(new Word("Manish Panday",28));
        words.add(new Word("Rishab pant",23));
        words.add(new Word("hardik panday",28));
        words.add(new Word("Ravinder jadeza",30));
        words.add(new Word("prathvi shaw",22));
        words.add(new Word("kronal panday",32));
        words.add(new Word("Shanju samsung",32));
        words.add(new Word("Ashvin",34));
        words.add(new Word("MS dhoni",38));
        words.add(new Word("Chahal",28));
        words.add(new Word("Kuldeep Yadav",29));
        words.add(new Word("Mohd siraj",27));
        words.add(new Word("Bhunesuwar Kumar",32));
        words.add(new Word("Mohd Shami",32));
        words.add(new Word("umash Yadav",33));
        words.add(new Word("Jasspreet Bumrah",29));

        WordAdapter adapter=new WordAdapter(this,words);
        ListView listView=(ListView) findViewById(R.id.common);
        listView.setAdapter(adapter);

    }
}
