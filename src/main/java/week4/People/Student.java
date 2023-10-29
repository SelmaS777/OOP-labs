package week4.People;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person{
    private int credits;
    public String student_id;
    private List<Integer> grades;

    public Student(String name, String address, int age, String country, String student_id){
        super(name, address, age, country);
        //this.credits = 0;
        this.student_id = student_id;
        this.grades = new ArrayList<>();
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public List<Integer> getGrades(){
        return grades;
    }

    public void addGrade(int grade){
        if (grade >= 0 && grade <= 100){
            grades.add(grade);
        } else{
            System.out.println("Invalid grade. Grades should be between 0 and 100.");
        }
    }
    public int credits(){
        return credits;
    }

    public void study(){
        credits++;
    }

    public String toString(){
        return super.toString() + "\n    credits " + credits;
    }
}