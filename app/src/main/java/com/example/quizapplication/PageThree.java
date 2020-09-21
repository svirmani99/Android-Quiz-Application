package com.example.quizapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class PageThree extends AppCompatActivity {
    RadioButton radioButton9,radioButton10,radioButton11,radioButton12;
    RadioGroup rg2;
    Button button4;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_three);
        i = getIntent();

        radioButton9=findViewById(R.id.radioButton9);
        radioButton10=findViewById(R.id.radioButton10);
        radioButton11=findViewById(R.id.radioButton11);
        radioButton12=findViewById(R.id.radioButton12);
        button4=findViewById(R.id.button4);
        rg2=findViewById(R.id.rg2);
    }
    public void dowork(View v){
        int c;
        c =i.getIntExtra("count",0);
        switch (rg2.getCheckedRadioButtonId()) {

            case R.id.radioButton9:

                break;
            case R.id.radioButton10:
                c = c + 1;
                break;
            case R.id.radioButton11:

                break;
            case R.id.radioButton12:

                break;
        }
        switch (v.getId()){

            case R.id.button4:
                Intent i=new Intent(this,ScorePage.class);
                i.putExtra("count",c);
                startActivity(i);
                break;
        }}

}
