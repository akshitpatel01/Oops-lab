package l4_extra;

import java.time.LocalDate;
import java.util.Date;

public class Student {

    String name;
    long roll;
    String dept;
    float cgpa;
    double salary_off;
    String email;
    Date dob;
    int age;

    public int getAge() {
        return age;
    }

    public void setAge() {
        LocalDate localDate = LocalDate.now();
        age = localDate.getYear() - dob.getYear();
    }

    public Student(String name, long roll, String dept, float cgpa, double salary_off, String email, Date dob) {
        this.name = name;
        this.roll = roll;
        this.dept = dept;
        this.cgpa = cgpa;
        this.salary_off = salary_off;
        this.email = email;
        this.dob = dob;
    }

    public Student() {

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getRoll() {
        return roll;
    }

    public void setRoll(long roll) {
        this.roll = roll;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public double getSalary_off() {
        return salary_off;
    }

    public void setSalary_off(double salary_off) {
        this.salary_off = salary_off;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }


    public String print_details() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                ", cgpa=" + cgpa +
                ", email='" + email + '\'' +
                '}';
    }

    public String print_details2() {
        return String.format("Student{name='%s', roll=%d,  salary_off=%.2s}", name, roll, salary_off);
    }
}

