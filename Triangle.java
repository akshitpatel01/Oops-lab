public class Triangle extends shape{

    public Triangle(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    @Override
    public void print_area() {
        System.out.println("Area of triangle:  "+ 0.5*n1*n2);
    }
}
