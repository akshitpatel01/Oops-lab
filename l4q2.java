import java.io.*;
import java.util.Scanner;
public class l4q2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s_n = s;
        File file = new File(s);
        if (file.exists()){
            System.out.println("Read: "+file.canRead());
            System.out.println("Write: "+file.canWrite());
            System.out.println("Execute: "+file.canExecute());
            System.out.println("Length: "+file.length());
        }
        else{
            System.out.println("File not found");
        }

        int i=0;
        for (i=0;i<s.length();i++){
            if (s.charAt(i)=='.'){
                break;
            }
        }
        int f=i;
        System.out.println("Extension: ");
        for (i=f;i<s.length();i++){
            System.out.print(s.charAt(i));
        }
    }
}
