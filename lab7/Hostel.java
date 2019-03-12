package lab7;

public class Hostel {
    String Hostelname, HostelLocation;
    int NumberOfRooms;

    public Hostel() {
    }

    public void setHostelname(String hostelname) {
        Hostelname = hostelname;
    }

    public void setHostelLocation(String hostelLocation) {
        HostelLocation = hostelLocation;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        NumberOfRooms = numberOfRooms;
    }

    public void print(){
        System.out.println("Hostel name: "+Hostelname+" Hostel location: "+HostelLocation+" Number of rooms: "+NumberOfRooms);
    }
}
