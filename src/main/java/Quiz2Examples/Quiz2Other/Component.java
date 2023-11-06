package Quiz2Examples.Quiz2Other;

enum Manufacturer{
    BMW,
    VW,
    AUDI
}
class Component {
    private String name;
    private int seralNumber;
    private Manufacturer manufacturer;

    public Component(String name){
        this.name = name;
    }
    public Component(int seralNumber){
        this.seralNumber = seralNumber;
    }
    public Component(String name, int seralNumber, Manufacturer manufacturer){
        this.name = name;
        this.seralNumber = seralNumber;
        this.manufacturer = manufacturer;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getSeralNumber(){
        return seralNumber;
    }
    public void setSeralNumber(int seralNumber){
        this.seralNumber = seralNumber;
    }

    public Manufacturer getManufacturer(){
        return manufacturer;
    }
    public void setManufacturer(Manufacturer manufacturer){
        this.manufacturer = manufacturer;
    }

    public String returnInfo(){
        return "Component";
    }
}
class  Wheel extends Component{
    private int diameter;
    public Wheel(String name, int serialNumber, Manufacturer manufacturer, int diameter){
        super(name, serialNumber, manufacturer);
        this.diameter = diameter;
    }

    public int getDiameter(){
        return diameter;
    }
    public void setDiameter(int diameter){
        this.diameter = diameter;
    }

    @Override
    public String returnInfo(){
        return "Wheel";
    }
}

class GearBox extends Component{
    private int numOfGears;
    public GearBox(String name, int numOfGears){
        super(name);
        this.numOfGears = numOfGears;
    }

    public int getNumOfGears(){
        return numOfGears;
    }
    public void setNumOfGears(int numOfGears){
        this.numOfGears = numOfGears;
    }

    @Override
    public String returnInfo(){
        return "GearBox";
    }
}

class Main{
    public static void main(String[] args) {
        Component component = new Component("Car", 123, Manufacturer.BMW);
        Wheel wheel = new Wheel("Random", 321, Manufacturer.VW, 120);
        GearBox gearBox = new GearBox("RandomVol2", 7);

        System.out.println("Component:");
        System.out.println(component.getName());
        System.out.println(component.getSeralNumber());
        System.out.println(component.getManufacturer());
        System.out.println(component.returnInfo());

        System.out.println("\nWheel:");
        System.out.println(wheel.getName());
        System.out.println(wheel.getSeralNumber());
        System.out.println(wheel.getManufacturer());
        System.out.println(wheel.getDiameter());
        System.out.println(wheel.returnInfo());

        System.out.println("\nGearBox:");
        System.out.println(gearBox.getName());
        System.out.println(gearBox.getNumOfGears());
        System.out.println(gearBox.returnInfo());
    }
}