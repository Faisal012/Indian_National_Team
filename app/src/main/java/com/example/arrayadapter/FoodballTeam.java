package com.example.arrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodballTeam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.commen);
        ArrayList<Word> words=new ArrayList<Word>();
        words.add(new Word("Sunil chhetri",36));
        words.add(new Word("subhasis roy",34));
        words.add(new Word("Balwant Singh",34));
        words.add(new Word("Anas Edthodika",34));
        words.add(new Word("Adil khan",32));
        words.add(new Word("Rahul bheke",32));
        words.add(new Word("Ashutosh mehtal",30));
        words.add(new Word("Gurpreet Singh",29));
        words.add(new Word("Jackichand",29));
        words.add(new Word("Mandar Rao",29));
        words.add(new Word("Rowllin barges",28));
        words.add(new Word("Manshoor Shereef",28));
        words.add(new Word("Pronay Halder",28));
        words.add(new Word("Amrinder Singh",27));
        words.add(new Word("Sandesh jhingan",27));
        words.add(new Word("Pritam Kotal",27));
        words.add(new Word("Halicharan Narzary",27));
        words.add(new Word("Glan Martins",26));
        words.add(new Word("Brandon ",26));
        words.add(new Word("Bipin Singh",26));
        words.add(new Word("Nikhil Poojari",25));

        WordAdapter adapter=new WordAdapter(this,words);
        ListView listView=(ListView) findViewById(R.id.common);
        listView.setAdapter(adapter);

    }
}