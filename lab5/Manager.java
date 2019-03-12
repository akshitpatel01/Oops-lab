package lab5;

public class Manager extends Employee {
    String department;

    public Manager(String name, String designation, int salary,String department) {
        super(name, designation, salary);
        this.department = department;
        this.designation = "Manager";
    }

    public void printDetails(){
        System.out.println("Name: "+name+" department: "+department+" salary "+salary+" designation: "+designation);
    }
}
