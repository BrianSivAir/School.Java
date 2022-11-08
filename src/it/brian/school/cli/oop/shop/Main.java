package it.brian.school.cli.oop.shop;

public class Main {
    public static void main(String[] args) {
        System.out.println("""
                ------------------------------------
                               COLMAR
                ------------------------------------"""
        );
        TypeOfClothingItem colmar = new TypeOfClothingItem("Colmar", "Giacca E45", 250.5F);
        colmar.dump();

        int discount = 30;
        System.out.printf("Discount                : %d %%%n", discount);
        System.out.printf("Discounted price        : %s €%n", colmar.applyDiscount(discount));

        System.out.println();

        System.out.println("""
                ------------------------------------
                                LEVIS
                ------------------------------------"""
        );
        ClothingItem levis = new ClothingItem("Levis", "Jeans 570SC", 79.8F, 40F, 30, 30);
        levis.registerSale(2);
        levis.dump();
    }
}
