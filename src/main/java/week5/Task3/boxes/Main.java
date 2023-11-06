package week5.Task3.boxes;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        /*MaxWeightBox coffeeBox = new MaxWeightBox(10);
        coffeeBox.add(new Thing("Saludo", 5));
        coffeeBox.add(new Thing("Pirkka", 5));
        coffeeBox.add(new Thing("Kopi Luwak", 5));

        System.out.println(
        coffeeBox.isInTheBox(new Thing("Saludo", 5)));
        System.out.println(coffeeBox.isInTheBox(new Thing("Pirkka", 5)));
        System.out.println(coffeeBox.isInTheBox(new Thing("Kopi Luwak", 5)));
*/
       /* OneThingBox box = new OneThingBox();
        box.add(new Thing("Saludo", 5));
        box.add(new Thing("Pirkka", 5));

        System.out.println(box.isInTheBox(new Thing("Saludo", 5)));
        System.out.println(box.isInTheBox(new Thing("Pirkka", 5)));
    */
        BlackHoleBox box = new BlackHoleBox();
        box.add(new Thing("Saludo", 5));
        box.add(new Thing("Pirkka", 5));

        System.out.println(box.isInTheBox(new Thing("Saludo", 5)));
        System.out.println(box.isInTheBox(new Thing("Pirkka", 5)));

    }
}
