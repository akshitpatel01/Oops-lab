package lab5;




import java.util.ArrayList;
import java.util.Scanner;

public class test3 {
    public static void main(String args[]) {
        ArrayList<derivedClass> list = new ArrayList<>();
       // ArrayList<derivedClass> list1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int a = 0, temp;
        String t;
        while (a != 5) {
            System.out.println("Enter your choice\n1.add passanger\n2.exit\n 3.display");
            a = sc.nextInt();
            if (a == 2) {
                break;
            }
            switch (a) {
                case 1:
                    derivedClass d = new derivedClass();
                    System.out.println("Enter Start date: ");
                    d.date1 = sc.next();
                    System.out.println("Enter end date: ");
                    d.date2 = sc.next();
                    System.out.println("Enter name");
                    d.name = sc.next();
                    System.out.println("Ente place visited: ");
                    d.PlaceVisited = sc.next();

                    list.add(d);
                    break;
                case 3:
                    for (derivedClass i : list) {
                        System.out.println("Name: " + i.name + " place visited: " + i.PlaceVisited + " Start date " + i.date1 + " end date " + i.date2);

                    }
                    break;
            }

        }
        for (derivedClass i : list) {
            System.out.println("Enter age: ");
            i.age = sc.nextInt();
        }
        for (derivedClass i : list) {
            System.out.println("Name: " + i.name + " place visited: " + i.PlaceVisited + " Start date " + i.date1 + " end date " + i.date2 + " Age: " + i.age);

        }
        System.out.println("Child passangers\n");
        for (derivedClass i : list) {
            if (i.age<12)
                System.out.println("Name: " + i.name + " place visited: " + i.PlaceVisited + " Start date " + i.date1 + " end date " + i.date2 + " Age: " + i.age);

        }
    }
}