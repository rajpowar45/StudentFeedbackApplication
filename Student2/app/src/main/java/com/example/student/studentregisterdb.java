package com.example.student;

import android.widget.EditText;

public class studentregisterdb
{
    String Name, Course, Semester, username, Password,passwd2,Grnno;

    public studentregisterdb(String Grnno,String name, String course, String semester, String username, String password) {
         this.Grnno=Grnno;
        Name = name;
        Course = course;
        Semester = semester;
        this.username = username;
        Password = password;
    }

   /* public studentregisterdb(String course, String username, String ooptheory2, String ooptheory3, String ooptheory4, String ooptheory5, String ooppract1, String ooppract2, String ooppract3, String ooppract4, String ooppract5, String dstheory1, String dstheory2, String dstheory3, String dstheory4, String dstheory5, String dspract1, String dspract2, String dspract3, String dspract4, String dspract5, String caostheory1, String caostheory2, String caostheory3, String caostheory4, String caostheory5, String caospract1, String caospract2, String caospract3, String caospract4, String caospract5, String dcantheory1, String dcantheory2, String dcantheory3, String dcantheory4, String dcantheory5, String dcanpract1, String dcanpract2, String dcanpract3, String dcanpract4, String dcanpract5, String dstutorial1, String dstutorial2, String dstutorial3, String dstutorial4, String dstutorial5, String totalooptheory, String totalooppract, String totaldstheory, String totaldspract, String totalcaostheory, String totalcaospract, String totaldcanpract, String totaldcantheory, String totaldstutorial) {
    }

    public studentregisterdb(String ooptheory1, String ooptheory2, String ooptheory3, String ooptheory4, String ooptheory5, String ooppract1, String ooppract2, String ooppract3, String ooppract4, String ooppract5, String dstheory1, String dstheory2, String dstheory3, String dstheory4, String dstheory5, String dspract1, String dspract2, String dspract3, String dspract4, String dspract5, String caostheory1, String caostheory2, String caostheory3, String caostheory4, String caostheory5, String caospract1, String caospract2, String caospract3, String caospract4, String caospract5, String dcantheory1, String dcantheory2, String dcantheory3, String dcantheory4, String dcantheory5, String dcanpract1, String dcanpract2, String dcanpract3, String dcanpract4, String dcanpract5, String dstutorial1, String dstutorial2, String dstutorial3, String dstutorial4, String dstutorial5, String totalooptheory, String totalooppract, String totaldstheory, String totaldspract, String totalcaostheory, String totalcaospract, String totaldcanpract, String totaldcantheory, String totaldstutorial) {
    }



    public studentregisterdb(String course, String username, String ooptheory1, String ooptheory2, String ooptheory3, String ooptheory4, String ooptheory5, String ooppract1, String ooppract2, String ooppract3, String ooppract4, String ooppract5, String dstheory1, String dstheory2, String dstheory3, String dstheory4, String dstheory5, String dspract1, String dspract2, String dspract3, String dspract4, String dspract5, String caostheory1, String caostheory2, String caostheory3, String caostheory4, String caostheory5, String caospract1, String caospract2, String caospract3, String caospract4, String caospract5, String dcantheory1, String dcantheory2, String dcantheory3, String dcantheory4, String dcantheory5, String dcanpract1, String dcanpract2, String dcanpract3, String dcanpract4, String dcanpract5, String dstutorial1, String dstutorial2, String dstutorial3, String dstutorial4, String dstutorial5, String totalooptheory, String totalooppract, String totaldstheory, String totaldspract, String totalcaostheory, String totalcaospract, String totaldcanpract, String totaldcantheory, String totaldstutorial) {
    }*/

    public String getGrnno() {
        return Grnno;
    }

    public void setGrnno(String grnno) {
        Grnno = grnno;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String course) {
        Course = course;
    }

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String semester) {
        Semester = semester;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
