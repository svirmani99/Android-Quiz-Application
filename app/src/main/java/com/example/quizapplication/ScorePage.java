package com.example.quizapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class ScorePage extends AppCompatActivity {
RatingBar ratingBar;

    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_page);
        ratingBar=findViewById(R.id.ratingBar);
         i = getIntent();


    }
    public void dowork(View v){
        int c;
        c =i.getIntExtra("count",0);
        switch (v.getId()){
            case R.id.button5:
                String s;
                float d=c;
                ratingBar.setRating(d);
                if(c==3)
                {
                    s="Excellent";
                }
                else if(c==2)
                {
                    s="good";
                }
                else if(c==1)
                {
                    s="Better luck next time";
                }
                else {
                    s="Work hard";
                }

                Toast.makeText(getApplicationContext(),"Your score is "+c+"\n"+s,Toast.LENGTH_LONG).show();
                break;
        }
    }
}
