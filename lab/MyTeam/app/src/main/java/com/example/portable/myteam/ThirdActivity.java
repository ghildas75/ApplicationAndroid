package com.example.portable.myteam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {

    private Button btnDidplay;
    private EditText input_name;
    private EditText input_age;
    private RadioGroup radio_place;
    private RadioButton RadioChoise;
    private ImageView Image;
    private int idBtnSelected;
    private Player player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        getInput(null);


        btnDidplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(ThirdActivity.this,FourActivity.class);
                player= getPlayer(null);
                idBtnSelected=radio_place.getCheckedRadioButtonId();
                RadioChoise= (RadioButton)findViewById(idBtnSelected);
                player.setPlace(RadioChoise.getText().toString());
                 intent.putExtra("currentplayer",player);

                Toast.makeText(ThirdActivity.this,RadioChoise.getText().toString(), Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
      }

    private  Player  getPlayer(View v){
        Player p=new Player();
        p.setName((input_name.getText().toString()));
        p.setAge(Integer.parseInt(input_age.getText().toString()));
        p.setImage(R.id.id_photo);
        return p;
    }

    private void getInput(View v){
        input_name=(EditText)findViewById(R.id.id_fullname);
        input_age=(EditText) findViewById(R.id.id_inputAge);
        radio_place=(RadioGroup) findViewById(R.id.id_rgroupe);
        btnDidplay=(Button)findViewById(R.id.id_display);
        Image=(ImageView) findViewById(R.id.id_photo);


    }
}
