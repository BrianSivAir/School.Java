package it.brian.school.gui.texteditormenu;

import java.awt.*;

public class ColorMenuItem {

    public static final ColorMenuItem WHITE_ITEM = new ColorMenuItem(Color.WHITE, "White");
    public static final ColorMenuItem LIGHT_GRAY_ITEM = new ColorMenuItem(Color.LIGHT_GRAY, "Light gray");
    public static final ColorMenuItem GRAY_ITEM = new ColorMenuItem(Color.GRAY, "Gray");
    public static final ColorMenuItem DARK_GRAY_ITEM = new ColorMenuItem(Color.DARK_GRAY, "Dark gray");
    public static final ColorMenuItem BLACK_ITEM = new ColorMenuItem(Color.BLACK, "Black");
    public static final ColorMenuItem RED_ITEM = new ColorMenuItem(Color.RED, "Red");
    public static final ColorMenuItem PINK_ITEM = new ColorMenuItem(Color.PINK, "Pink");
    public static final ColorMenuItem ORANGE_ITEM = new ColorMenuItem(Color.ORANGE, "Orange");
    public static final ColorMenuItem YELLOW_ITEM = new ColorMenuItem(Color.YELLOW, "Yellow");
    public static final ColorMenuItem GREEN_ITEM = new ColorMenuItem(Color.GREEN, "Green");
    public static final ColorMenuItem MAGENTA_ITEM = new ColorMenuItem(Color.MAGENTA, "Magenta");
    public static final ColorMenuItem CYAN_ITEM = new ColorMenuItem(Color.CYAN, "Cyan");
    public static final ColorMenuItem BLUE_ITEM = new ColorMenuItem(Color.BLUE, "Blue");

    private final Color color;
    private final String itemTitle;

    private ColorMenuItem(Color color, String itemTitle) {
        this.color = color;
        this.itemTitle = itemTitle;
    }

    public Color getColor() {
        return color;
    }

    public String getItemTitle() {
        return itemTitle;
    }
}
