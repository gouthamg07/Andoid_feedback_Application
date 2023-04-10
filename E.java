package com.example.feedbak;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;


import java.util.ArrayList;

public class E extends AppCompatActivity {
    AutoCompleteTextView autoCompleteTxt;

    ArrayAdapter<String> adapterItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        autoCompleteTxt= findViewById(R.id.auto_complete_txt);

        ArrayList<String> lecturers= new ArrayList<String>();
        lecturers.add("Dr.Praveen Gujjar");
        lecturers.add("Mr.Naveen Kumar V");
        lecturers.add("Dr.Lakshmi S");
        lecturers.add("Dr.Sudarshan Reddy");
        lecturers.add("Dr.Moovendhan V");


        adapterItems = new ArrayAdapter<String>(this, R.layout.lecturersdesign, lecturers);


        autoCompleteTxt.setAdapter(adapterItems);
        final String[] l = {""};
        int[] pos = new int[5];
        autoCompleteTxt.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                l[0] = parent.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(), l[0],Toast.LENGTH_SHORT).show();
                pos[0]=position;
                adapterItems.notifyDataSetChanged();

            }
        });

    }
}