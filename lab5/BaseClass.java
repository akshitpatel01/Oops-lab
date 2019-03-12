package lab5;

//import java.util.Date;

public class BaseClass {

   // Date d1 = new Date(yy1,mm1,dd1);
   // Date d2 = new Date(yy2,mm2,dd2);
    String name,PlaceVisited,date1,date2;

    public BaseClass() {
    }

    public BaseClass(String name, String placeVisited, String date1, String date2) {
        this.name = name;
        PlaceVisited = placeVisited;
        this.date1 = date1;
        this.date2 = date2;
    }
}
