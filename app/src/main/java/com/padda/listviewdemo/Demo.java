package com.padda.listviewdemo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

import java.util.Collections;


public class Demo extends AppCompatActivity {

    ListView list;
    ImageView im;
    String  name []={"Activity LifeCycle Demo","Sensor Demo","Intent Demo","Fragment Demo","Picasso Demo","Recycler View Demo"};

    int signsImage[] = {R.drawable.d,R.drawable.d,R.drawable.d,R.drawable.d,R.drawable.d,R.drawable.d
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        im=findViewById(R.id.icon);
        list=findViewById(R.id.list);




        RegulatoryCustomAdapter customAdapter = new RegulatoryCustomAdapter(this,name,signsImage);
        list.setAdapter(customAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(getApplicationContext(), "selected Item Name is " , Toast.LENGTH_LONG).show();


                switch(position+1)
                {
                    case 1:
                        Intent a = new Intent(Demo.this,LifeCycle.class);
                        startActivity(a);
                        break;



                    case 2:
                        Intent b = new Intent(Demo.this,Sensors.class);
                        startActivity(b);


                        break;

                    case 3:
                        Intent c = new Intent(Demo.this,Intents.class);
                        startActivity(c);


                        break;


                    case 4:
                        Intent d = new Intent(Demo.this,Fragments.class);
                        startActivity(d);

                        break;


                    case 5:
                        Intent e = new Intent(Demo.this,Picasso.class);
                        startActivity(e);

                        break;

                    case 6:
                        Intent f = new Intent(Demo.this,Recycler.class);
                        startActivity(f);

                        break;

                    default:
                        break;


                }


            }
        });









        //ArrayAdapter adapter=new ArrayAdapter<String>(this,R.layout.reugulatory_list_view,R.id.textView,name);



        //list.setAdapter(adapter);
        //im.setImageResource(signsImage[1]);



        int length =name.length;

        //String st =list.getOnItemClickListener(new ViewOn)






    }
}
