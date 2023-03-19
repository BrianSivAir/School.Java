package it.brian.school.gui.dices;

import javax.swing.*;

public class Player {

    private static final String PREFIX = "./resources/dices";

    public static final Player CARLA = new Player("Carla", PREFIX + "/carla.jpg");
    public static final Player MARIA = new Player("Maria", PREFIX + "/maria.jpg");
    public static final Player PINA = new Player("Pina", PREFIX + "/pina.jpg");
    public static final Player ANDREA = new Player("Andrea", PREFIX + "/andrea.jpg");
    public static final Player VALERIO = new Player("Valerio", PREFIX + "/valerio.jpg");
    public static final Player ANNA = new Player("Anna", PREFIX + "/anna.jpg");

    private String name;
    private ImageIcon image;

    public Player(String name, ImageIcon image) {
        this.name = name;
        this.image = image;
    }

    public Player(String name, String imagePath) {
        this(name, new ImageIcon(imagePath));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ImageIcon getImage() {
        return image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }
}
