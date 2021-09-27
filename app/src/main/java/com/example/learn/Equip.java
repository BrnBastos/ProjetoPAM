package com.example.learn;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import org.json.JSONArray;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.time.LocalDateTime;
import java.util.ArrayList;

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
    public void TelaGeo(View view){

        Intent intent = new Intent(getApplicationContext(), GeoLocation.class);
        startActivity(intent);
    }

}
