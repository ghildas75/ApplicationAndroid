package com.example.portable.myformobject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

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
          getVar();
          getResult();
    }

    private void getResult() {
        Intent intent=getIntent();
        Employe em_get= (Employe) (intent.getSerializableExtra(getString(R.string.key_employ)));
        input_Matricule.setText(em_get.getRegistration());
        input_FullName.setText(em_get.getLastName()+","+em_get.getFirstName());
        lbl_Sexe.setText(em_get.getGender());
        lbl_Status.setText(em_get.getCivilStatus());
        lbl_Languages.setText(em_get.getSpokenLanguages());
        lbl_salary.setText(String.valueOf(em_get.getSalary())+getString(R.string.str_devise));
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
