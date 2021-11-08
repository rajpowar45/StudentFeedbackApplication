
package com.example.student;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class StudentFeedback extends AppCompatActivity {

    private int mYear, mMonth, mDay;
    EditText txtDate;


    Spinner spinner, spinner1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_feedback);

        spinner = (Spinner)findViewById(R.id.spinner);
        List<String> list = new ArrayList<String>();
        list.add("Select Course");
        list.add("Computer");

        Button btnNext = findViewById(R.id.next_btn);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StudentFeedback.this,stud_course.class);
                //startActivity(intent);
                String s1 = spinner.getSelectedItem().toString();
                if(!s1.equals("Computer")){
                    Toast.makeText(StudentFeedback.this,"Please select Your course",Toast.LENGTH_SHORT).show();
                    return;
                }

                String s2 = spinner1.getSelectedItem().toString();
                if(!s2.equals("CO4i")){
                    Toast.makeText(StudentFeedback.this,"Please select Your Semester",Toast.LENGTH_SHORT).show();
                    return;
                }
                Bundle bundle = getIntent().getExtras();
                assert bundle !=null;
                final String username=bundle.getString("Username");
                intent.putExtra("course",s1);
                intent.putExtra("sem",s2);
                intent.putExtra("username",username);

                startActivity(intent);

            }
        });
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(arrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                spinner.setSelection(position);


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        spinner1 = (Spinner)findViewById(R.id.spinner1);
        List<String> list1 = new ArrayList<String>();
        list1.add("Select sem");
        list1.add(" ");
        list1.add("");
        list1.add("CO4i");
       // list1.add("CO6i");

        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,list1);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner1.setAdapter(arrayAdapter1);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                spinner1.setSelection(position);



            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }


}