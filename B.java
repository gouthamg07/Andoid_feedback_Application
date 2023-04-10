package com.example.feedbak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;
import java.util.HashMap;

import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.auth.FirebaseAuth;

public class B extends AppCompatActivity {

    // String[] lecturers={"Dr.Praveen","Naveen","Manoj","Goutham","nikil"};

    AutoCompleteTextView autoCompleteTxt;

    ArrayAdapter<String> adapterItems;

    private FirebaseFirestore db;
    private Button button;
    private RadioGroup rgg;
    private RadioButton b1;
    private RadioButton b2;
    private RadioButton b3;
    private RadioGroup rg1;
    private RadioButton b5;
    private RadioButton b4;
    private RadioButton b6;


    private FirebaseAuth auth;
    private HashMap<String, Object> map = new HashMap<>();
    private FirebaseDatabase _firebase = FirebaseDatabase.getInstance();
    private Intent i = new Intent();



    //private HashMap<String, Object> map = new HashMap<>();

    // private DatabaseReference Companies_List = _firebase.getReference("Companies_List");

    private DatabaseReference feedback = _firebase.getReference("B section"+"/"+FirebaseAuth.getInstance().getCurrentUser().getUid());
    private DatabaseReference section = _firebase.getReference("B section "+"/"+FirebaseAuth.getInstance().getCurrentUser().getUid());
    private DatabaseReference course = _firebase.getReference("B section"+"/"+FirebaseAuth.getInstance().getCurrentUser().getUid());
    private ChildEventListener _Companies_List_child_listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a
        );
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        button = findViewById(R.id.btn);
        b1 = (RadioButton) findViewById(R.id.b1);
        b2 = (RadioButton) findViewById(R.id.b2);
        rgg =findViewById(R.id.rg);
        b3 = (RadioButton) findViewById(R.id.b3);
        b4 = (RadioButton) findViewById(R.id.b4);
        b5 = (RadioButton) findViewById(R.id.b5);
        rg1 =findViewById(R.id.rg1);
        b6 = (RadioButton) findViewById(R.id.b6);

        autoCompleteTxt= findViewById(R.id.auto_complete_txt);
        auth = FirebaseAuth.getInstance();

        ArrayList<String> lecturers= new ArrayList<String>();
        lecturers.add("Dr.Praveen Gujjar");
        lecturers.add("Mr.Naveen Kumar V");
        lecturers.add("Dr.Lakshmi S");
        lecturers.add("Dr.Sudarshan Reddy");
        lecturers.add("Dr.Moovendhan V");



        adapterItems = new ArrayAdapter<String>(this,R.layout.lecturersdesign,lecturers);


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



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                map = new HashMap<>();
                map.put("lecture", l[0]);

                if (lecturers.size() != 1) {
                    if (b1.isChecked()) {
                        map.put("feedback", "Excellent");
                        map.put("section", "B");
                        Toast.makeText(B.this, "Submitted", Toast.LENGTH_SHORT).show();
                        lecturers.remove(l[0]);
                        autoCompleteTxt.refreshDrawableState();

                        feedback.push().updateChildren(map);
                        map.clear();
                        autoCompleteTxt.setText(autoCompleteTxt.getAdapter().getItem(0).toString(), false);
                        autoCompleteTxt.showDropDown();
                        adapterItems.notifyDataSetChanged();
                        rgg.clearCheck();



                    }

                    if (b2.isChecked()) {
                        map.put("feedback", "Good");
                        map.put("section", "B");
                        Toast.makeText(B.this, "Submitted", Toast.LENGTH_SHORT).show();
                        lecturers.remove(l[0]);
                        autoCompleteTxt.refreshDrawableState();
                        adapterItems.notifyDataSetChanged();
                        feedback.push().updateChildren(map);
                        map.clear();
                        autoCompleteTxt.setText(autoCompleteTxt.getAdapter().getItem(0).toString(), false);

                        autoCompleteTxt.showDropDown();
                        rgg.clearCheck();


                    }
                    if (b3.isChecked()) {
                        map.put("feedback", "Average");
                        map.put("section", "B");
                        Toast.makeText(B.this, "Submitted", Toast.LENGTH_SHORT).show();
                        lecturers.remove(l[0]);
                        autoCompleteTxt.refreshDrawableState();
                        adapterItems.notifyDataSetChanged();
                        feedback.push().updateChildren(map);
                        map.clear();
                        autoCompleteTxt.setText(autoCompleteTxt.getAdapter().getItem(0).toString(), false);

                        autoCompleteTxt.showDropDown();
                        rgg.clearCheck();


                    }

                    if (b4.isChecked()) {
                        map.put("course", "Excellent");

                        Toast.makeText(B.this, "Submitted", Toast.LENGTH_SHORT).show();
                        lecturers.remove(l[0]);
                        autoCompleteTxt.refreshDrawableState();

                        feedback.push().updateChildren(map);
                        map.clear();
                        autoCompleteTxt.setText(autoCompleteTxt.getAdapter().getItem(0).toString(), false);
                        autoCompleteTxt.showDropDown();
                        adapterItems.notifyDataSetChanged();
                        rg1.clearCheck();



                    }

                    if (b5.isChecked()) {
                        map.put("course", "Good");

                        Toast.makeText(B.this, "Submitted", Toast.LENGTH_SHORT).show();
                        lecturers.remove(l[0]);
                        autoCompleteTxt.refreshDrawableState();
                        adapterItems.notifyDataSetChanged();
                        feedback.push().updateChildren(map);
                        map.clear();
                        autoCompleteTxt.setText(autoCompleteTxt.getAdapter().getItem(0).toString(), false);

                        autoCompleteTxt.showDropDown();
                        rg1.clearCheck();


                    }
                    if (b6.isChecked()) {
                        map.put("course", "Average");

                        Toast.makeText(B.this, "Submitted", Toast.LENGTH_SHORT).show();
                        lecturers.remove(l[0]);
                        autoCompleteTxt.refreshDrawableState();
                        adapterItems.notifyDataSetChanged();
                        feedback.push().updateChildren(map);
                        map.clear();
                        autoCompleteTxt.setText(autoCompleteTxt.getAdapter().getItem(0).toString(), false);

                        autoCompleteTxt.showDropDown();
                        rg1.clearCheck();


                    }


                }
                else {
                    Intent i = new Intent(B.this, sections.class);
                    startActivity(i);
                }
            }
        });





    }


}
