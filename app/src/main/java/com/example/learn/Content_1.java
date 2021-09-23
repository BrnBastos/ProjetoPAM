package com.example.learn;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Service;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.security.Provider;

public class Content_1 extends AppCompatActivity implements SensorEventListener {

    TextView txtView7, txtView21;

    SensorManager sensorManager;
    Sensor sensor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content1);

        txtView7 = (TextView) findViewById(R.id.textView7);
        txtView21 = (TextView) findViewById(R.id.textView21);

        sensorManager = (SensorManager) getSystemService(Service.SENSOR_SERVICE);
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_LIGHT);

    }

    @Override
    protected void onPause() {
        super.onPause();
        sensorManager.unregisterListener(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        sensorManager.registerListener(this, sensor, SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        if(event.sensor.getType() == Sensor.TYPE_LIGHT){


            if(event.values[0]>2000) {

                txtView7.setTextColor(getResources().getColor(R.color.white));
                txtView21.setTextColor(getResources().getColor(R.color.white));



            }
        }

    }

  /*  @Override
    public void onSensorChanged(SensorEvent event) {
        if(event.sensor.getType() == Sensor.TYPE_LIGHT){
            if(event.values[0] > 2000){
                textView1.setTextColor(getResources().getColor(R.color.white));
                textView2.setTextColor(getResources().getColor(R.color.white));
                textView3.setTextColor(getResources().getColor(R.color.white));
                textView4.setTextColor(getResources().getColor(R.color.white));
                activity.setBackgroundResource(R.color.bg2);
                button.setBackgroundColor(getResources().getColor(R.color.amarelo_darkmode));
            }
        }
    }*/

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }


    public void TelaCont3(View view){

        Intent intent = new Intent(getApplicationContext(), Content_3.class);
        startActivity(intent);
    }

    public void TelaCont2(View view){

        Intent intent = new Intent(getApplicationContext(), Content_2.class);
        startActivity(intent);
    }

    public void TelaEquip(View view){

        Intent intent = new Intent(getApplicationContext(), Equip.class);
        startActivity(intent);
    }

    public void TelaHome(View view){

        Intent intent = new Intent(getApplicationContext(), Menu_inicial.class);
        startActivity(intent);
    }


}