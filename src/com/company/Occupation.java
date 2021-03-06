package com.company;

public class Occupation {

    private String COS;
    private String title;
    private int employment;
    private int salary;

    // constructor method
    public Occupation() {

    }

    public Occupation(String cos, String ti, int emp, int sal) {

        setCOS(cos);
        setTitle(ti);
        setEmployment(emp);
        setSalary(sal);

    }

    public String getCOS() {
        return COS;
    }

    public void setCOS(String COS) {
        this.COS = COS;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getEmployment() {
        return employment;
    }

    public void setEmployment(int employment) {
        this.employment = employment;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {

        return "COS: " + COS + "\nTitle: " + title + "\nEmployment: " + employment
                + "\nSalary: " + salary;

    }
}
