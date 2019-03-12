package lab6;

import java.util.Scanner;

public class Amount {
    public Amount() {
    }

    int v;
    void input(){
        System.out.println("Enter amount");
        Scanner sc = new Scanner(System.in);
        v = sc.nextInt();
    }
    int value(){
        return v;
    }
}
