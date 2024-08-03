package org.example.entities;

public class Vacant {
    //atributos
    private int id;
    private String title;
    private String description;
    private String technologyId;

    //constructor
    public Vacant(){}

    public Vacant(int id, String title, String description, String technologyId) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.technologyId = technologyId;
    }

    //getters

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getTechnologyId() {
        return technologyId;
    }
    //setters

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTechnologyId(String technologyId) {
        this.technologyId = technologyId;
    }
    //tostring

    @Override
    public String toString() {
        return "Vacant{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", technologyId='" + technologyId + '\'' +
                '}';
    }
}
