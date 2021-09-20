package com.example.learn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.io.UnsupportedEncodingException;

public class Equip extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equip);
    }

    public void abrirTel(View view ){

        Uri uri = Uri.parse("tel:11 98888-7777");

        Intent it = new Intent(Intent.ACTION_DIAL, uri);

        startActivity(it);

}

    public void TelaHome(View view){

        Intent intent = new Intent(getApplicationContext(), Menu_inicial.class);
        startActivity(intent);
    }

    public void TelaContent(View view){

        Intent intent = new Intent(getApplicationContext(), Content_1.class);
        startActivity(intent);
    }

    public void TelaLocation(View view){

        Intent intent = new Intent(getApplicationContext(), Location.class);
        startActivity(intent);
    }




}
