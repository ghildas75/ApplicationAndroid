package com.example.portable.realmadrid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;

public class FirstActivity extends AppCompatActivity {

    private    Button btnlogin;
    private EditText txtUser;
    private EditText txtPswd;
    private ArrayList<Login> lstUser=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        btnlogin=(Button) findViewById(R.id.id_btnLogin);
        txtUser=(EditText) findViewById(R.id.id_user);
        txtPswd=(EditText) findViewById(R.id.id_pswd);


        init(lstUser);


        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

              String  strUser=txtUser.getText().toString();
               String  strPswd=txtPswd.getText().toString();

               Login log=new Login();
                log.setUsername(strUser);
                log.setPswd(strPswd);
                for (int i = 0; i < lstUser.size(); i++) {
                   // Toast.makeText(FirstActivity.this, log.getUsername(), Toast.LENGTH_SHORT).show();
                    if (lstUser.get(i).equals(log)) {
                       // Toast.makeText(FirstActivity.this, "", Toast.LENGTH_LONG).show();
                        Intent intent= new Intent(FirstActivity.this,SecondActivity.class);
                        log.setType(lstUser.get(i).getType());
                        log.setFirstname(lstUser.get(i).getFirstname());
                        log.setLastname(lstUser.get(i).getLastname());
                        intent.putExtra("myuser",log);
                        startActivity(intent);

                    }
                    else {
                        Toast.makeText(FirstActivity.this, "user name or pswd invalid", Toast.LENGTH_SHORT).show();
                        return;
                        }
                }

            }

        });

    }

    private void init(ArrayList<Login> lstUser){
        
        lstUser.add(new Login("Maria","Carey","Regulier","mcarey","user1"));
        lstUser.add(new Login("Pierre ","Antoine","Partiel","pantoine","user2"));
        lstUser.add(new Login("Tremblay","Etienne","Regulier","tetienne","user3"));
        
    }
}
