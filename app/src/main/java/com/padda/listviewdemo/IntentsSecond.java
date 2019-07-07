package com.padda.listviewdemo;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class IntentsSecond extends AppCompatActivity {
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intents_second);

        text=findViewById(R.id.editText2);

        Intent j=getIntent();
        String st=j.getStringExtra("pass");
        text.setText(st);




    }
}
