package com.example.quizapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button1,button2;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(),"Welcome to Logo Quiz",Toast.LENGTH_SHORT).show();
        button1=findViewById(R.id.button1);

    }
    public void dowork(View v){
        switch (v.getId()){
            case R.id.button1:
             i=new Intent(this,PageOne.class);
             startActivity(i);
             break;


        }
    }
}
