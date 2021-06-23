package com.example.learn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu_inicial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_inicial);
    }

    public void TelaEquip(View view){

        Intent intent = new Intent(getApplicationContext(), Equip.class);
        startActivity(intent);
    }

    public void TelaContent(View view){

        Intent intent = new Intent(getApplicationContext(), Content_1.class);
        startActivity(intent);
    }

}