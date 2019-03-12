package lab6;

import java.util.Scanner;

public class Customer {
    String name;
    int id;

    public Customer() {
    }

    void input(){
        System.out.println("Enter name:");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("Enter id: ");
        id = sc.nextInt();
    }
    String getName(){
        return name;
    }
    int getId(){
        return id;
    }
}
