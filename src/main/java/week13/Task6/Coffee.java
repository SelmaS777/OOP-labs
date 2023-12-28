package week13.Task6;

import java.util.Calendar;
import java.util.List;

public class Coffee {
    private String type;
    private String size;
    private List<String> toppings;

    public Coffee(String type, String size, List<String> toppings){
        this.type = type;
        this.size = size;
        this.toppings = toppings;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }
}
