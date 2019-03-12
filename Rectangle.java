public class Rectangle extends shape{

    public Rectangle(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    @Override
    public void print_area() {
        System.out.println("Area of rectangle:  "+ n1*n2);
    }
}

