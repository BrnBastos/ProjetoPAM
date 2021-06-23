package com.example.learn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Content_2 extends AppCompatActivity {

    private ImageView open_tutorial1;

    private ImageView testeEstudas;

    private ImageView cronograma_name;

    private ImageView humanas_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content2);


    open_tutorial1 = (ImageView) findViewById(R.id.img_ruiva);

    open_tutorial1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        startActivity( new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=sZu6LRb1XLQ")));
        }
    });
        testeEstudas = (ImageView) findViewById(R.id.estudas_id);

        testeEstudas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Viy45i8PGnY")));


            }
        });

        cronograma_name = (ImageView) findViewById(R.id.img_cronograma);

        cronograma_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=aqazAdlFgTY")));
            }
        });

        humanas_name = (ImageView) findViewById(R.id.img_Humanas);

        humanas_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=yKI8CKJbpYs")));
            }
        });


    }

    public void TelaCont3(View view){

        Intent intent = new Intent(getApplicationContext(), Content_3.class);
        startActivity(intent);
    }

    public void TelaCont(View view){

        Intent intent = new Intent(getApplicationContext(), Content_1.class);
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