package lab6;

import java.util.Scanner;

public class test1 {
    public static void main(String args[]){
        //int r1,r2,i1,i2,a=1;
        Complex a = new Complex();
        Complex b = new Complex();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first complex number\n");
        a.input();
        System.out.println("Enter second complex number\n");
        b.input();
        Complex.add(a,b);
    }
}
