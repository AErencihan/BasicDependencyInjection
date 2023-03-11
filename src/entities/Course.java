package entities;

import java.math.BigDecimal;
import java.util.List;

public class Course {
    private int id;
    private String courseName;
    private BigDecimal price;


    public Course(int id, String courseName, BigDecimal price){
        this.id = id;
        this.courseName = courseName;
        this.price = price;
    }

    public String getCourseName() {
        return courseName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
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
