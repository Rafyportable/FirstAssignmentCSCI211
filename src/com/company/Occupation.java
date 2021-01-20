package com.company;

public class Occupation {

    private String COS;
    private String title;
    private int employment;
    private int salary;

    public Occupation() {

    }

    //Constructor
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
        String info;

        return info = "COS: " + COS + "\n Title: " + title + "\n Employment: " + employment
                + "\n Salary: " + salary;


    }
}
