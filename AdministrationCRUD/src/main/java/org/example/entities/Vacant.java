package org.example.entities;

public class Vacant {
    //atributos
    private int id;
    private String title;
    private String description;
    private String companyId;

    //constructor
    public Vacant(){}

    public Vacant(int id, String title, String description, String companyId) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.companyId = companyId;
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
        return companyId;
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

    public void setTechnologyId(String companyId) {
        this.companyId = companyId;
    }
    //tostring

    @Override
    public String toString() {
        return "Vacant{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", companyId='" + companyId + '\'' +
                '}';
    }
}
