package com.padda.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Picasso extends AppCompatActivity {

    ImageView im;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picasso);


        im = (ImageView) findViewById(R.id.imagepicasso);

        //com.squareup.picasso.Picasso.with(this).load("http://i.imgur.com/DvpvklR.png").into(im);


        com.squareup.picasso.Picasso.with(this)
                .load("https://images.unsplash.com/photo-1535370976884-f4376736ab06?ixlib=rb-1.2.1&auto=format&fit=crop&w=1000&q=80")
                .placeholder(R.drawable.ic_launcher_background)   // optional
                .error(R.drawable.ic_launcher_foreground)      // optional
                .resize(800,400)                        // optional
                .into(im);







    }
}
