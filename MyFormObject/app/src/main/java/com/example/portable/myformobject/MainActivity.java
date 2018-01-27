package com.example.portable.myformobject;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static int second_Call_id=1234;
    private  static EditText txtMatricule;
    private static  EditText txtLastName;
    private static RadioButton radioSelected;
    private  static Button btnDisplay;
    private static  EditText txtFirstname;
    private  static int idRadioSelected;
    private static RadioGroup rgSexe;
    private  static Intent intent;
    private RadioGroup rgStatus;
    private RadioButton radioStatus;
    private CheckBox chkFrench;
    private CheckBox chkEnglish;
    private CheckBox chkOther;
    private EditText input_other;
    private EditText input_Salaire;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         getValues();
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this, SecondActivity.class);
                Employe em = getEmploye();
                intent.putExtra(getString(R.string.key_employ),em);
                //Toast.makeText(MainActivity.this,""+MySalary,Toast.LENGTH_LONG).show();
                startActivity(intent);
            }
        });




    }


    private Employe getEmploye() {
        getSelect();
        Employe em= new Employe();
        em.setRegistration(txtMatricule.getText().toString());
        em.setLastName(txtLastName.getText().toString());
        em.setFirstName(txtFirstname.getText().toString());
        em.setGender(radioSelected.getText().toString());
        em.setCivilStatus(radioStatus.getText().toString());
        em.setSpokenLanguages(getLanguage());
        em.setSalary(Double.parseDouble(input_Salaire.getText().toString()));
        return em;
    }

    private void getSelect() {
        int idRadioSelected = rgSexe.getCheckedRadioButtonId();
        radioSelected = (RadioButton) findViewById(idRadioSelected);
        int idRadioStatus = rgStatus.getCheckedRadioButtonId();
        radioStatus = (RadioButton) findViewById(idRadioStatus);
    }

    private void getValues() {
        btnDisplay = (Button) findViewById(R.id.id_display);
        txtMatricule = (EditText) findViewById(R.id.idtxt_matricule);
        txtLastName = (EditText) findViewById(R.id.idtxt_lastName);
        txtFirstname = (EditText) findViewById(R.id.idtxt_firstName);
        rgSexe = (RadioGroup) findViewById(R.id.idSexe);
        rgStatus = (RadioGroup) findViewById(R.id.id_civil);

        input_other=(EditText) findViewById(R.id.idtxt_other);
        input_Salaire=(EditText)findViewById(R.id.idtxt_Salary);
        chkFrench = (CheckBox)findViewById(R.id.idChkFrench);
        chkEnglish = (CheckBox)findViewById(R.id.idChkEnglish);
        chkOther = (CheckBox)findViewById(R.id.idChkother);
    }

    private String getLanguage() {
        String language = "";

        if(chkFrench.isChecked()){
            language += chkFrench.getText();
        }
        if(chkEnglish.isChecked()){
            if(!language.equals("")){
                language +=", " + chkEnglish.getText();
            }
            else{
                language += chkEnglish.getText();
            }
        }
        if(chkOther.isChecked()){

            input_other.setVisibility(View.VISIBLE);
            if(!language.equals("")){

                language +=", " + input_other.getText().toString();

            }
            else{



                language += input_other.getText().toString();
            }
        }
        return language;
    }

    public void changeVisiblity(View view) {
        if(chkOther.isChecked())
        input_other.setVisibility(View.VISIBLE);
        else
            input_other.setVisibility(View.INVISIBLE);


    }
}
