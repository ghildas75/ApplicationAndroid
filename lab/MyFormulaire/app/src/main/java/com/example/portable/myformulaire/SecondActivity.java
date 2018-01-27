package com.example.portable.myformulaire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private TextView input_Matricule;
    private TextView input_FullName;
    private TextView lbl_Sexe;
    private TextView lbl_Status;
    private TextView lbl_Languages;
    private TextView lbl_salary;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
          inputData();


    }

    private void inputData() {
        Intent intent= this.getIntent();
        getVar();
        String input_matricule=intent.getStringExtra(getString(R.string.key_matricule));
        String input_lastname=intent.getStringExtra(getString(R.string.key_lastname));
        String input_firstname=intent.getStringExtra(getString(R.string.key_firstname));
        String input_sexe=intent.getStringExtra(getString(R.string.key_sexe));
        String input_status=intent.getStringExtra(getString(R.string.key_civilStatus));
        String input_languages=intent.getStringExtra(getString(R.string.key_spoken));
        String input_name=input_lastname+", "+input_firstname;
        Double input_salary=intent.getDoubleExtra(getString(R.string.key_salary),0);
        input_Matricule.setText(input_matricule);
        input_FullName.setText(input_name);
        lbl_Sexe.setText(input_sexe);
        lbl_Status.setText(input_status);
        lbl_Languages.setText(input_languages);
        lbl_salary.setText(input_salary+getString(R.string.str_currency));
    }

    private void getVar() {
        input_Matricule=(TextView) findViewById(R.id.idlbl_matricule);
        input_FullName=(TextView) findViewById(R.id.idlblFullName);
        lbl_Sexe=(TextView) findViewById(R.id.idlbl_sexe);
        lbl_Status=(TextView) findViewById(R.id.id_lblstatus);
        lbl_Languages=(TextView) findViewById(R.id.idlbl_SpokenLanguage);
        lbl_salary=(TextView) findViewById(R.id.idlbl_salary);
    }
}
