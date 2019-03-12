package lab7;

public class Vehicle {
    protected  int regno;
    protected float mil;
    protected String color, ownerName;

    public Vehicle(int regno, float mil, String color, String ownerName) {
        this.regno = regno;
        this.mil = mil;
        this.color = color;
        this.ownerName = ownerName;
    }

    public void showdata(){
        System.out.println("This is vehicle class\n");
    }
}
