package com.example.student;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Process;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.DateFormat;
import java.util.Calendar;


public class stud_course extends AppCompatActivity {

    //TextView to display total
    TextView txtTotaloopth, txtTotalooppr, txtTotaldsth, txtTotaldspr, txtTotalcaosth, txtTotalcaospr, txtTotaldcanpr, txtTotaldcanth, txtTotaldstut,user;
    TextView txtDate, txtcourse, txtsem;

    int oopth1, oopth2, oopth3, oopth4, oopth5;
    int ooppr1, ooppr2, ooppr3, ooppr4, ooppr5;
    int dsth1, dsth2, dsth3, dsth4, dsth5;
    int dspr1,dspr2,dspr3,dspr4,dspr5;
    int caosth1,caosth2,caosth3,caosth4,caosth5;
    int caospr1,caospr2,caospr3,caospr4,caospr5;
    int dcanpr1,dcanpr2,dcanpr3,dcanpr4,dcanpr5;
    int dcanth1,dcanth2,dcanth3,dcanth4,dcanth5;
    int dstut1,dstut2,dstut3,dstut4,dstut5;


    EditText edtoopth1, edtoopth2, edtoopth3, edtoopth4, edtoopth5;
    EditText edtooppr1, edtooppr2, edtooppr3, edtooppr4, edtooppr5;
    EditText edtdsth1, edtdsth2, edtdsth3, edtdsth4, edtdsth5;
    EditText edtdspr1, edtdspr2, edtdspr3, edtdspr4, edtdspr5;
    EditText edtcaosth1, edtcaosth2, edtcaosth3, edtcaosth4, edtcaosth5;
    EditText edtcaospr1, edtcaospr2, edtcaospr3, edtcaospr4, edtcaospr5;
    EditText edtdcanpr1, edtdcanpr2, edtdcanpr3, edtdcanpr4, edtdcanpr5;
    EditText edtdcanth1, edtdcanth2, edtdcanth3, edtdcanth4, edtdcanth5;
    EditText edtdstut1, edtdstut2, edtdstut3, edtdstut4, edtdstut5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stud_course);

        Calendar calendar = Calendar.getInstance();
        String currentDate = DateFormat.getDateInstance().format(calendar.getTime());
        txtDate = (TextView) findViewById(R.id.txtDate);
        user=(TextView)findViewById(R.id.username1) ;
        txtDate.setText(txtDate.getText().toString() + currentDate);

         Bundle bundle = getIntent().getExtras();
        assert bundle !=null;

       String user3=bundle.getString("username");
       user.setText(user3);


        final String course = bundle.getString("course");
         String sem = bundle.getString("sem");

        txtcourse = (TextView)findViewById(R.id.txtcourse);
        txtcourse.setText(txtcourse.getText().toString() + course);

        txtsem = (TextView)findViewById(R.id.txtsem);
        txtsem.setText(txtsem.getText().toString() + sem);





        Button addoopth = findViewById(R.id.sumoopTh);
        Button addooppr = findViewById(R.id.sumooppr);
        Button adddsth = findViewById(R.id.sumdsth);
        Button adddspr = findViewById(R.id.sumdspr);
        Button addcaosth = findViewById(R.id.sumcaosth);
        Button addcaospr = findViewById(R.id.sumcaospr);
        Button adddcanpr = findViewById(R.id.sumdcanpr);
        Button adddcanth = findViewById(R.id.sumdcanth);
        Button adddstut = findViewById(R.id.sumdstut);
        //Button Submit=findViewById(R.id.btnsubmit);

        edtoopth1 = (EditText)findViewById(R.id.edtoopth1);
        edtoopth2 = (EditText)findViewById(R.id.edtoopth2);
        edtoopth3 = (EditText)findViewById(R.id.edtoopth3);
        edtoopth4 = (EditText)findViewById(R.id.edtoopth4);
        edtoopth5 = (EditText)findViewById(R.id.edtoopth5);


        edtooppr1 = (EditText)findViewById(R.id.edtooppr1);
        edtooppr2 = (EditText)findViewById(R.id.edtooppr2);
        edtooppr3 = (EditText)findViewById(R.id.edtooppr3);
        edtooppr4 = (EditText)findViewById(R.id.edtooppr4);
        edtooppr5 = (EditText)findViewById(R.id.edtooppr5);



        edtdsth1 = (EditText)findViewById(R.id.edtdsth1);
        edtdsth2 = (EditText)findViewById(R.id.edtdsth2);
        edtdsth3 = (EditText)findViewById(R.id.edtdsth3);
        edtdsth4 = (EditText)findViewById(R.id.edtdsth4);
        edtdsth5 = (EditText)findViewById(R.id.edtdsth5);



        edtdspr1 = (EditText)findViewById(R.id.edtdspr1);
        edtdspr2 = (EditText)findViewById(R.id.edtdspr2);
        edtdspr3 = (EditText)findViewById(R.id.edtdspr3);
        edtdspr4 = (EditText)findViewById(R.id.edtdspr4);
        edtdspr5 = (EditText)findViewById(R.id.edtdspr5);



        edtcaosth1 = (EditText)findViewById(R.id.edtcaosth1);
        edtcaosth2 = (EditText)findViewById(R.id.edtcaosth2);
        edtcaosth3 = (EditText)findViewById(R.id.edtcaosth3);
        edtcaosth4 = (EditText)findViewById(R.id.edtcaosth4);
        edtcaosth5 = (EditText)findViewById(R.id.edtcaosth5);



        edtdcanpr1 = (EditText)findViewById(R.id.edtcaospr1);
        edtdcanpr2 = (EditText)findViewById(R.id.edtcaospr2);
        edtdcanpr3 = (EditText)findViewById(R.id.edtcaospr3);
        edtdcanpr4 = (EditText)findViewById(R.id.edtcaospr4);
        edtdcanpr5 = (EditText)findViewById(R.id.edtcaospr5);



        edtcaospr1 = (EditText)findViewById(R.id.edtdcanpr1);
        edtcaospr2 = (EditText)findViewById(R.id.edtdcanpr2);
        edtcaospr3 = (EditText)findViewById(R.id.edtdcanpr3);
        edtcaospr4 = (EditText)findViewById(R.id.edtdcanpr4);
        edtcaospr5 = (EditText)findViewById(R.id.edtdcanpr5);


        edtdcanth1 = (EditText)findViewById(R.id.edtdstut1);
        edtdcanth2 = (EditText)findViewById(R.id.edtdstut2);
        edtdcanth3 = (EditText)findViewById(R.id.edtdstut3);
        edtdcanth4 = (EditText)findViewById(R.id.edtdstut4);
        edtdcanth5 = (EditText)findViewById(R.id.edtdstut5);



        edtdstut1 = (EditText)findViewById(R.id.edtdcanth1);
        edtdstut2 = (EditText)findViewById(R.id.edtdcanth2);
        edtdstut3 = (EditText)findViewById(R.id.edtdcanth3);
        edtdstut4 = (EditText)findViewById(R.id.edtdcanth4);
        edtdstut5 = (EditText)findViewById(R.id.edtdcanth5);


        addoopth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtTotaloopth = (TextView)findViewById(R.id.txtTotaloopth);
                int res=0;

                oopth1 = Integer.parseInt(edtoopth1.getText().toString());
                oopth2 = Integer.parseInt(edtoopth2.getText().toString());
                oopth3 = Integer.parseInt(edtoopth3.getText().toString());
                oopth4 = Integer.parseInt(edtoopth4.getText().toString());
                oopth5 = Integer.parseInt(edtoopth5.getText().toString());

                if (oopth1>5 || oopth2>5 || oopth3>5 || oopth4>5 || oopth5>5){
                    Toast.makeText(stud_course.this,"Please enter value Between '0' to '5'", Toast.LENGTH_SHORT).show();
                    return;
                }

                res = add(oopth1,oopth2,oopth3,oopth4,oopth5);
                txtTotaloopth.setText(String.valueOf(res));
            }
        });


        //Event Listener for Button of 2nd row
        addooppr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtTotalooppr = (TextView)findViewById(R.id.txtTotalooppr);
                int res=0;

                ooppr1 = Integer.parseInt(edtooppr1.getText().toString());
                ooppr2 = Integer.parseInt(edtooppr2.getText().toString());
                ooppr3 = Integer.parseInt(edtooppr3.getText().toString());
                ooppr4 = Integer.parseInt(edtooppr4.getText().toString());
                ooppr5 = Integer.parseInt(edtooppr5.getText().toString());

                if (ooppr1>5 || ooppr2>5 || ooppr3>5 || ooppr4>5 || ooppr5>5){
                    Toast.makeText(stud_course.this,"Please enter value Between '0' to '5'", Toast.LENGTH_SHORT).show();
                    return;
                }

                res = add(ooppr1, ooppr2, ooppr3, ooppr4, ooppr5);
                txtTotalooppr.setText(String.valueOf(res));
            }
        });

        //Event Listener for Button of 3rd row
        adddsth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtTotaldsth = (TextView)findViewById(R.id.txtTotaldsth);
                int res=0;

                dsth1 = Integer.parseInt(edtdsth1.getText().toString());
                dsth2 = Integer.parseInt(edtdsth2.getText().toString());
                dsth3 = Integer.parseInt(edtdsth3.getText().toString());
                dsth4 = Integer.parseInt(edtdsth4.getText().toString());
                dsth5 = Integer.parseInt(edtdsth5.getText().toString());

                if (dsth1>5 || dsth2>5 || dsth3>5 || dsth4>5 || dsth5>5){
                    Toast.makeText(stud_course.this,"Please enter value Between '0' to '5'", Toast.LENGTH_SHORT).show();
                    return;
                }

                res = add(dsth1, dsth2, dsth3, dsth4, dsth5);
                txtTotaldsth.setText(String.valueOf(res));
            }
        });


        //Event Listener for Button of 4th row
        adddspr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtTotaldspr = (TextView)findViewById(R.id.txtTotaldspr);
                int res=0;

                dspr1 = Integer.parseInt(edtdspr1.getText().toString());
                dspr2 = Integer.parseInt(edtdspr2.getText().toString());
                dspr3 = Integer.parseInt(edtdspr3.getText().toString());
                dspr4 = Integer.parseInt(edtdspr4.getText().toString());
                dspr5 = Integer.parseInt(edtdspr5.getText().toString());

                if (dspr1>5 || dspr2>5 || dspr3>5 || dspr4>5 || dspr5>5){
                    Toast.makeText(stud_course.this,"Please enter value Between '0' to '5'", Toast.LENGTH_SHORT).show();
                    return;
                }

                res = add(dspr1, dspr2, dspr3, dspr4, dspr5);
                txtTotaldspr.setText(String.valueOf(res));
            }
        });


        //Event Listener for Button of 5th row
        addcaosth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtTotalcaosth = (TextView)findViewById(R.id.txtTotalcaosth);
                int res=0;

                caosth1 = Integer.parseInt(edtcaosth1.getText().toString());
                caosth2 = Integer.parseInt(edtcaosth2.getText().toString());
                caosth3 = Integer.parseInt(edtcaosth3.getText().toString());
                caosth4 = Integer.parseInt(edtcaosth4.getText().toString());
                caosth5 = Integer.parseInt(edtcaosth5.getText().toString());

                if (caosth1>5 || caosth2>5 || caosth3>5 || caosth4>5 || caosth5>5){
                    Toast.makeText(stud_course.this,"Please enter value Between '0' to '5'", Toast.LENGTH_SHORT).show();
                    return;
                }

                res = add(caosth1, caosth2, caosth3, caosth4, caosth5);
                txtTotalcaosth.setText(String.valueOf(res));
            }
        });

        //Event Listener for Button of 6th row
        addcaospr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtTotalcaospr = (TextView)findViewById(R.id.txtTotalcaospr);
                int res=0;

                caospr1 = Integer.parseInt(edtdcanpr1.getText().toString());
                caospr2 = Integer.parseInt(edtdcanpr2.getText().toString());
                caospr3 = Integer.parseInt(edtdcanpr3.getText().toString());
                caospr4 = Integer.parseInt(edtdcanpr4.getText().toString());
                caospr5 = Integer.parseInt(edtdcanpr5.getText().toString());

                if (caospr1>5 || caospr2>5 || caospr3>5 || caospr4>5 || caospr5>5){
                    Toast.makeText(stud_course.this,"Please enter value Between '0' to '5'", Toast.LENGTH_SHORT).show();
                    return;
                }

                res = add(caospr1, caospr2, caospr3, caospr4, caospr5);
                txtTotalcaospr.setText(String.valueOf(res));
            }
        });

        //Event Listener for Button of 7th row
        adddcanpr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtTotaldcanpr = (TextView)findViewById(R.id.txtTotaldcanpr);
                int res=0;

                dcanpr1 = Integer.parseInt(edtcaospr1.getText().toString());
                dcanpr2 = Integer.parseInt(edtcaospr2.getText().toString());
                dcanpr3 = Integer.parseInt(edtcaospr3.getText().toString());
                dcanpr4 = Integer.parseInt(edtcaospr4.getText().toString());
                dcanpr5 = Integer.parseInt(edtcaospr5.getText().toString());

                if (dcanpr1>5 || dcanpr2>5 || dcanpr3>5 || dcanpr4>5 || dcanpr5>5){
                    Toast.makeText(stud_course.this,"Please enter value Between '0' to '5'", Toast.LENGTH_SHORT).show();
                    return;
                }

                res = add(dcanpr1, dcanpr2, dcanpr3, dcanpr4, dcanpr5);
                txtTotaldcanpr.setText(String.valueOf(res));
            }
        });

        //Event Listener for Button of 8th row
        adddcanth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtTotaldcanth = (TextView)findViewById(R.id.txtTotaldcanth);
                int res=0;

                dstut1 = Integer.parseInt(edtdstut1.getText().toString());
                dstut2 = Integer.parseInt(edtdstut2.getText().toString());
                dstut3 = Integer.parseInt(edtdstut3.getText().toString());
                dstut4 = Integer.parseInt(edtdstut4.getText().toString());
                dstut5 = Integer.parseInt(edtdstut5.getText().toString());

                if (dstut1>5 || dstut2>5 || dstut3>5 || dstut4>5 || dstut5>5){
                    Toast.makeText(stud_course.this,"Please enter value Between '0' to '5'", Toast.LENGTH_SHORT).show();
                    return;
                }

                res = add(dstut1, dstut2, dstut3, dstut4, dstut5);
                txtTotaldcanth.setText(String.valueOf(res));
            }
        });


        adddstut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtTotaldstut = (TextView)findViewById(R.id.txtTotaldstut);
                int res=0;

                dcanth1 = Integer.parseInt(edtdcanth1.getText().toString());
                dcanth2 = Integer.parseInt(edtdcanth2.getText().toString());
                dcanth3 = Integer.parseInt(edtdcanth3.getText().toString());
                dcanth4 = Integer.parseInt(edtdcanth4.getText().toString());
                dcanth5 = Integer.parseInt(edtdcanth5.getText().toString());

                if (dcanth1>5 || dcanth2>5 || dcanth3>5 || dcanth4>5 || dcanth5>5){
                    Toast.makeText(stud_course.this,"Please enter value Between '0' to '5'", Toast.LENGTH_SHORT).show();
                    return;
                }

                res = add(dcanth1, dcanth2, dcanth3, dcanth4, dcanth5);
                txtTotaldstut.setText(String.valueOf(res));
            }
        });

        Button btnsubmit = (Button)findViewById(R.id.btnsubmit);
        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final  String username= user.getText().toString().trim();
                final String ooptheory1=edtoopth1.getText().toString().trim();
                final String ooptheory2=edtoopth2.getText().toString().trim();
                final String ooptheory3=edtoopth3.getText().toString().trim();
                final String ooptheory4=edtoopth4.getText().toString().trim();
                final String ooptheory5=edtoopth5.getText().toString().trim();


                final String ooppract1=edtoopth1.getText().toString().trim();
                final String ooppract2=edtoopth2.getText().toString().trim();
                final String ooppract3=edtoopth3.getText().toString().trim();
                final String ooppract4=edtoopth4.getText().toString().trim();
                final String ooppract5=edtoopth5.getText().toString().trim();

                final String dstheory1=edtdsth1.getText().toString().trim();
                final String dstheory2=edtdsth1.getText().toString().trim();
                final String dstheory3=edtdsth1.getText().toString().trim();
                final String dstheory4=edtdsth1.getText().toString().trim();
                final String dstheory5=edtdsth1.getText().toString().trim();

                final String dspract1=edtdspr1.getText().toString().trim();
                final String dspract2=edtdspr2.getText().toString().trim();
                final String dspract3=edtdspr3.getText().toString().trim();
                final String dspract4=edtdspr4.getText().toString().trim();
                final String dspract5=edtdspr5.getText().toString().trim();

                final String caostheory1=edtcaosth1.getText().toString().trim();
                final String caostheory2=edtcaosth1.getText().toString().trim();
                final String caostheory3=edtcaosth1.getText().toString().trim();
                final String caostheory4=edtcaosth1.getText().toString().trim();
                final String caostheory5=edtcaosth1.getText().toString().trim();


                final String caospract1=edtcaospr1.getText().toString().trim();
                final String caospract2=edtcaospr2.getText().toString().trim();
                final String caospract3=edtcaospr3.getText().toString().trim();
                final String caospract4=edtcaospr4.getText().toString().trim();
                final String caospract5=edtcaospr5.getText().toString().trim();


                final String dcantheory1=edtdcanth1.getText().toString().trim();
                final String dcantheory2=edtdcanth2.getText().toString().trim();
                final String dcantheory3=edtdcanth3.getText().toString().trim();
                final String dcantheory4=edtdcanth4.getText().toString().trim();
                final String dcantheory5=edtdcanth5.getText().toString().trim();


                final String dcanpract1=edtdcanpr1.getText().toString().trim();
                final String dcanpract2=edtdcanpr2.getText().toString().trim();
                final String dcanpract3=edtdcanpr3.getText().toString().trim();
                final String dcanpract4=edtdcanpr4.getText().toString().trim();
                final String dcanpract5=edtdcanpr5.getText().toString().trim();

                final String dstutorial1=edtdstut1.getText().toString().trim();
                final String dstutorial2=edtdstut1.getText().toString().trim();
                final String dstutorial3=edtdstut1.getText().toString().trim();
                final String dstutorial4=edtdstut1.getText().toString().trim();
                final String dstutorial5=edtdstut1.getText().toString().trim();

                final String Totalooptheory= txtTotaloopth.getText().toString().trim();
                final String Totalooppract= txtTotalooppr.getText().toString().trim();
                final String Totaldstheory= txtTotaldsth.getText().toString().trim();
                final String Totaldspract=txtTotaldspr.getText().toString().trim();
                final String Totalcaostheory= txtTotalcaosth.getText().toString().trim();
                final String Totalcaospract=txtTotalcaospr.getText().toString().trim();
                final String Totaldcanpract=txtTotaldcanpr.getText().toString().trim();
                final String Totaldcantheory=txtTotaldcanth.getText().toString().trim();
                final String Totaldstutorial=txtTotaldstut.getText().toString().trim();
                DatabaseReference reference= FirebaseDatabase.getInstance().getReference("Student");

                //final String course = bundle.getString("sem");
                    String course="sem4";
                stud_coursedb obj = new stud_coursedb(course,username,ooptheory1, ooptheory2,ooptheory3,ooptheory4,ooptheory5,ooppract1,ooppract2,ooppract3,ooppract4,ooppract5,dstheory1,dstheory2,dstheory3,dstheory4,dstheory5,dspract1,
                        dspract2,dspract3,dspract4,dspract5,caostheory1,caostheory2,caostheory3,caostheory4,caostheory5,caospract1,caospract2,caospract3,caospract4,caospract5,dcantheory1,dcantheory2,dcantheory3,
                        dcantheory4,dcantheory5,dcanpract1,dcanpract2,dcanpract3,dcanpract4,dcanpract5,dstutorial1,dstutorial2,dstutorial3,dstutorial4,dstutorial5,Totalooptheory,Totalooppract,Totaldstheory,
                        Totaldspract,Totalcaostheory,Totalcaospract,Totaldcanpract,Totaldcantheory,Totaldstutorial);
                FirebaseDatabase db = FirebaseDatabase.getInstance();
                DatabaseReference node = db.getReference("semester4");
                node.child(username).setValue(obj);

                Toast.makeText(stud_course.this,"Existing",Toast.LENGTH_SHORT).show();

              //  finish();

            }
        });
    }

    @Override
    protected void onDestroy() {
        Process.killProcess(Process.myPid());
        super.onDestroy();
    }

    public int add(int n1, int n2, int n3, int n4, int n5){
        int res = n1 + n2 + n3 + n4 + n5;
        return res;
    }

}
