package l4_extra;
import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class Lab_04_04 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n = input.nextInt();
        ArrayList<Student> studentlist = new ArrayList<>();
        int i =0;
        while(i<n){
            Student student = new Student();
            input.nextLine();
            System.out.print("Enter the name: ");
            student.setName(input.nextLine());

            System.out.print("Enter the mail: ");
            student.setEmail(input.nextLine());

            System.out.print("Enter the cgpa: ");
            student.setCgpa(input.nextFloat());

            System.out.print("Enter the roll: ");
            student.setRoll(input.nextInt());

            input.nextLine();
            System.out.print("Enter the dept: ");
            student.setDept(input.nextLine());

            System.out.print("Enter the salary: ");
            student.setSalary_off(input.nextDouble());

            input.nextLine();
            System.out.print("Enter the dob(dd-mm-yy): ");
            String date = input.nextLine();
            Date dt = null;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-mm-yyyy");
            try {
                dt = simpleDateFormat.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            student.setDob(dt);
            studentlist.add(student);

            i++;


        }




        int j=0;
        while (j<n){
            studentlist.get(j).setAge();
            j++;
        }

        studentlist.sort(new StudentCompareCgpa().reversed());
        calculateAvgCgpa(studentlist);
        studentlist.sort(new StudentCompareCgpa());
        calculateAvgSalary(studentlist);

    }


    private static void calculateAvgCgpa(ArrayList<Student> list) {
        HashMap<String,Float> sum = new HashMap<>();
        HashMap<String,Integer> n = new HashMap<>();
        for( Student student : list){
            if(sum.containsKey(student.getDept())){
                sum.replace(student.getDept(), sum.get(student.getDept())+student.getCgpa());
                n.replace(student.getDept(), n.get(student.getDept()) + 1);
            }
            else{
                sum.put(student.getDept(), student.getCgpa());
                n.put(student.getDept(),1);
            }
        }

        for( HashMap.Entry i : sum.entrySet())
            i.setValue((Float)i.getValue()/(n.get(i.getKey())));


        String depat = new String();
        float prev = 0;
        for( HashMap.Entry i : sum.entrySet())
            if((Float)i.getValue() > prev ) {
                depat = (String)i.getKey();
                prev = (Float)i.getValue();
            }


        System.out.print("The max avg cgpa is " +prev+ " of branch "+ depat + "\n");

        for( Student stu: list)
            if(stu.getDept().compareTo(depat) == 0)
                System.out.println(stu.print_details());

    }



    private static void calculateAvgSalary(ArrayList<Student> list) {
        HashMap<String,Double> sum = new HashMap<>();
        HashMap<String,Integer> n = new HashMap<>();
        for( Student student : list){
            if(sum.containsKey(student.getDept())){
                sum.replace(student.getDept(), sum.get(student.getDept())+student.getSalary_off());
                n.replace(student.getDept(), n.get(student.getDept()) + 1);
            }
            else{
                sum.put(student.getDept(), student.getSalary_off());
                n.put(student.getDept(),1);
            }
        }

        for( HashMap.Entry i : sum.entrySet())
            i.setValue((Double)i.getValue()/(n.get(i.getKey())));


        String depat = new String();
        double prev = 0;
        for( HashMap.Entry i : sum.entrySet())
            if((Double)i.getValue() > prev ) {
                depat = (String)i.getKey();
                prev = (Double)i.getValue();
            }


        System.out.print("The max avg salary is " +prev+ " of branch "+ depat + "\n");

        for( Student stu: list)
            if(stu.getDept().compareTo(depat) == 0)
                System.out.println(stu.print_details2());

    }




}


