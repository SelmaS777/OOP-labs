package week13.Task6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CoffeeDirector director = new CoffeeDirector();

        CoffeeBuilder espressoBuilder = new EspressoBuilder();
        director.constructCoffee(espressoBuilder, "Espresso", "Medium", Arrays.asList("Milk", "Caramel"));

        Coffee espressoCoffee = espressoBuilder.getCoffee();
        System.out.println("Espresso Coffee: " + espressoCoffee.getType() + ", Size: " + espressoCoffee.getSize() + ", Toppings: " + espressoCoffee.getToppings());
    }
}
