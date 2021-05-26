package com.example.arrayadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {
    public WordAdapter(@NonNull Context context, @NonNull List<Word> words) {
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View currentItemView=convertView;
        if(currentItemView==null){
            currentItemView= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        Word currentPosition=getItem(position);
        TextView textView1=(TextView)currentItemView.findViewById(R.id.team_name);
        textView1.setText(currentPosition.getName());
        TextView textView2=(TextView)currentItemView.findViewById(R.id.team_age);
        textView2.setText(Integer.toString(currentPosition.getAge()));
        return currentItemView;
    }
}
