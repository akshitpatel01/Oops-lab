package lab6;

import java.awt.event.ItemEvent;

public class Product {
    private String itemName;
    private float UnitPrice;

    public Product(String itemName, float unitPrice) {
        this.itemName = itemName;
        UnitPrice = unitPrice;
    }

    public Product() {
        this.itemName = "No product";
        this.UnitPrice = 0;
    }

    public float getPrice(){
        return this.UnitPrice;
    }

    @Override
    public String toString() {
        String s;
        s = itemName+"@"+UnitPrice+"/-";
        return s;
    }
}
