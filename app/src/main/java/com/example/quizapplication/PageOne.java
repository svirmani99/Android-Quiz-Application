package com.example.quizapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class PageOne extends AppCompatActivity {

 RadioButton radioButton1,radioButton2,radioButton3,radioButton4;
 RadioGroup rg;
 Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_one);
        radioButton1=findViewById(R.id.radioButton1);
        radioButton2=findViewById(R.id.radioButton2);
        radioButton3=findViewById(R.id.radioButton3);
        radioButton4=findViewById(R.id.radioButton4);
        button2=findViewById(R.id.button2);
        rg=findViewById(R.id.rg);
    }
    public void dowork(View v){
        int c=0;
        switch (rg.getCheckedRadioButtonId()) {

            case R.id.radioButton1:
                c =c+1;
                break;
            case R.id.radioButton2:
                break;
            case R.id.radioButton3:
                break;
            case R.id.radioButton4:
                break;
        }
        switch (v.getId()){

            case R.id.button2:
                Intent i=new Intent(this,PageTwo.class);
                i.putExtra("count",c);
                startActivity(i);
                break;
        }
    }
}
