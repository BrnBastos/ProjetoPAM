package com.example.learn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Externo extends AppCompatActivity {

    EditText txtComment;
    Button button;
    private int EXTERNAL_STORAGE_PERMISSION_CODE = 23;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_externo);

        txtComment = (EditText) findViewById(R.id.textComentario2);
        button = (Button) findViewById(R.id.btnGravado);

    }

    public void savePublicly(View view) {
        // Pede a permissão para acessar o armazenamento externo
        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},
                EXTERNAL_STORAGE_PERMISSION_CODE);
        String editTextData = txtComment.getText().toString();

        // getExternalStoragePublicDirectory() - Pega o diretório público de Downloads.
        File folder = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);

        // Armazena os dados obtidos num arquivo nomeado comentario.txt
        File file = new File(folder, "comentario.txt");
        writeTextData(file, editTextData);
        txtComment.setText("");
    }


    private void writeTextData(File file, String data) {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(data.getBytes());
            Toast.makeText(this, "Done" + file.getAbsolutePath(), Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public void mostrar(View view) {
        // Creating an intent to start a new activity
        Intent intent = new Intent(Externo.this, Vizualizar.class);
        startActivity(intent);
    }

    public void back(View view){
        Intent voltar = new Intent(this, Storage.class);
        startActivity(voltar);
    }
}