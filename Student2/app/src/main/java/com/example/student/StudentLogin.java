
package com.example.student;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.firebase.client.Firebase;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;


public class StudentLogin extends AppCompatActivity {

EditText usern, pass;
Button log;

DatabaseReference reff;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login);

        usern=(EditText)findViewById(R.id.username);
        pass=(EditText)findViewById(R.id.password);
        log=(Button)findViewById(R.id.login);

            reff = FirebaseDatabase.getInstance().getReference("Student");
            log.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    final  String user =usern.getText().toString().trim();
                    final   String passw = pass.getText().toString().trim();

                    Query checkUser=reff.orderByChild("grnno").equalTo(user);
                    checkUser.addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {


                                if(snapshot.exists()) {
                                    String passworddb = snapshot.child(user).child("password").getValue(String.class);
                                    if (passworddb.equals(passw)) {
                                        String username = snapshot.child(user).child("username").getValue(String.class);
                                        Intent i = new Intent(StudentLogin.this, StudentFeedback.class);
                                        i.putExtra("Username", username);
                                        startActivity(i);

                                        Toast toast = Toast.makeText(getApplicationContext(), "Login Successfull", Toast.LENGTH_SHORT);
                                        toast.show();
                                    } else {
                                        Toast toast = Toast.makeText(getApplicationContext(), "invalid password", Toast.LENGTH_SHORT);
                                        toast.show();
                                    }
                                }
                                else
                                {
                                    usern.setError("No user exist");
                                }

                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {

                        }
                    });
                }
            });






        }



}






