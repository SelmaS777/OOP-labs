package week11;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOError;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class Student {
    private int id;
    private String name;
    private String university;
    private String department;
    private double gpa;

    public Student(int id, String name, String university, String department, double gpa){
        this.id = id;
        this.name = name;
        this.university = university;
        this.department = department;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString(){
        return "Student Name: " + name;
    }
}

class EmptyStudentListException extends RuntimeException{
    public EmptyStudentListException(String message){
        super(message);
    }
}

class StudentSystem {
    private List<Student> students;

    public StudentSystem(String filename) {
        this.students = readStudents(filename);
    }

    public List<Student> readStudents(String filename) {
        List<Student> students = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
            List<String> lines = bufferedReader.lines().collect(Collectors.toList());
            for (String line : lines) {
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                String university = parts[2];
                String department = parts[3];
                double gpa = Double.parseDouble(parts[4]);
                students.add(new Student(id, name, university, department, gpa));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return students;
    }

    public Optional<Student> getStudentById(int id) {
        return students.stream().filter(student -> student.getId() == id).findFirst();
    }

    public Student getHighestGPAStudent() throws EmptyStudentListException {
        if (students.isEmpty()) {
            throw new EmptyStudentListException("List of students is empty.");
        }
        return students.stream().max(Comparator.comparingDouble(Student::getGpa)).orElse(null);
    }

    public Student getLongestNameStudent() throws EmptyStudentListException {
        if (students.isEmpty()) {
            throw new EmptyStudentListException("List of students is empty.");
        }
        return students.stream().max(Comparator.comparingInt(student -> student.getName().length())).orElse(null);
    }
}
class StudentSystemTest{
    @Test
    void testifStudentisPresent(){
        StudentSystem system = new StudentSystem("students.csv");
        List<Student> students = system.readStudents("students.csv");
        assertFalse(students.isEmpty());
    }

    @Test
    void testStudentWithId100(){
        StudentSystem system = new StudentSystem("students.csv");
        Optional<Student> student = system.getStudentById(100);
        assertFalse(student.isPresent());
    }

    @Test
    void testStudentNull(){
        StudentSystem system = new StudentSystem("students.csv");
        assertNotNull(system);
    }

    @Test
    void testHighestGPAStudent(){
        StudentSystem system =  new StudentSystem("students.csv");
        Student student = system.getHighestGPAStudent();
        assertNotNull(student);
    }

    @Test
    void testExceptionForEmptyStudentList(){
        StudentSystem system = new StudentSystem("empty.csv");
        assertThrows(EmptyStudentListException.class, system::getHighestGPAStudent);
    }

    @Test
    void testNamesArray(){
        StudentSystem system = new StudentSystem("students.csv");
        List<Student> students = system.readStudents("students.csv");
        String[] expectedNames = {"Selma", "Neomie", "Irene", "Roberta", "Alfonso"};
        String[] actualNames = students.stream().map(Student::getName).limit(5).toArray(String[]::new);
        assertArrayEquals(expectedNames, actualNames);
    }

    @Test
    void testSize(){
        StudentSystem system = new StudentSystem("students.csv");
        List<Student> students = system.readStudents("students.csv");
        assertEquals(70, students.size());
    }

    @Test
    void testLargestName(){
        StudentSystem system = new StudentSystem("students.csv");
        Student student = system.getLongestNameStudent();
        assertNotEquals("Ava White", student.getName());
    }

    @Test
    void testStudents(){
        StudentSystem system = new StudentSystem("students.csv");
        Student highestGPAStudent = system.getHighestGPAStudent();
        Student longestNameStudent = system.getLongestNameStudent();
        assertNotEquals(highestGPAStudent, longestNameStudent);
    }

    @Test
    void testSameStudent(){
        StudentSystem system = new StudentSystem("students.csv");
        Student highestGPAStudent = system.getHighestGPAStudent();
        Optional<Student> studentById12 = system.getStudentById(12);
        if(studentById12.isPresent()){
            assertEquals(highestGPAStudent,studentById12.get());
        }
    }
    }

