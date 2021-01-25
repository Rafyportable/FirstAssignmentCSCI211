package com.company;

public class Occupation {

    private String COS;
    private String title;
    private String employment;
    private String salary;

    // constructor method
    public Occupation() {

    }

    public Occupation(String cos, String ti, String emp, String sal) {

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

    public String getEmployment() {
        return employment;
    }

    public void setEmployment(String employment) {
        this.employment = employment;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String toString() {

        return "COS: " + COS + "\nTitle: " + title + "\nEmployment: " + employment
                + "\nSalary: " + salary;

    }
}
