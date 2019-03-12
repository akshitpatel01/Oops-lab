package lab6;

public class SBI extends RBI{

    public SBI() {
    }

    @Override
    public void setMinimumInterestRate(int x) {
        if (x<super.getminimumInterestRate()){
            System.out.print("Intersest less than minimum\n");

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
