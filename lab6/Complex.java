package lab6;

import java.util.Scanner;

public class Complex {
    int real,imaginary;

    public Complex() {
    }

    public void input(){
        System.out.println("Enter real and imaginary part of the complex number:  ");
        Scanner sc = new Scanner(System.in);
        this.real = sc.nextInt();
        this.imaginary = sc.nextInt();
    }
    public static void add(Complex a,Complex b){
        int r,i;
        r = a.real+b.real;
        i = a.imaginary+b.imaginary;

        System.out.println("The final complex number is "+r+"+i"+i);
    }
}
