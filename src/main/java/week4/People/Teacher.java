package week4.People;

public class Teacher extends Person{
    private int salary;

    public Teacher(String name, String address, int age, String country, int salary){
        super(name, address, age, country);
        this.salary = salary;
    }

    public String toString(){
        return super.toString() + "\n    salary " + salary + " euros/month";
    }
}