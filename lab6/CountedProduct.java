package lab6;

public class CountedProduct extends Product {
    private int quantity;

    public CountedProduct(String itemName, float unitPrice, int quantity) {
        super(itemName, unitPrice);
        this.quantity = quantity;
    }

    public CountedProduct() {
    }

    @Override
    public float getPrice() {
        return super.getPrice()*quantity;
    }

    @Override
    public String toString() {
        String s;
        s = super.toString()+" "+quantity+ " units "+getPrice()+"/-";
        return s;
    }
}
