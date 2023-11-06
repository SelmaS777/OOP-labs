package Quiz2Examples.Quiz2;
/* Make a class Animal that has attributes name, age and color (type enum).
Make 3 constructors: first for name, second for color and the third for every attribute included.
Also make getters and setters for each attribute, and then a method that will return "Animal noise".

Make a class Tiger which inherits class Animal and adds one more attribute: numOfTeeth. Make get and set for it,
and override the "Animal noise" to "Tiger noise".

At the end, make a class Lion that will have its attribute weight, and name will be inherited
 */

enum Color{
    RED,
    BLUE,
    GREEN
}
class Animal {
    private String name;
    private int age;
    private Color color;

    // Constructor for the name
    public Animal (String name){
        this.name = name;
    }

    // Constructor for the color
    public Animal (Color color){
        this.color = color;
    }

    // Constructor for all the attributes
    public Animal (String name, int age, Color color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    // Get and Set methods for all the attributes
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
    public void setColor(Color color){
        this.color = color;
    }

    // method makeNoise()
    public String makeNoise(){
        return "Animal noise";
    }
}

class Tiger extends Animal{
    private int numOfTeeth;

    //Getter and setter
    public int getNumOfTeeth(){
        return numOfTeeth;
    }
    public void setNumOfTeeth(int numOfTeeth){
        this.numOfTeeth = numOfTeeth;
    }

    // Constructor
    public Tiger(String name, int age, Color color, int numOfTeeth){
        super(name, age, color);
        this.numOfTeeth = numOfTeeth;
    }

    // Override makeNoise()
    @Override
    public String makeNoise(){
        return "Tiger noise";
    }
}

class Lion extends Animal{
    private int weight;
    public Lion(String name, int weight){
        super(name);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }
    @Override
    public String makeNoise(){
        return "Roar";
    }
}

class Main{
    public static void main(String[] args) {
        System.out.println("Animal: ");
        Animal animal = new Animal("Cat", 3, Color.RED);
        System.out.println(animal.getName());
        System.out.println(animal.getAge());
        System.out.println(animal.getColor());
        System.out.println(animal.makeNoise());

        System.out.println("\nTiger: ");
        Tiger tiger = new Tiger("Bob", 8, Color.BLUE, 30);
        System.out.println(tiger.getName());
        System.out.println(tiger.getAge());
        System.out.println(tiger.getColor());
        System.out.println(tiger.getNumOfTeeth());
        System.out.println(tiger.makeNoise());

        System.out.println("\nLion: ");
        Lion lion = new Lion("Tom", 180);
        System.out.println(lion.getName());
        System.out.println(lion.getWeight());
        System.out.println(lion.makeNoise());
    }
}
