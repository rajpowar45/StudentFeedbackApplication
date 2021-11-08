package com.example.student;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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

public class StudentRegister extends AppCompatActivity {
EditText  name,course,semester,pass1,pass2,user,grnno;
Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_register);


    }
    public void process(View view)
    {
            grnno=(EditText)findViewById(R.id.grnno);
            name=(EditText)findViewById(R.id.name);
            course=(EditText)findViewById(R.id.course);
            semester=(EditText)findViewById(R.id.semester);
            user=(EditText)findViewById(R.id.user);
            pass1=(EditText)findViewById(R.id.editTextTextPassword1);
            pass2=(EditText)findViewById(R.id.editTextTextPassword2);

            String Grnno=grnno.getText().toString().trim();
            String Name=name.getText().toString().trim();
            String Course=course.getText().toString().trim();
            String Semester=semester.getText().toString().trim();
            String Password=pass1.getText().toString().trim();
            String passwd2=pass2.getText().toString().trim();
            String username=user.getText().toString().trim();

            if(pass1.getText().toString() == pass2.getText().toString())
            {
                Toast toast=Toast. makeText(getApplicationContext(),"No matching password",Toast. LENGTH_SHORT);
                toast.show();
            }
                    else {
                 DatabaseReference reference= FirebaseDatabase.getInstance().getReference("Student");

                        //String roll = "12020269";
                        studentregisterdb obj = new studentregisterdb(Grnno,Name, Course, Semester, username, Password);
                        FirebaseDatabase db = FirebaseDatabase.getInstance();
                        DatabaseReference node = db.getReference("Student");
                        node.child(Grnno).setValue(obj);

                        name.setText("");
                        course.setText("");
                        semester.setText("");
                        user.setText("");
                        pass1.setText("");
                        pass2.setText("");

                    }
    }
}