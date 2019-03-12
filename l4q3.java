import java.util.Scanner;
public class l4q3 {
    public static void main(String args[]){
        Toolbooth t = new Toolbooth();
        //t.paying_vehicle();
        //t.paying_vehicle();
        //t.non_paying_vehicle();
        //t.non_paying_vehicle();
        Scanner sc = new Scanner(System.in);
        int c=1,temp;
        while (c!=0){
            System.out.println("1 to continue\n0 to exit\n");
            c = sc.nextInt();
            if (c==0){
                break;
            }
            System.out.println("2 for paying vehicle\n3 for non paying vehicle\n");
            temp = sc.nextInt();
            if (temp==2){
                t.paying_vehicle();
            }
            if (temp==3){
                t.non_paying_vehicle();
            }
        }
        t.print();
    }
}
