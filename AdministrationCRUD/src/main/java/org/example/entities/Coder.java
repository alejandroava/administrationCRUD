package org.example.entities;

public class Coder {
    //Atributos
    private int id;
    private String name;
    private String lastname;
    private int cc;
    private String technology;
    private String clan;
    private int cohorte;

    public Coder(){}

    public Coder(int id, String name, String lastname, int cc, String technology, String clan, int cohorte) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.cc = cc;
        this.technology = technology;
        this.clan = clan;
        this.cohorte = cohorte;
    }

    public Coder(String name, String lastname, int cc, String technology, String clan, int cohorte) {
        this.name = name;
        this.lastname = lastname;
        this.cc = cc;
        this.technology = technology;
        this.clan = clan;
        this.cohorte = cohorte;
    }
    //Getters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getCc() {
        return cc;
    }

    public String getTechnology() {
        return technology;
    }

    public String getClan() {
        return clan;
    }

    public int getCohorte() {
        return cohorte;
    }

    //Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public void setClan(String clan) {
        this.clan = clan;
    }

    public void setCohorte(int cohorte) {
        this.cohorte = cohorte;
    }

    //ToString

    @Override
    public String toString() {
        return "Coder{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", cc=" + cc +
                ", technology='" + technology + '\'' +
                ", clan='" + clan + '\'' +
                ", cohorte=" + cohorte +
                "}\n";
    }
}
