package lab6;

public class WeightedProduct extends Product {
    private float kg;

    public WeightedProduct(String itemName, float unitPrice,float kg) {
        super(itemName, unitPrice);
        this.kg = kg;
    }

    public WeightedProduct() {
    }

    @Override
    public float getPrice() {
        return super.getPrice()*kg;
    }

    @Override
    public String toString() {
        String s;
        s = super.toString()+" "+kg+ " kg "+getPrice()+"/-";
        return s;
    }
}
