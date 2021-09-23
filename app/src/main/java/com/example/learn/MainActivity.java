package com.example.learn;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText mNameEt, mAgeEt;
    CheckBox mRemember;
    Button mBtn;
    SharedPreferences preferences;
    boolean isRemembered = false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNameEt = findViewById(R.id.editName);
        mAgeEt = findViewById(R.id.editAge);
        mRemember = findViewById(R.id.checkBox);
        mBtn = findViewById(R.id.login);

        preferences = getSharedPreferences("SHARED_PREF", MODE_PRIVATE);

        isRemembered = preferences.getBoolean("CHECKBOX", false);

       if(isRemembered){
            Intent intent = new Intent(MainActivity.this, AnotherActivity.class);
            startActivity(intent);
            finish();
        }


        mBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                    String name = mNameEt.getText().toString();
                    int age = Integer.parseInt(mAgeEt.getText().toString().trim());
                    boolean checked = mRemember.isChecked();

                    SharedPreferences.Editor editor = preferences.edit();
                    editor.putString("NAME", name);
                    editor.putInt("AGE", age);
                    editor.putBoolean("CHECKBOX", checked);
                    editor.apply();

                    Toast.makeText(MainActivity.this, "Salvo com sucesso", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(MainActivity.this, AnotherActivity.class);
                    startActivity(intent);
                    finish();
            }

        });



    }
}
