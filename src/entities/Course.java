package entities;

import java.util.List;

public class Course {
    private int id;
    private String courseName;


    public Course(int id, String courseName){
        this.id = id;
        this.courseName = courseName;
    }
    public int getId(){
        return id;
    }

    public String getName(){
        return courseName;
    }

    public int setId(int id){
        this.id = id;
        return id;
    }

    public String setCourseName(String courseName){
        this.courseName = courseName;
        return courseName;
    }





}
