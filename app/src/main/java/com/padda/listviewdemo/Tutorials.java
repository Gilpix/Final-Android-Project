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


public class Tutorials extends AppCompatActivity {

    ListView list;
    ImageView im;
    String  name []={"Activity Life Cycle","Sensor","Intent","Fragment","Picasso","Recycler View"};

    int signsImage[] = {R.drawable.t,R.drawable.t,R.drawable.t,R.drawable.t,R.drawable.t,R.drawable.t
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
                        Intent a = new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/guide/components/activities/activity-lifecycle"));
                        startActivity(a);
                        break;



                    case 2:
                        Intent b = new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/guide/topics/sensors/sensors_overview"));
                        startActivity(b);


                        break;

                    case 3:
                        Intent c = new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/reference/android/content/Intent"));
                        startActivity(c);


                        break;


                    case 4:
                        Intent d = new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/guide/components/fragments"));
                        startActivity(d);

                        break;


                    case 5:
                        Intent e = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.simplifiedcoding.net/picasso-android-tutorial-picasso-image-loader-library/"));
                        startActivity(e);

                        break;


                    case 6:
                        Intent f = new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/guide/topics/ui/layout/recyclerview"));
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
