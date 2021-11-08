package com.example.student;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Adminpage1 extends AppCompatActivity {

    Button addStud,rankbut,display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminpage1);
        addStud=(Button)findViewById(R.id.addStud);
        rankbut=(Button)findViewById(R.id.rankbutn) ;
        display=(Button)findViewById(R.id.button2);
        addStud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Adminpage1.this,StudentRegister.class);
                startActivity(i);

            }
        });
        rankbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Adminpage1.this,View_Rank.class);
                startActivity(i);

            }
        });
        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Adminpage1.this,viewstudent.class);
                startActivity(i);

            }
        });
    }
}