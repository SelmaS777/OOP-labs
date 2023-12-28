package week13.Task6;

import java.util.List;

public class EspressoBuilder implements CoffeeBuilder{
    private String type;
    private String size;
    private List<String> toppings;

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
