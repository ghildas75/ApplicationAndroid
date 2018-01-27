package com.example.portable.laboexercice4;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Portable on 2017-11-01.
 */

public class AdapterListCar extends ArrayAdapter<Car> {


    private Context context;
    private Resources res;
    private int layoutItemList;
    private ArrayList<Car> lstCars;

    public AdapterListCar(Context context,int layoutItemList,ArrayList<Car> lstCars){

        super(context,layoutItemList,lstCars);
        this.context=context;
        this.layoutItemList=layoutItemList;
        res=context.getResources();
        this.lstCars=lstCars;
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        View view=convertView;


        if(view==null){
            LayoutInflater layoutInflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view=layoutInflater.inflate(layoutItemList,parent,false);
            Car car=lstCars.get(position);
            if(car!=null){

                TextView tv_m= (TextView)view.findViewById(R.id.model);
                TextView tv_c= (TextView)view.findViewById(R.id.col);
                TextView tv_p= (TextView)view.findViewById(R.id.prix);
                ImageView imageViewCours=(ImageView) view.findViewById(R.id.icon);
                tv_m.setText(car.getModel());
                tv_c.setText(car.getColor());
                tv_p.setText(car.getPrix()+"$");
                imageViewCours.setImageResource(car.getImage());



            }
        }
        return view;
    }

}
