package com.example.portable.realmadrid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_player);
        Intent intent= this.getIntent();
        Login log= (Login) intent.getSerializableExtra("myuser");
        String lastname=log.getLastname();
        String firstname=log.getFirstname();
        String role=log.getType();
        Toast.makeText(this,lastname+""+firstname+" "+role, Toast.LENGTH_SHORT).show();
        TextView lbl_message=(TextView) findViewById(R.id.id_lb_ms);
        lbl_message.setText(lastname+" "+firstname+" "+role);
        ArrayList<Player> lst_player= new ArrayList<Player>();
        init(lst_player);
        AdapterListPlayer adapter= new AdapterListPlayer(this,R.layout.one_player,lst_player);
        ListView lstView=(ListView) findViewById(R.id.idListPlayer);
        lstView.setAdapter(adapter);

    }

    public  void init(ArrayList<Player> lstPlayer){
        lstPlayer.add(new Player("Gareth Bale","16-07-1989","Wales","1,83",11,R.drawable.gareth_baie,"Attaquant"));
        lstPlayer.add(new Player("Isco","21 avril 1992","Spain","1,76 m",22,R.drawable.isco,"Milieu de terrain"));
        lstPlayer.add(new Player("Keylor antonio","15-12-1986","Costarica","1,85",1,R.drawable.keylor_navas,"Gardien de but"));
        lstPlayer.add(new Player("Marcelo Vierra","12-05-1988","Brazil","1,80",11,R.drawable.marcelo_vieira,"Defenseur"));


    }

}
