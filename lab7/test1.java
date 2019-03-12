package lab7;

import java.util.Scanner;

public class test1 {
    public static void main(String args[]){
        int a=1;
        int regno;
        float mil;
        String color, ownerName;
        int RouteNumber;
        String ManufacturerName;
        Scanner sc = new Scanner(System.in);
        while(a!=0){
            System.out.println("Enter your choice:\n1.bus\n2.car\n3.exit");
            a = sc.nextInt();
            if (a==3)
                break;
            switch(a){
                case 1: System.out.println("Enter regno.: ");
                        regno = sc.nextInt();
                        System.out.println("Enter mileage: ");
                        mil = sc.nextFloat();
                        System.out.println("Enter color: ");
                        color = sc.next();
                        System.out.println("Enter Owner name: ");
                        ownerName = sc.next();
                        System.out.println("Enter Route number: ");
                        RouteNumber = sc.nextInt();
                        Bus b = new Bus(regno,mil,color,ownerName,RouteNumber);
                        b.showdata();
                        break;
                case 2: System.out.println("Enter regno.: ");
                        regno = sc.nextInt();
                        System.out.println("Enter mileage: ");
                        mil = sc.nextFloat();
                        System.out.println("Enter color: ");
                        color = sc.next();
                        System.out.println("Enter Owner name: ");
                        ownerName = sc.next();
                        System.out.println("Enter manufacturer name: ");
                        ManufacturerName = sc.next();
                        Car c = new Car(regno,mil,color,ownerName,ManufacturerName);
                        c.showdata();
                        break;
            }
        }
    }
}
