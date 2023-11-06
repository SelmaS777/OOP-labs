package week5.Task3.boxes;

public class Thing {
    private String name;
    private int weight;

    public Thing(String name, int weight) throws IllegalAccessException {
        if (weight < 0){
            throw new IllegalAccessException("Weight cannot be negative.");
        }

        this.name = name;
        this.weight = weight;
    }

    public String getName(){
        return name;
    }

    public int getWeight(){
        return weight;
    }

    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }

        Thing otherThing = (Thing) obj;

        return name.equals(otherThing.name) && weight == otherThing.weight;
    }

    public int hashCode(){
        return name.hashCode();
    }

    public String toString(){
        return name + " (" + weight + " kg)";
    }
}

