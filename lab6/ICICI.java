package lab6;

public class ICICI extends RBI {
    public ICICI() {
    }

    @Override
    public void setMinimumInterestRate(int x) {
        if (x<super.getminimumInterestRate()){
            System.out.println("Intersest less than minimum\n");
        }
        else{
            this.MinimumInterestRate = x;
            Customer c = new Customer();
            Amount a = new Amount();
            c.input();
            a.input();
            System.out.println("Account of "+c.getName()+" created succesfully with "+a.value()+" at interest rate "+x);
        }
    }
}
