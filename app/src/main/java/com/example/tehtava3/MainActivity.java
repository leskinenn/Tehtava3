package com.example.tehtava3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MainActivity extends AppCompatActivity {

    //private ListView listView_content;
    private Button lisaa;
    private Button poista;
    private static Adapter adapteri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final ArrayList<Date> dates = new ArrayList<>();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_row);

        //listView_content.setAdapter(new ArrayAdapter<Date>(this,R.layout.activity_main,dates));

        //Adapter a = new Adapter(this,R.layout.activity_main,dates);

        //listView_content.setAdapter(Adapter());

        //this.listView_content = findViewById(R.id.lista);
        this.lisaa = findViewById(R.id.lisaa);
        this.poista = findViewById(R.id.poista);
        this.adapteri = new Adapter(this, dates);
        ListView listView = (ListView) findViewById(R.id.lista);
        listView.setAdapter(adapteri);
        lisaa.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Calendar calendar = new GregorianCalendar();
                adapteri.add(calendar.getTime());
                adapteri.notifyDataSetChanged();
            }
        });
       


    }
}
