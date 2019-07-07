package com.padda.listviewdemo;


import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Fragments extends AppCompatActivity {

    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragments);
        b1=findViewById(R.id.button1);
        b2=findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment1 F1= new Fragment1();
                FragmentManager FM= getSupportFragmentManager();
                FragmentTransaction FT=FM.beginTransaction();
                FT.replace(R.id.relative1,F1);
                FT.commit();

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment2 F2= new Fragment2();
                FragmentManager FM= getSupportFragmentManager();
                FragmentTransaction FT=FM.beginTransaction();
                FT.replace(R.id.relative1,F2);
                FT.commit();

            }
        });

    }

    public static class Fragment1 extends Fragment
    {
        @Nullable
        @Override
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            return inflater.inflate(R.layout.fragment1,container,false);
        }
    }

    public static class Fragment2 extends Fragment
    {
        @Nullable
        @Override
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            return inflater.inflate(R.layout.fragment2,container,false);
        }
    }



}
