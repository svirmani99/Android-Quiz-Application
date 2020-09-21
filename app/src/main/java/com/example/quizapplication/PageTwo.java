package com.example.quizapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class PageTwo extends AppCompatActivity {
    RadioButton radioButton5,radioButton6,radioButton7,radioButton8;
    RadioGroup rg1;
    Button button3;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_two);
         i = getIntent();

        radioButton5=findViewById(R.id.radioButton5);
        radioButton6=findViewById(R.id.radioButton6);
        radioButton7=findViewById(R.id.radioButton7);
        radioButton8=findViewById(R.id.radioButton8);
        button3=findViewById(R.id.button3);
        rg1=findViewById(R.id.rg1);
    }
    public void dowork(View v){
        int c;
        c =i.getIntExtra("count",0);
        switch (rg1.getCheckedRadioButtonId()) {

            case R.id.radioButton5:

                break;
            case R.id.radioButton6:
                c = c + 1;
                break;
            case R.id.radioButton7:

                break;
            case R.id.radioButton8:

                break;
        }
        switch (v.getId()){

            case R.id.button3:

                Intent i=new Intent(this,PageThree.class);
                i.putExtra("count",c);
                startActivity(i);
                break;


        }
    }
}
