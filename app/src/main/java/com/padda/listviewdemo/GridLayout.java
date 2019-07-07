package com.padda.listviewdemo;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;


public class GridLayout extends Activity {


        GridView gridView;

        static final String[] numbers = new String[] {


                "Tutorials", "Demo"


        };

        @Override
        public void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);

            setContentView(R.layout.activity_grid_layout);

            gridView = (GridView) findViewById(R.id.gridview1);


            // Create adapter to set value for grid view
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, numbers);

            gridView.setAdapter(adapter);

            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {


                @Override
                public void onItemClick(AdapterView<?> parent, View v,
                                        int position, long id) {


                    switch(position+1)
                    {
                        case 1:
                            Intent a = new Intent(GridLayout.this,Tutorials.class);
                            startActivity(a);
                            break;



                        case 2:
                            Intent b = new Intent(GridLayout.this,Demo.class);
                            startActivity(b);


                            break;


                        default:
                            break;


                    }


                }
            });

        }

    }