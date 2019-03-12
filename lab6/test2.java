package lab6;

import java.util.Scanner;

public class test2 {
    public static void main(String args[]){
        int a=1;
        Scanner sc = new Scanner(System.in);

        while(a!=0){
            System.out.println("Enter your choice\n1.WeightedProduct\n2.CountedProduct\n3.exit");
            a = sc.nextInt();sc.nextLine();
            if (a==3){
                break;
            }
            switch (a){
                case 1: //WeightedProduct w = new WeightedProduct();
                        System.out.println("Enter Item name: ");
                        String name = sc.nextLine();
                        System.out.println("Enter Unit price: ");
                        float price = sc.nextFloat();
                        System.out.println("Enter Weight in kg: ");
                        float weight = sc.nextFloat();
                        WeightedProduct w = new WeightedProduct(name,price,weight);
                        String t = w.toString();
                        System.out.println(t);
                        break;
                case 2: System.out.println("Enter Item name: ");
                        String name1 = sc.nextLine();
                        System.out.println("Enter Unit price: ");
                        float price1 = sc.nextFloat();
                        System.out.println("Enter quantity: ");
                        int weight1 = sc.nextInt();
                        CountedProduct c = new CountedProduct(name1,price1,weight1);
                        String t1 = c.toString();
                        System.out.println(t1);
                        break;
            }
        }

    }
}
