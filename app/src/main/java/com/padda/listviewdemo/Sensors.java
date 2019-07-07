package com.padda.listviewdemo;


import android.content.Intent;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Sensors extends AppCompatActivity implements SensorEventListener {


    Button b;
    EditText edit;



    TextView txtTemp, txtHum,txtPres;
    SensorManager sm;
    Sensor tem;
    Sensor humid,Press;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensors);



        b=findViewById(R.id.button2);
        edit=findViewById(R.id.textView);








        txtTemp = findViewById(R.id.tempText);
        txtHum = findViewById(R.id.humidText);
        txtPres=findViewById(R.id.presTxt);


        sm = (SensorManager) getSystemService(SENSOR_SERVICE);
        tem = sm.getDefaultSensor(Sensor.TYPE_AMBIENT_TEMPERATURE);
        Press=sm.getDefaultSensor(Sensor.TYPE_PRESSURE);
        humid=sm.getDefaultSensor(Sensor.TYPE_RELATIVE_HUMIDITY);
    }


    @Override
    protected void onStart() {
        super.onStart();
        sm.registerListener(this, tem, sm.SENSOR_DELAY_NORMAL);
        sm.registerListener(this, Press, sm.SENSOR_DELAY_NORMAL);
        sm.registerListener(this, humid, sm.SENSOR_DELAY_NORMAL);

    }

    @Override
    protected void onStop() {
        super.onStop();
        sm.unregisterListener((SensorEventListener) Sensors.this, tem);
        sm.unregisterListener((SensorEventListener) Sensors.this, Press);
        sm.unregisterListener((SensorEventListener) Sensors.this, humid);

    }


    @Override
    public void onSensorChanged(SensorEvent event) {
        if (event.sensor.getType() == Sensor.TYPE_AMBIENT_TEMPERATURE) {


            txtTemp.setText("Temperature : " + event.values[0]+" C");

            if(event.values[0]>50)txtTemp.setBackgroundColor(Color.RED);
            if(event.values[0]<0)txtTemp.setBackgroundColor(Color.BLUE);
            if(event.values[0]>15 && event.values[0]<=50)txtTemp.setBackgroundColor(Color.GREEN);

            if(event.values[0]==100) Toast.makeText(this, "Its Hot", Toast.LENGTH_SHORT).show();

        }


        if(event.sensor.getType()==Sensor.TYPE_PRESSURE) {
            txtPres.setText("Pressure : " + event.values[0]+" hpa");
            if(event.values[0]<400)txtPres.setBackgroundColor(Color.YELLOW);
            if(event.values[0]>=400 && event.values[0]<=800)txtPres.setBackgroundColor(Color.GREEN);
            if(event.values[0]>=800)txtPres.setBackgroundColor(Color.MAGENTA);
        }

        if(event.sensor.getType()==Sensor.TYPE_RELATIVE_HUMIDITY) {
            txtHum.setText("Humidity : " + event.values[0]+" %");
            if(event.values[0]<40)txtHum.setBackgroundColor(Color.DKGRAY);
            if(event.values[0]>=40 && event.values[0]<=70)txtHum.setBackgroundColor(Color.GRAY);
            if(event.values[0]>=70)txtHum.setBackgroundColor(Color.LTGRAY);

        }

    }

    @Override
    public void onAccuracyChanged (Sensor sensor,int accuracy){

    }



}




