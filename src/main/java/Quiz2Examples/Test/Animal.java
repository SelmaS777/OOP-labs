package Quiz2Examples.Test;

enum Color{
    BLACK,
    WHITE,
    RED,
    GREEN
}
class Animal {
    private String name;
    private int age;
    private Color color;

    public Animal(String name){
        this.name = name;
    }

    public Animal(int age){
        this.age = age;
    }

    public Animal(String name, int age, Color color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public Color getColor(){
        return color;
    }
    public void setColor(){
        this.color = color;
    }

    public String runSound(){
        return "Animal running";
    }
}

class Tiger extends Animal{
    private int numOfTeeth;
    public Tiger(int numOfTeeth, String name, int age, Color color){
        super(name, age, color);
        this.numOfTeeth = numOfTeeth;
    }

    public int getNumOfTeeth(){
        return numOfTeeth;
    }
    public void setNumOfTeeth(int numOfTeeth){
        this.numOfTeeth = numOfTeeth;
    }

    @Override
    public String runSound(){
        return "Tiger running";
    }
}

class Lion extends Animal{
    private int bearLength;
    public Lion(String name, int bearLength){
        super(name);
        this.bearLength = bearLength;
    }

    public int getBearLength(){
        return bearLength;
    }

    public void setBearLength(int bearLength){
        this.bearLength = bearLength;
    }

    @Override
    public String runSound(){
        return "Lion running";
    }
}
class Main{
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", 12, Color.WHITE);

        // Create a Tiger instance
        Tiger tiger = new Tiger(32, "Siberian Tiger", 8, Color.RED);

        // Create a Lion instance
        Lion lion = new Lion("African Lion",10 );

        System.out.println("Animal:");
        System.out.println(animal.getName());
        System.out.println(animal.getAge());
        System.out.println(animal.getColor());
        System.out.println(animal.runSound());

        System.out.println("\nTiger:");
        System.out.println(tiger.getNumOfTeeth());
        System.out.println(tiger.getName());
        System.out.println(tiger.getAge());
        System.out.println(tiger.getColor());
        System.out.println(tiger.runSound());

        System.out.println("\nLion:");
        System.out.println(lion.getName());
        System.out.println(lion.getBearLength());
        System.out.println(lion.runSound());
    }
}

