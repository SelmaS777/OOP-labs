package week13.Task6;

import java.util.List;

public class CoffeeDirector {
    public void constructCoffee(CoffeeBuilder builder, String type, String size, List<String> toppings){
        builder.buildType(type);
        builder.buildSize(size);
        builder.buildToppings(toppings);
    }
}
