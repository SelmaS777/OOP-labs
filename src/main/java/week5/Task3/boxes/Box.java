package week5.Task3.boxes;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public abstract class Box {
    private List<Thing> things = new ArrayList<>();
    public abstract void add(Thing thing);

    public void add(Collection<Thing> things){
        for (Thing thing: things){
            add(thing);
        }
    }

    public abstract boolean isInTheBox(Thing thing);
}
