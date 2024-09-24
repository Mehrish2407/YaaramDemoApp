package com.example.demoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView NotesCard, QuizCard, HistoryCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NotesCard = (CardView) findViewById(R.id.notesbtn);
        QuizCard = (CardView) findViewById(R.id.quizbtn);
        HistoryCard = (CardView) findViewById(R.id.historybtn);

        NotesCard.setOnClickListener(this);
        QuizCard.setOnClickListener(this);
        HistoryCard.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){
            case R.id.notesbtn:i=new Intent(this,Notes_module.class);startActivity(i);break;
            case R.id.quizbtn:i=new Intent(this,Quiz_module.class);startActivity(i);break;
            default:break;
        }

    }
}