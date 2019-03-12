package lab7;

public class Student extends Hostel implements Department  {
    String StudentNmae,ElectiveCourse;
    int RegNo;
    float AvgMarks;

    public Student() {
    }

    public void setStudentNmae(String studentNmae) {
        StudentNmae = studentNmae;
    }

    public void setElectiveCourse(String electiveCourse) {
        ElectiveCourse = electiveCourse;
    }

    public void setRegNo(int regNo) {
        RegNo = regNo;
    }

    public void setAvgMarks(float avgMarks) {
        AvgMarks = avgMarks;
    }

    @Override
    public String getDepartmentName() {
        return DepartmentName;
    }

    @Override
    public String getDepartmentHead() {
        return DepartmentHead;
    }
    public void display(){
        System.out.println("Student name:  "+StudentNmae+"  Elective Course:  "+ElectiveCourse+"  Reg number: "+RegNo+"  Avg marks: "+AvgMarks+"  Department name: "+getDepartmentName()+"  Department head: "+getDepartmentHead());
        super.print();
    }
    public void migrate(String x,String y,int t){
        this.Hostelname = x;
        this.HostelLocation = y;
        this.NumberOfRooms = t;
        this.display();
    }
}
