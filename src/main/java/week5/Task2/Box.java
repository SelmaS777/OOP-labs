package week5.Task2;

import java.util.ArrayList;

public class Box {
    private double maxWeight;
    private ArrayList<ToBeStored> items;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    private double getTotalWeight() {
        double totalWeight = 0;

        for (ToBeStored item : items) {
            totalWeight += item.weight();
        }
        return totalWeight;
    }

    public void add(ToBeStored item) {
        if (getTotalWeight() + item.weight() <= maxWeight) {
            items.add(item);
        }
    }

    public String toString() {
        return "Box: " + items.size() + " things, total weight " + getTotalWeight() + " kg";
    }


}
