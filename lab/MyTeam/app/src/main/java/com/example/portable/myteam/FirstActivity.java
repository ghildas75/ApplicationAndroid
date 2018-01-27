package com.example.portable.myteam;

import android.content.Intent;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    private Button btnList;
    private Button btnPlayer;
    private final  int first_call=1234;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first2);
        getValue(null);
        btnList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(FirstActivity.this,SecondActivity.class);
               // startActivity(intent);
                startActivityForResult(intent, first_call);
            }
        });
        btnPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(FirstActivity.this,ThirdActivity.class);
                startActivity(intent);
                //startActivityForResult(intent, first_call);
            }
        });
    }

    protected  void onActivityResult(int requestCode,int resultcode, Intent data){

        super.onActivityResult(requestCode,resultcode,data);
        if(requestCode==first_call){
           String close=data.getStringExtra("heureclose");
            Toast.makeText(this, "date de fermuture"+close+" "+resultcode, Toast.LENGTH_LONG).show();

        }
    }

    private void getValue(View view){
        
        btnList=(Button) findViewById(R.id.id_btnListPlayer);
        btnPlayer=(Button) findViewById(R.id.id_btnPlayer);
    }


}
