package com.example.learn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

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

    public void abrirEmail(View view)

    {

        Uri uri = Uri.parse("https://play.google.com/store?hl=pt_BR&gl=US");

        Intent it = new Intent(Intent.ACTION_VIEW,uri);

        startActivity(Intent.createChooser(it, getString(R.string.email)));



    }

}