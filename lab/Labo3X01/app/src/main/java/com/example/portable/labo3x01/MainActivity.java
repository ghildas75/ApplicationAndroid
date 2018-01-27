package com.example.portable.labo3x01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button btnNewEmploy=(Button) findViewById(R.id.btnNewEmploye);
        Button btnLstEmploy=(Button) findViewById(R.id.btnListEmploye);
         btnNewEmploy.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent= new Intent(MainActivity.this,ActivityNouvelEmploye.class);
                 startActivity(intent);
             }
         });

        btnLstEmploy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,ActivityListeEmploye.class);
                startActivity(intent);
            }
        });
    }
}
