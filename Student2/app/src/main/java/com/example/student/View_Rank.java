package com.example.student;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.firebase.client.Firebase;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Arrays;
import java.util.Map;
import java.util.logging.Logger;

public class View_Rank extends AppCompatActivity {
    private DatabaseReference databaseReference;
    TextView one,two,three,four,five,six,seven,eight,nine;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view__rank);
        one = (TextView)findViewById(R.id.textView1);
        two = (TextView)findViewById(R.id.textView2);
        three= (TextView)findViewById(R.id.textView3);
        four=(TextView)findViewById(R.id.textView4);
        five= (TextView)findViewById(R.id.textView5);
        six= (TextView)findViewById(R.id.textView6);
        seven =(TextView)findViewById(R.id.textView7);
        eight= (TextView)findViewById(R.id.textView8);
        nine= (TextView)findViewById(R.id.textView9);

        databaseReference = FirebaseDatabase.getInstance().getReference().child("semester4");
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                int   Totalooptheory , Totalooppract, Totaldstheory,  Totaldspract , Totalcaostheory ,Totalcaospract,Totaldcanpract,  Totaldcantheory, Totaldstutorial ,j ,k ,temp ;
                Totalooptheory=0;
                Totalooppract  =0;
                Totaldstheory  =0 ;
                Totaldspract  =0;
                Totalcaostheory  =0;
                Totalcaospract =0  ;
                Totaldcanpract  =0;
                Totaldcantheory  =0;
                Totaldstutorial =0;


                for(DataSnapshot ds : snapshot.getChildren())
                {

                    Map<String,Object> map= (Map<String,Object>) ds.getValue();
                    Object totaloop = map.get("totalooptheory");
                    int oopvalueth =Integer.parseInt(String.valueOf(totaloop));
                    Totalooptheory += oopvalueth;

                }
                for(DataSnapshot ds : snapshot.getChildren())
                {

                    Map<String,Object> map= (Map<String,Object>) ds.getValue();
                    Object totalooppr= map.get("totalooppract");
                    int oopvaluepr=Integer.parseInt(String.valueOf(totalooppr));
                    Totalooppract += oopvaluepr;
                }
                for(DataSnapshot ds : snapshot.getChildren())
                {

                    Map<String,Object> map= (Map<String,Object>) ds.getValue();
                    Object totaldsth= map.get("totaldstheory");
                    int dsvalueth=Integer.parseInt(String.valueOf(totaldsth));
                    Totaldstheory += dsvalueth;
                }
                for(DataSnapshot ds : snapshot.getChildren())
                {

                    Map<String,Object> map= (Map<String,Object>) ds.getValue();
                    Object totaldspr= map.get("totaldspract");
                    int dsvaluepr=Integer.parseInt(String.valueOf(totaldspr));
                    Totaldspract+= dsvaluepr;
                }
                for(DataSnapshot ds : snapshot.getChildren())
                {

                    Map<String,Object> map= (Map<String,Object>) ds.getValue();
                    Object totalcaosth= map.get("totalcaostheory");
                    int caosvalueth=Integer.parseInt(String.valueOf(totalcaosth));
                    Totalcaostheory += caosvalueth;
                }
                for(DataSnapshot ds : snapshot.getChildren())
                {

                    Map<String,Object> map= (Map<String,Object>) ds.getValue();
                    Object totalcaospr= map.get("totalcaospract");
                    int caosvaluepr=Integer.parseInt(String.valueOf(totalcaospr));
                    Totalcaospract += caosvaluepr;
                }
                for(DataSnapshot ds : snapshot.getChildren())
                {

                    Map<String,Object> map= (Map<String,Object>) ds.getValue();
                    Object totaldcanth= map.get("totaldcantheory");
                    int dcanvalueth=Integer.parseInt(String.valueOf(totaldcanth));
                    Totaldcantheory += dcanvalueth;
                }
                for(DataSnapshot ds : snapshot.getChildren())
                {

                    Map<String,Object> map= (Map<String,Object>) ds.getValue();
                    Object totaldcanpr= map.get("totaldcanpract");
                    int dcanvaluepr=Integer.parseInt(String.valueOf(totaldcanpr));
                    Totaldcanpract += dcanvaluepr;
                }
                for(DataSnapshot ds : snapshot.getChildren())
                {

                    Map<String,Object> map= (Map<String,Object>) ds.getValue();
                    Object totaldstut= map.get("totaldstutorial");
                    int dstutvalueth=Integer.parseInt(String.valueOf(totaldstut));
                    Totaldstutorial += dstutvalueth;
                }
                int array[]= { Totalooptheory  ,Totalooppract, Totaldstheory,  Totaldspract , Totalcaostheory ,Totalcaospract ,Totaldcanpract ,Totaldcantheory ,Totaldstutorial};

                for (int i = 0; i < array.length; i++) {
                    for ( j = i + 1; j < array.length; j++) {
                        if (array[i] <= array[j]) {
                            temp = array[i];
                            array[i] = array[j];
                            array[j] = temp;
                        }
                    }
                }
