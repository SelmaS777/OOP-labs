package week13.Task6;

import java.util.ArrayList;
import java.util.List;

public class LatteBuilder implements CoffeeBuilder {
    private String type;
    private String size;
    private List<String> toppings;

    public LatteBuilder(){
        this.type = "Latte";
        this.toppings = new ArrayList<>();
    }
    @Override
    public void buildType(String type){
        this.type = type;
    }

    @Override
    public void buildSize(String size){
        this.size = size;
    }

    @Override
    public void buildToppings(List<String> toppings){
        this.toppings = toppings;
    }

    @Override
    public Coffee getCoffee(){
        return new Coffee(type, size, toppings);
    }
}
