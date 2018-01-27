package com.example.portable.myteam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FourActivity extends AppCompatActivity {

    private TextView resultName;
    private TextView resultRole;
    private TextView resultAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
        getValues();
        getResult();
    }

    private void getResult() {
        Intent intent=getIntent();
        Player playerIn= (Player) intent.getSerializableExtra("currentplayer");
        resultName.setText(playerIn.getName());
        resultRole.setText(playerIn.getPlace());
        resultAge.setText(playerIn.getAge()+" an");

    }


    private void getValues(){

        resultName=(TextView) findViewById(R.id.lbl_fullname);
        resultRole=(TextView)findViewById(R.id.lbl_role);
        resultAge=(TextView)findViewById(R.id.lbl_age);

    }

}
