package org.example.entities;

public class Company {
    //Atributos
    private int id;
    private String name;
    private String location;

    //constructor
    public Company(){}

    public Company(int id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    //Getters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    //Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    //Tostring

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

}
