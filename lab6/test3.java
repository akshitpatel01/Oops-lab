package lab6;



import java.util.Scanner;

public class test3 {
    public static void main(String args[]) {
        int temp, a = 1, b;
        System.out.println("Enter value of RBI minimum interest rate\n");
        Scanner sc = new Scanner(System.in);

        temp = sc.nextInt();
        RBI r = new RBI();
        r.setMinimumInterestRate(temp);


        while (a != 0) {
            System.out.println("Enter choice\n1.add account\n2.exit");
            a = sc.nextInt();
            if (a == 2) {
                break;
            }
            System.out.println("Enter bank\n1.SBI\n2.ICICI");
            b = sc.nextInt();
            switch (b) {
                case 1:
                    SBI s = new SBI();
                    System.out.println("Enter Min interest rate for SBI");
                    temp = sc.nextInt();
                    s.setMinimumInterestRate(temp);
                    break;
                case 2:
                    ICICI i = new ICICI();
                    System.out.println("Enter Min interest rate for ICICI");
                    temp = sc.nextInt();
                    i.setMinimumInterestRate(temp);
                    break;

            }
        }
    }
}
