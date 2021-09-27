package com.example.learn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Content_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content3);
    }

    public void TelaCont(View view){

        Intent intent = new Intent(getApplicationContext(), Content_1.class);
        startActivity(intent);
    }

    public void TelaCont2(View view){

        Intent intent = new Intent(getApplicationContext(), Content_2.class);
        startActivity(intent);
    }

    public void TelaCont3(View view){

        Intent intent = new Intent(getApplicationContext(), Content_3.class);
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

    public void TelaCaderno(View view){

        Intent intent = new Intent(getApplicationContext(), Storage.class);
        startActivity(intent);
    }


}