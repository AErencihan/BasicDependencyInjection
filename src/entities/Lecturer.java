package entities;

public class Lecturer {
    private String name;
    private String lastName;
    private int id;

    public Lecturer(String name, String lastName, int id){
        this.name = name;
        this.lastName = name;
        this.id = id;

    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getLastName(){
        return lastName;
    }
    public int setId(int id){
        this.id = id;
        return id;
    }
    public String setName(String name){
        this.name = name;
        return name;
    }
    public String setLastName(String lastName){
        this.lastName = lastName;
        return lastName;
    }
}
