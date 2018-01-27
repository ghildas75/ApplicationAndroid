package com.example.portable.myteam;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Portable on 2017-11-08.
 */

public class AdapterListPlayer extends ArrayAdapter<Player> {

    private Context context;
    private Resources res;
    private int layoutItemList;
    private ArrayList<Player> lstPlayers;

    public AdapterListPlayer(Context context,int layoutItemList,ArrayList<Player> lstPlayers){

        super(context,layoutItemList,lstPlayers);
        this.context=context;
        this.layoutItemList=layoutItemList;
        res=context.getResources();
        this.lstPlayers=lstPlayers;
    }


    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        View view=convertView;
        if(view==null){
            LayoutInflater layoutInflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view=layoutInflater.inflate(layoutItemList,parent,false);
            Player player=lstPlayers.get(position);
            if(player!=null){

                TextView tv_place= (TextView)view.findViewById(R.id.id_place);
                TextView tv_age= (TextView)view.findViewById(R.id.id_age);
                TextView tv_name= (TextView)view.findViewById(R.id.id_name);
                ImageView imageViewCours=(ImageView) view.findViewById(R.id.id_img);
                tv_place.setText(player.getPlace()+"   \t");
                tv_age.setText(player.getAge()+" ans ");
                tv_name.setText(player.getName());
                imageViewCours.setImageResource(player.getImage());



            }
        }
        return view;
    }


    @Override
    public int getCount() {
        return lstPlayers.size();
    }
}
