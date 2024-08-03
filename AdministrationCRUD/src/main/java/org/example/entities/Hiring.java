package org.example.entities;

import org.example.utils.enums.status;

import java.util.Date;

public class Hiring {
    //atributos
    private int id;
    private Date date;
    private int salary;
    private int companyId;
    private int coderId;
    private status status;

    //constructor
    public Hiring() {
    }

    public Hiring(int id, Date date, int salary, int companyId, int coderId) {
        this.id = id;
        this.date = date;
        this.salary = salary;
        this.companyId = companyId;
        this.coderId = coderId;
    }
    //getters

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public int getSalary() {
        return salary;
    }

    public int getCompanyId() {
        return companyId;
    }

    public int getCoderId() {
        return coderId;
    }

    //setters

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public void setCoderId(int coderId) {
        this.coderId = coderId;
    }
    //tostring

    @Override
    public String toString() {
        return "Hiring{" +
                "id=" + id +
                ", date=" + date +
                ", salary=" + salary +
                ", companyId=" + companyId +
                ", coderId=" + coderId +
                '}';
    }
}


