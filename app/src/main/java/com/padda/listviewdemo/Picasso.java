package com.padda.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Picasso extends AppCompatActivity {

    ImageView im,im2,im3,im4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picasso);


        im = (ImageView) findViewById(R.id.imagepicasso);
        im2 = (ImageView) findViewById(R.id.imagepicasso2);
        im3 = (ImageView) findViewById(R.id.imagepicasso3);
        im4 = (ImageView) findViewById(R.id.imagepicasso4);


        //com.squareup.picasso.Picasso.with(this).load("http://i.imgur.com/DvpvklR.png").into(im);


        com.squareup.picasso.Picasso.with(this)
                .load("http://www.mobileswall.com/wp-content/uploads/2014/06/901-Minimalistic-Multicolor-Posters-l.jpg")
                .placeholder(R.drawable.a)   // optional
                .error(R.drawable.b)
                .fit()// optional
                //.resize(400,800)                        // optional
                .into(im);

        com.squareup.picasso.Picasso.with(this)
                .load("http://www.animhut.com/wp-content/uploads//2012/09/Download-iPhone5-Retina-HD-Wallpapers-20.jpg")
                .placeholder(R.color.colorPrimary)   // optional
                .error(R.drawable.b)      // optional
                .fit()// optional

                //.resize(400,1000)                        // optional
                .into(im2);

        com.squareup.picasso.Picasso.with(this)
                .load("https://s4827.pcdn.co/wp-content/uploads/2018/03/Abstract_iPhone_Wallpaper_9.jpg")
                .placeholder(R.drawable.a)   // optional
                 .error(R.drawable.b)      // optional
                .fit()// optional

                //.resize(400,400)                        // optional
                .into(im3);

        com.squareup.picasso.Picasso.with(this)
                .load("https://img.wallpapersafari.com/phone/640/1136/14/2/wkTRGJ.jpg")
                .placeholder(R.drawable.a)   // optional
                .error(R.drawable.b)      // optional
                .fit()// optional

                //.resize(400,400)                        // optional
                .into(im4);







    }
}
