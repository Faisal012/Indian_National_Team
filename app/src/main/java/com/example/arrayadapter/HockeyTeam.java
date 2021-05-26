package com.example.arrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class HockeyTeam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.commen);
        ArrayList<Word> words=new ArrayList<Word>();
        words.add(new Word("Krishan B Pathak",32));
        words.add(new Word(" P R Sreejesh",33));
        words.add(new Word("Gurinder Singh",34));
        words.add(new Word("Surender Kumar (Vice Captain)",30));
        words.add(new Word("Kamlesh Khatik",27));
        words.add(new Word("Vinit Kumar Vinit Kumar c",28));
        words.add(new Word("Ajithlal Chandran",23));
        words.add(new Word("Sinha Deepesh Kumar",28));
        words.add(new Word(" Varun Kumar",30));
        words.add(new Word("Jerome Vinith Charles",22));
        words.add(new Word("Amit Rohidas",32));
        words.add(new Word("Shon Thanghalathil John",32));
        words.add(new Word("Ashwal Rai",34));
        words.add(new Word("Karthik Ashok",38));
        words.add(new Word("Akhin Gopala Ammal",28));
        words.add(new Word("Amit",29));
        words.add(new Word("Prabakaran Pattani",27));
        words.add(new Word("Bhunesuwar Kumar",32));
        words.add(new Word("Vinit Kumar",32));
        words.add(new Word("umash Yadav",33));
        words.add(new Word("Hardik Singh",29));

        WordAdapter adapter=new WordAdapter(this,words);
        ListView listView=(ListView) findViewById(R.id.common);
        listView.setAdapter(adapter);
    }
}