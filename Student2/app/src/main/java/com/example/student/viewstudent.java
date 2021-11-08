package com.example.student;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class viewstudent extends AppCompatActivity {

    EditText  name,course,semester,grnno,user;
    DatabaseReference databaseReference;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewstudent);

        grnno=(EditText)findViewById(R.id.grnno);
        name=(EditText)findViewById(R.id.name);
        course=(EditText)findViewById(R.id.course);
        semester=(EditText)findViewById(R.id.semester);
        user=(EditText)findViewById(R.id.user);

         databaseReference = FirebaseDatabase.getInstance().getReference("Student");


    }
   public  void process(View view)
    {
       final String grn = grnno.getText().toString();
        Query checkUser=databaseReference.orderByChild("grnno").equalTo(grn);
        checkUser.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if(snapshot.exists()) {


                    String Name = snapshot.child(grn).child("name").getValue(String.class);
                    String User = snapshot.child(grn).child("username").getValue(String.class);
                    String Course = snapshot.child(grn).child("course").getValue(String.class);
                    String Semester = snapshot.child(grn).child("semester").getValue(String.class);

                    name.setText(Name);
                    user.setText(User);
                    course.setText(Course);

                    semester.setText(Semester);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"No user Exist",Toast.LENGTH_LONG).show();
                }
            }


            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}