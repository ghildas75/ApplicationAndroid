package com.example.portable.myteam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class SecondActivity extends AppCompatActivity {

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_player);
         intent=this.getIntent();
        ArrayList<Player> lst_player= new ArrayList<Player>();
        init(lst_player);
        AdapterListPlayer adapter= new AdapterListPlayer(this,R.layout.one_player,lst_player);
        ListView lstView=(ListView) findViewById(R.id.idListPlayer);
        lstView.setAdapter(adapter);

    }


    public boolean onCreateOptionsMenu(Menu menu) {
      getMenuInflater().inflate(R.menu.menu_second,menu);
       return  true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId()){

            case R.id.id_menu_next:

                return true;

            case R.id.id_menu_prev:
                Calendar calendar=Calendar.getInstance();
                int year=calendar.get(Calendar.YEAR);
                int month=calendar.get(Calendar.MONTH);
                int day=calendar.get(Calendar.DAY_OF_MONTH);
                int heure=calendar.get(Calendar.HOUR_OF_DAY);
                int min=calendar.get(Calendar.MINUTE);
                String dateClose= day+"/"+month+"/"+year+""+heure+":"+min;
                intent.putExtra("heureclose",dateClose);
                setResult(33,intent);
               finish();
                return true;

           }


        return super.onOptionsItemSelected(item);
    }

    public  void init(ArrayList<Player> lstPlayer){
        lstPlayer.add(new Player("Cristiano Ronaldo","Attaquant",34,R.drawable.cristiano_ronaldo));
        lstPlayer.add(new Player("Gareth Bale","Attaquant",28,R.drawable.gareth_baie));
        lstPlayer.add(new Player("Isco","Milieu de terrain",25,R.drawable.isco));
        lstPlayer.add(new Player(" KeylorNavas","Gardien de but",30,R.drawable.keylor_navas));
    }



}
