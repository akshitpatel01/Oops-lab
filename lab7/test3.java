package lab7;

import java.util.ArrayList;
import java.util.Scanner;

public class test3 {
    public static void main(String args[]) {
        int a = 1, flag = 0;
        String Hostelname, HostelLocation;
        int NumberOfRooms;
        String StudentName, ElectiveCourse;
        int RegNo;
        float AvgMarks;

        ArrayList<Student> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (a != 0) {
            System.out.println("Enter your choice:\n1.Admit Student\n2.Migrate\n3.Display\n4.Exit");
            a = sc.nextInt();
            if (a == 4)
                break;
            switch (a) {
                case 1:
                    System.out.println("Enter name: ");
                    StudentName = sc.next();
                    System.out.println("Enter Elective Course: ");
                    ElectiveCourse = sc.next();
                    System.out.println("Enter reg number: ");
                    RegNo = sc.nextInt();
                    System.out.println("Enter Avg marks: ");
                    AvgMarks = sc.nextFloat();
                    System.out.println("Enter Hostel name: ");
                    Hostelname = sc.next();
                    System.out.println("Enter Hostel location: ");
                    HostelLocation = sc.next();
                    System.out.println("Enter number of rooms of hostel: ");
                    NumberOfRooms = sc.nextInt();
                    Student s = new Student();
                    s.setStudentNmae(StudentName);
                    s.setElectiveCourse(ElectiveCourse);
                    s.setRegNo(RegNo);
                    s.setAvgMarks(AvgMarks);
                    s.setHostelname(Hostelname);
                    s.setHostelLocation(HostelLocation);
                    s.setNumberOfRooms(NumberOfRooms);
                    arr.add(s);
                    break;
                case 2:
                    System.out.println("Enter reg no of the student to be migrated: ");
                    RegNo = sc.nextInt();
                    int i;
                    flag = 0;
                    for (Student q : arr) {
                        if (q.RegNo == RegNo) {
                            flag = 1;
                            System.out.println("Enter new hostel name: ");
                            Hostelname = sc.next();
                            System.out.println("Enter new hostel location: ");
                            HostelLocation = sc.next();
                            System.out.println("Enter number of rooms of hostel: ");
                            NumberOfRooms = sc.nextInt();
                            q.migrate(Hostelname, HostelLocation,NumberOfRooms);
                            break;
                        }
                    }
                    if (flag == 0) {
                        System.out.println("Student not found");
                    }
                    break;
                case 3:
                    System.out.println("Enter reg no of the student to be displayed: ");
                    RegNo = sc.nextInt();
                    flag=0;
                    for (Student q : arr) {
                        if (q.RegNo == RegNo) {
                            flag = 1;
                            q.display();
                            break;
                        }
                    }
                    if (flag == 0) {
                        System.out.println("Student not found");
                    }
                    break;
            }
        }
    }
}
