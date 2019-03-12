public class Ciircle extends shape{

    public Ciircle(int n1) {
        this.n1 = n1;
        this.n2 = n2;
    }

    @Override
    public void print_area() {
        System.out.println("Area of circle:  "+ 3.14*n1*n1);
    }
}

