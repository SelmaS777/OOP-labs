package week10.Task2;

import java.awt.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String name;
    private int ID;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(String name, int ID, ArrayList<Integer> grades){
        this.name = name;
        this.ID = ID;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

}

class GradeAnalyzer{
    private ArrayList<Integer> grades = new ArrayList<>();

    public GradeAnalyzer(ArrayList<Integer> grades){
        this.grades = grades;
    }

    public ArrayList<Integer> getGrades(){
        return grades;
    }

    public double calcuateAverage(ArrayList<Integer> grades){
        double average;
        int sum = 0;
        for (int grade : grades){
            sum += grade;
        }
        average = sum / grades.size();
        return average;
    }

    public void printSummary(){
        System.out.println("Average Grade: " + calcuateAverage(this.grades));
    }
}

class Start{
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> studentGrades = new ArrayList<>(Arrays.asList(5, 6, 7, 8, 9, 10));
        GradeAnalyzer analyzer = new GradeAnalyzer(studentGrades);

        Method[] methods = analyzer.getClass().getDeclaredMethods();
        for(Method method : methods){
            if(method.getName().startsWith("calculate")){
                System.out.println(method.getName());
                System.out.println(method.invoke(analyzer, analyzer.getGrades()));
            }
            if(method.getName().startsWith("print")){
               method.setAccessible(true);
               System.out.println(method.getName());
               method.invoke(analyzer);
            }
        }
    }

}
