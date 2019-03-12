package lab5;

import java.util.Scanner;

public class test1 {
    public static void main(String args[]) {
        int a=0, x1, x2, x3, x4, y1, y2, y3, y4;
        Scanner sc = new Scanner(System.in);
        while (a!=5) {
            System.out.println("Enter your choice \n1.trapezoid\n2.parallelogram\n3.rectangle\n4.square\n5.exit");
            a = sc.nextInt();

            if (a == 5) {
                break;
            }
            switch (a) {
                case 1:
                    System.out.println("Enter 4 coordinates in cyclic order:  ");
                    x1 = sc.nextInt();
                    y1 = sc.nextInt();
                    x2 = sc.nextInt();
                    y2 = sc.nextInt();
                    x3 = sc.nextInt();
                    y3 = sc.nextInt();
                    x4 = sc.nextInt();
                    y4 = sc.nextInt();
                    Trapezoid t = new Trapezoid(x1, x2, x3, x4, y1, y2, y3, y4);
                    System.out.println("Area of trapezoid:  "+t.printArea());
                    break;
                case 2:
                    System.out.println("Enter 4 coordinates in cyclic order:  ");
                    x1 = sc.nextInt();
                    y1 = sc.nextInt();
                    x2 = sc.nextInt();
                    y2 = sc.nextInt();
                    x3 = sc.nextInt();
                    y3 = sc.nextInt();
                    x4 = sc.nextInt();
                    y4 = sc.nextInt();
                    Parallelogram p = new Parallelogram(x1, x2, x3, x4, y1, y2, y3, y4);
                    System.out.println("Area of parallelogram:  "+p.printArea());
                    break;
                case 3:
                    System.out.println("Enter 4 coordinates in cyclic order:  ");
                    x1 = sc.nextInt();
                    y1 = sc.nextInt();
                    x2 = sc.nextInt();
                    y2 = sc.nextInt();
                    x3 = sc.nextInt();
                    y3 = sc.nextInt();
                    x4 = sc.nextInt();
                    y4 = sc.nextInt();
                    Rectangle r = new Rectangle(x1, x2, x3, x4, y1, y2, y3, y4);
                    System.out.println("Area of rectangle:  "+r.printArea());
                    break;
                case 4:
                    System.out.println("Enter 4 coordinates in cyclic order:  ");
                    x1 = sc.nextInt();
                    y1 = sc.nextInt();
                    x2 = sc.nextInt();
                    y2 = sc.nextInt();
                    x3 = sc.nextInt();
                    y3 = sc.nextInt();
                    x4 = sc.nextInt();
                    y4 = sc.nextInt();
                    Square s = new Square(x1, x2, x3, x4, y1, y2, y3, y4);
                    System.out.println("Area of square:  "+s.printArea());
                    break;
            }

        }
    }
}
