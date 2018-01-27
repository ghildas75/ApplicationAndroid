package com.example.portable.realmadrid;

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
 * Created by Portable on 2017-11-09.
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
    public View getView(int position, View convertView, ViewGroup parent) {
        View view=convertView;
        if(view==null){
            LayoutInflater layoutInflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view=layoutInflater.inflate(layoutItemList,parent,false);
            Player player=lstPlayers.get(position);
            if(player!=null){

                TextView tv_fullName= (TextView)view.findViewById(R.id.id_fullname);
                TextView tv_ddn= (TextView)view.findViewById(R.id.id_ddn);
                TextView tv_placebBirth= (TextView)view.findViewById(R.id.id_placebirth);
                TextView tv_height= (TextView)view.findViewById(R.id.id_height);
                TextView tv_Number= (TextView)view.findViewById(R.id.id_number);
                ImageView imageViewCours=(ImageView) view.findViewById(R.id.id_img);
                TextView tv_role= (TextView)view.findViewById(R.id.id_role);
                tv_fullName.setText(player.getFullName()+"\t");
                tv_ddn.setText(player.getDateBirth()+"\t");
                tv_placebBirth.setText(player.getPlaceBirth());
                tv_height.setText(player.getHeight());
                tv_Number.setText(""+player.getNumber());
                tv_role.setText(player.getRole());
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
