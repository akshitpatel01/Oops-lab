package lab5;

public class Executives extends Manager{


    public Executives(String name, String designation, int salary, String department) {
        super(name, designation, salary, department);
    }

    public void print(){
        System.out.println("Executive: ");
        printDetails();
    }
}
