package com.example.portable.demoselect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  public final static String MY_TAG="the_custom_message";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(MY_TAG,"before create");
        setContentView(R.layout.activity_main);
        Log.i(MY_TAG,"on create");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;


    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case R.id.menu_other:
                Toast.makeText(this, "other mennu", Toast.LENGTH_LONG).show();
                return true;
            case R.id.menu_setting:
                Toast.makeText(this, "setting mennu", Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }



    }
}
