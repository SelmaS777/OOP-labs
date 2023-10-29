package week4.Shapes;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", FillType.NOT_FILLED, 7.0);

        System.out.println("Circle Information: ");
        circle.displayInfo();

        Rectangle rectangle = new Rectangle("Blue", FillType.FILLED, 5.0, 7.0);

        System.out.println("\nRectangle Information: ");
        rectangle.displayInfo();
    }
}
