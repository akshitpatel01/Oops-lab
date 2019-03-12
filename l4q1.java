import java.util.Scanner;
public class l4q1 {
    public static void main(String args[]){
       int x,y;
       Scanner sc = new Scanner(System.in);
       x = sc.nextInt();
       y = sc.nextInt();
        Rectangle r = new Rectangle(x,y);
        Triangle t = new Triangle(x,y);
        Ciircle c = new Ciircle(x);

        r.print_area();
        t.print_area();
        c.print_area();
    }
}
