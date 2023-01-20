package it.brian.school.gui.products;

import com.formdev.flatlaf.FlatLightLaf;

public class Main {
    public static final Integer[] NUMBERS = new Integer[]{1,2,3,4,5,6,7,8,9,10};
    public static void main(String[] args) {
        FlatLightLaf.setup();
        new Form();
    }
}
