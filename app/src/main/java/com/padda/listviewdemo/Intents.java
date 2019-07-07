package com.padda.listviewdemo;

import android.content.Intent;
import android.support.annotation.DrawableRes;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Intents extends AppCompatActivity {
    ConstraintLayout cl;
    EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intents);

        cl=findViewById(R.id.lay);
        edit=findViewById(R.id.editText);

    }

    public void sendData(View view) {
        Intent i=new Intent(Intents.this,IntentsSecond.class);
        String str=edit.getText().toString();
        i.putExtra("pass",str);

        startActivity(i);


    }
}
