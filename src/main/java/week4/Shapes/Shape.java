package week4.Shapes;

enum FillType {
    FILLED,
    NOT_FILLED
}

public class Shape {
    private String color;
    private FillType filled;

    public Shape(String color, FillType filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return color;
    }

    public FillType getFilled(){
        return filled;
    }

    public void displayInfo(){
        String fillStatus;
        if (filled == FillType.FILLED){
            fillStatus = "filled";
        }else{
            fillStatus = "not filled";
        }
        System.out.println("Color: " + color);
        System.out.println("Fill: " + fillStatus);
    }
    public double getArea(){
        return 0.0;
    }
}

class Circle extends Shape{
    private double radius;
    private static final double PI = Math.PI;

    public Circle(String color, FillType filled, double radius){
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Radius: " + radius);
        System.out.println("Shape Type: Circle");
    }

    @Override
    public double getArea(){
        return PI * radius * radius;
    }

    // using user-specified PI
    public double calculateCircumference(double customPI, double r){
        return 2 * customPI * r;
    }

    // using constant PI
    public double calculateCircumference(double r){
        return 2 * PI * r;
    }
}

class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(String color, FillType filled, double width, double height){
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Shape Type: Rectangle");
    }

    @Override
    public double getArea(){
        return width * height;
    }
}
