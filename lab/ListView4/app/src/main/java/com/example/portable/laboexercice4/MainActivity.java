package com.example.portable.laboexercice4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_list);
        ArrayList<Car> lstCars = new ArrayList<Car>();
        init(lstCars);
        AdapterListCar adapter= new AdapterListCar(this,R.layout.item_list,lstCars);
        ListView lstView=(ListView) findViewById(R.id.idListCars);
        lstView.setAdapter(adapter);
    }


    private void init(ArrayList<Car> lstCars){

       lstCars.add(new Car("Hondaye","Red",20000,R.drawable.ferrari));
        lstCars.add(new Car("Mercedes","Gret",20000,R.drawable.vintage));
        lstCars.add(new Car("Sport","Red",10000,R.drawable.sport));
        lstCars.add(new Car("Chevrolet","Grey",10000,R.drawable.chevrolet));
        lstCars.add(new Car("Pontiac","Yellow",10000,R.drawable.pontiac));
        lstCars.add(new Car("Pickup","Yellow",10000,R.drawable.pickup));
        lstCars.add(new Car("Old time","Grey",10000,R.drawable.vintage));
        lstCars.add(new Car("Ferrari","RED",10000,R.drawable.sport));






    }
}
