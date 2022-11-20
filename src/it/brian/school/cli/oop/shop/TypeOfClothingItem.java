package it.brian.school.cli.oop.shop;

public class TypeOfClothingItem {
    protected String brand;
    protected String model;
    protected Float price;

    public TypeOfClothingItem(String brand, String model, Float price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void printPrice() {
        System.out.printf("Price                   : %s €%n", price);
    }

    public float applyDiscount(float discount) {
        return price - (price * (discount / 100));
    }

    public float applyDiscount(float discount, float minimumThreshold) {
        return price < minimumThreshold ? price : price - (price * (discount / 100));
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public void dump() {
        System.out.printf("""
                Brand                   : %s
                Model                   : %s
                Price                   : %s €%n""", brand, model, price);
    }
}
