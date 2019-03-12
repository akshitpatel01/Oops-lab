package lab7;

public class Car extends Vehicle {
    private String ManufacturerName;

    public Car(int regno, float mil, String color, String ownerName, String manufacturerName) {
        super(regno, mil, color, ownerName);
        ManufacturerName = manufacturerName;
    }

    public void showdata(){
        //System.out.println("This is vehicle class\n");
        super.showdata();
        System.out.println("manufacturer name: "+ManufacturerName+" RegNo.: "+regno+" Mileage: "+mil+" Color: "+color+" Owner name: "+ownerName);
    }
}
