package com.popland.pop.aboutautocompletetextview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by hai on 14/08/2016.
 */
public class CustomListAdapterr extends ArrayAdapter<suggestion> {
    public CustomListAdapterr(Context context, int resource, List<suggestion> objects) {
        super(context, resource, objects);
    }
    public View getView(int position,View convertView,ViewGroup parent){
        LayoutInflater inflater = LayoutInflater.from(getContext());
        convertView = inflater.inflate(R.layout.custom_search,null);
        suggestion p = getItem(position);
        if(p!=null){
            ImageView IV = (ImageView)convertView.findViewById(R.id.IV);
            IV.setImageResource(p.anh);
            TextView TV = (TextView)convertView.findViewById(R.id.TV);
            TV.setText(p.ten);
        }
        return convertView;
    }
}
