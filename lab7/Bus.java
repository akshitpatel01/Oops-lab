package lab7;

public class Bus extends Vehicle{
    private int RouteNumber;

    public Bus(int regno, float mil, String color, String ownerName, int routeNumber) {
        super(regno, mil, color, ownerName);
        RouteNumber = routeNumber;
    }

    public void showdata(){
        //System.out.println("This is vehicle class\n");
        super.showdata();
        System.out.println("RouteNumber: "+RouteNumber+" RegNo.: "+regno+" Mileage: "+mil+" Color: "+color+" Owner name: "+ownerName);
    }
}
