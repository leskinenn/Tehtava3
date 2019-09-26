/*package com.example.tehtava3;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Adapter extends ArrayAdapter<Date> {
    public Button lisaa;
    private Context konteksti;
    private ArrayList<Date> dates = new ArrayList<>();

    public Adapter(@NonNull Context context, ArrayList<Date> pvm) {
        super(context, 0, pvm);
        //this.konteksti = context;
        //this.dates = pvm;
    }
    @Override

    public View getView(final int position, View convertView, ViewGroup parent){
        TextView teksti = (TextView) convertView.findViewById(android.R.id.simple_list_item_1);
        teksti.setText(dates.get(0).toString());
        LayoutInflater inflater = (LayoutInflater)konteksti.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView=inflater.inflate(R.layout.listview_row,null,true);
        final TextView nameTextField = (TextView) rowView.findViewById(R.id.textView1);
        nameTextField.setText(dates.get(position).toString());
        return convertView;
    }

}*/