//                one.setText(String.valueOf(array[0]));
//                two.setText(String.valueOf(array[1]));
//                three.setText(String.valueOf(array[2]));
//                four.setText(String.valueOf(array[3]));
//                five.setText(String.valueOf(array[4]));
//                six.setText(String.valueOf(array[5]));
//                seven.setText(String.valueOf(array[6]));
//                eight.setText(String.valueOf(array[7]));
//                nine.setText(String.valueOf(array[8]));


                if(array[0] == Totalooptheory)
                {
                    one.setText("S.S.Koul Mam Theory");
                }
                if(array[1] == Totalooptheory)
                {
                    two.setText("S.S.Koul Mam Theory");
                }
                if(array[2] == Totalooptheory)
                {
                    three.setText("S.S.Koul Mam Theory");
                }
                if(array[3] == Totalooptheory)
                {
                    four.setText("S.S.Koul Mam Theory");
                }
                if(array[4] == Totalooptheory)
                {
                    five.setText("S.S.Koul Mam Theory");
                }
                if(array[5] == Totalooptheory)
                {
                    six.setText("S.S.Koul Mam Theory");
                }
                if(array[6] == Totalooptheory)
                {
                    seven.setText("S.S.Koul Mam Theory");
                }
                if(array[7] == Totalooptheory)
                {
                    eight.setText("S.S.Koul Mam Theory");
                }
                if(array[8] == Totalooptheory)
                {
                    nine.setText("S.S.Koul Mam Theory");
                }
                if(array[0] == Totalooppract)
                {
                    one.setText("S.S.Koul Mam Practical");
                }
                if(array[1] == Totalooppract)
                {
                    two.setText("S.S.Koul Mam Practical");
                }
                if(array[2] == Totalooppract)
                {
                    three.setText("S.S.Koul Mam Practical");
                }
                if(array[3] == Totalooppract)
                {
                    four.setText("S.S.Koul Mam Practical");
                }
                if(array[4] == Totalooppract)
                {
                    five.setText("S.S.Koul Mam Practical");
                }
                if(array[5] == Totalooppract)
                {
                    six.setText("S.S.Koul Mam Practical");
                }
                if(array[6]==Totalooppract)
                {
                    seven.setText("S.S.Koul Mam Practical");
                }
                if(array[7] == Totalooppract)
                {
                    eight.setText("S.S.Koul Mam Practical");
                }
                if(array[8] == Totalooppract)
                {
                    nine.setText("S.S.Koul Mam Practical");
                }
                if(array[0] == Totaldstheory)
                {
                    one.setText("A.A.Bhilare Sir Theory");
                }
                if(array[0] == Totaldspract)
                {
                    one.setText("A.A.Bhilare Sir Practical");
                }
                if(array[1] == Totaldstheory)
                {
                    two.setText("A.A.Bhilare Sir Theory");
                }
                if(array[1] == Totaldspract)
                {
                    two.setText("A.A.Bhilare Sir Practicalr");
                }
                if(array[2] == Totaldstheory)
                {
                    three.setText("A.A.Bhilare Sir Theory");
                }
                if(array[2] == Totaldspract)
                {
                    three.setText("A.A.Bhilare Sir Practical");
                }
                if(array[3] == Totaldstheory)
                {
                    four.setText("A.A.Bhilare Sir Theory");
                }
                if(array[3] == Totaldspract)
                {
                    four.setText("A.A.Bhilare Sir Practical");
                }
                if(array[4] == Totaldstheory)
                {
                    five.setText("A.A.Bhilare Sir Theory");
                }
                if(array[4] == Totaldspract)
                {
                    five.setText("A.A.Bhilare Sir Practical");
                }
                if(array[5] == Totaldstheory)
                {
                    six.setText("A.A.Bhilare Sir Theory");
                }
                if(array[5] == Totaldspract)
                {
                    six.setText("A.A.Bhilare Sir Practical");
                }
                if(array[6] == Totaldstheory)
                {
                    seven.setText("A.A.Bhilare Sir Theory");
                }
                if(array[6] == Totaldspract)
                {
                    seven.setText("A.A.Bhilare Sir Practical");
                }
                if(array[7] == Totaldstheory)
                {
                    eight.setText("A.A.Bhilare Sir Theory");
                }
                if(array[7] == Totaldspract)
                {
                    eight.setText("A.A.Bhilare Sir Practical");
                }
                if(array[8] == Totaldstheory)
                {
                    nine.setText("A.A.Bhilare Sir Theory");
                }
                if(array[8] == Totaldspract)
                {
                    nine.setText("A.A.Bhilare Sir Practical");
                }
                if(array[0] == Totalcaostheory)
                {
                    one.setText("Saraswati Patil Mam Theory");
                }
                if(array[0] == Totalcaospract)
                {
                    one.setText("Saraswati Patil Mam Practical");
                }
                if(array[1] == Totalcaostheory)
                {
                    two.setText("Saraswati Patil Mam Theory");
                }
                if(array[1] == Totalcaospract)
                {
                    two.setText("Saraswati Patil Mam Practical");
                }
                if(array[2] == Totalcaostheory)
                {
                    three.setText("Saraswati Patil Mam Theory");
                }
                if(array[2] == Totalcaospract)
                {
                    three.setText("Saraswati Patil Mam Practical");
                }
                if(array[3] == Totalcaostheory)
                {
                    four.setText("Saraswati Patil Mam Theory");
                }
                if(array[3] == Totalcaospract)
                {
                    four.setText("Saraswati Patil Mam Practical");
                }
                if(array[4] == Totalcaostheory)
                {
                    five.setText("Saraswati Patil Mam Theory");
                }
                if(array[4] == Totalcaospract)
                {
                    five.setText("Saraswati Patil Mam  Practical");
                }
                if(array[5] == Totalcaostheory)
                {
                    six.setText("Saraswati Patil Mam Theory" );
                }
                if(array[5] == Totalcaospract)
                {
                    six.setText("Saraswati Patil Mam Practical");
                }
                if(array[6] == Totalcaostheory)
                {
                    seven.setText("Saraswati Patil Mam Theory");
                }
                if(array[6] == Totalcaospract)
                {
                    seven.setText("Saraswati Patil Mam Practical");
                }
                if(array[7] == Totalcaostheory)
                {
                    eight.setText("Saraswati Patil Mam Theory");
                }
                if(array[7] == Totalcaospract)
                {
                    eight.setText("Saraswati Patil Mam Practical");
                }
                if(array[8] == Totalcaostheory)
                {
                    nine.setText("Saraswati Patil Mam Theory");
                }
                if(array[8] == Totalcaospract)
                {
                    nine.setText("Saraswati Patil Mam Practical");
                }
                if(array[0] == Totaldcanpract)
                {
                    one.setText("Virendra Powar Sir Practical");
                }
                if(array[0] == Totaldcantheory)
                {
                    one.setText("Dipak Badgujar Sir Theory");
                }
                if(array[1] == Totaldcanpract)
                {
                    two.setText("Virendra Powar Sir Practical");
                }
                if(array[1] == Totaldcantheory)
                {
                    two.setText("Dipak Badgujar Sir Theory");
                }
                if(array[2] == Totaldcanpract)
                {
                    three.setText("Virendra Powar Sir Practical");
                }
                if(array[2] == Totaldcantheory)
                {
                    three.setText("Dipak Badgujar Sir Theory");
                }
                if(array[3] == Totaldcanpract)
                {
                    four.setText("Virendra Powar Sir Practical");
                }
                if(array[3] == Totaldcantheory)
                {
                    four.setText("Dipak Badgujar Sir Theory");
                }
                if(array[4] == Totaldcanpract)
                {
                    five.setText("Virendra Powar Sir Practical");
                }
                if(array[4] == Totaldcantheory)
                {
                    five.setText("Dipak Badgujar Sir Theory");
                }
                if(array[5] == Totaldcanpract)
                {
                    six.setText("Virendra Powar Sir Practical");
                }
                if(array[5] == Totaldcantheory)
                {
                    six.setText("Dipak Badgujar Sir Theory");
                }
                if(array[6] == Totaldcanpract)
                {
                    seven.setText("Virendra Powar Si Practicalr");
                }
                if(array[6] == Totaldcantheory)
                {
                    seven.setText("Dipak Badgujar Sir Theory");
                }
                if(array[7] == Totaldcanpract)
                {
                    eight.setText("Virendra Powar Sir Practical");
                }
                if(array[7] == Totaldcantheory)
                {
                    eight.setText("Dipak Badgujar Sir Theory");
                }
                if(array[8] == Totaldcanpract)
                {
                    nine.setText("Virendra Powar Sir Practical");
                }
                if(array[8] == Totaldcantheory)
                {
                    nine.setText("Dipak Badgujar Sir Theory");
                }
                if(array[0] == Totaldstutorial)
                {
                    one.setText("Milind Kamble Sir Tutorial");
                }
                if(array[1] == Totaldstutorial)
                {
                    two.setText("Milind Kamble Sir Theory");
                }
                if(array[2] == Totaldstutorial)
                {
                    three.setText("Milind Kamble Sir Tutorial");
                }
                if(array[3] == Totaldstutorial)
                {
                    four.setText("Milind Kamble Sir Tutorial");
                }
                if(array[4] == Totaldstutorial)
                {
                    five.setText("Milind Kamble Sir Tutorial");
                }
                if(array[5] == Totaldstutorial)
                {
                    six.setText("Milind Kamble Sir Tutorial");
                }
                if(array[6] == Totaldstutorial)
                {
                    seven.setText("Milind Kamble Sir Tutorial");
                }
                if(array[7] == Totaldstutorial)
                {
                    eight.setText("Milind Kamble Sir Tutorial");
                }
                if(array[8] == Totaldstutorial)
                {
                    nine.setText("Milind Kamble Sir Tutorial");
                }





















            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }


        });
    }
}