package it.brian.school.cli.oop.shop;

public class ClothingItem extends TypeOfClothingItem{
    private Float size;
    private Integer purchasedQuantity;
    private Integer availableQuantity;

    public ClothingItem(String brand, String model, Float price, Float size, Integer purchasedQuantity, Integer availableQuantity) {
        super(brand, model, price);
        this.size = size;
        this.purchasedQuantity = purchasedQuantity;
        this.availableQuantity = availableQuantity;
    }

    public void registerSale(int quantity) {
        if (availableQuantity >= quantity) {
            availableQuantity -= quantity;
        }
    }

    @Override
    public void setPrice(Float price) {
        if (price >= 0) {
            super.setPrice(price);
        }
    }

    public void dump() {
        super.dump();
        System.out.printf("""
                Size                    : %s
                Purchased quantity      : %s
                Available quantity      : %s%n""", size, purchasedQuantity, availableQuantity);
    }
}
