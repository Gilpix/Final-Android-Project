package com.padda.listviewdemo;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
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
    TextView GridViewItems;

        static final String[] numbers = new String[] {


                "LEARN TUTORIALS", "DISPLAY DEMO"


        };

        @Override
        public void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);

            setContentView(R.layout.activity_grid_layout);

            gridView = (GridView) findViewById(R.id.gridview1);


            // Create adapter to set value for grid view
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_selectable_list_item, numbers);

            gridView.setAdapter(adapter);
            //gridView.setBackgroundColor(R.drawable.b);

            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {


                @Override
                public void onItemClick(AdapterView<?> parent, View v,
                                        int position, long id) {
                    //TextView tv = (TextView) v;
                    // Set the current selected item background color
                    //tv.setBackgroundColor(Color.parseColor("#FF9AD082"));
                    GridViewItems = (TextView) v;

                    GridViewItems.setBackgroundColor(Color.parseColor("#f85d4f"));

                    GridViewItems.setTextColor(Color.parseColor("#fdfcfa"));

                    GridViewItems.setAllCaps(true);
                    GridViewItems.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);




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

