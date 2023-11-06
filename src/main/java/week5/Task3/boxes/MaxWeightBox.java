package week5.Task3.boxes;

public class MaxWeightBox extends Box {
    private int maxWeight;
    private int curretWeight;

    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
        this.curretWeight = 0;
    }

    public void add(Thing thing) {
        if (curretWeight + thing.getWeight() <= maxWeight) {
            curretWeight += thing.getWeight();
        } else {
            return;
        }
    }

    public boolean isInTheBox(Thing thing) {
        return thing.getWeight() <= maxWeight && curretWeight >= thing.getWeight();
    }
}
