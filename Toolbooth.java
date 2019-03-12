public class Toolbooth {
    long n;
    double a;
    public Toolbooth() {
         this.n = 0;
         this.a = 0;
    }
    public void paying_vehicle(){
        this.n++;
        this.a+=50;
    }
    public void non_paying_vehicle(){
        this.n++;
    }
    public  void print(){
        System.out.println("number of cars: "+n+"\n Amount collected: "+a);
    }
}
