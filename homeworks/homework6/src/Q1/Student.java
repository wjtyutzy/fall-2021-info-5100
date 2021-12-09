package Q1;

import java.util.Date;

public class Student {
    private int ID;
    private String name;
    private double gpa;
    private Date dateOfBirth;

    public Student(String name, double gpa, Date date) {
        this.name = name;
        this.gpa = gpa;
        this.dateOfBirth = date;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String toString() {
        return  "name: " + name + " GPA: " + gpa + " DOB: " + dateOfBirth;
    }
}
