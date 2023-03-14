package it.brian.school.gui.dices;

import javax.swing.*;

public class Player {

    public static final Player CARLA = new Player("Carla", "/carla.jpg");
    public static final Player MARIA = new Player("Maria", "/maria.jpg");
    public static final Player PINA = new Player("Pina", "/pina.jpg");
    public static final Player ANDREA = new Player("Andrea", "/andrea.jpg");
    public static final Player VALERIO = new Player("Valerio", "/valerio.jpg");
    public static final Player ANNA = new Player("Anna", "/anna.jpg");

    private String name;
    private ImageIcon image;

    public Player(String name, ImageIcon image) {
        this.name = name;
        this.image = image;
    }

    public Player(String name, String imagePath) {
        this(name, new ImageIcon(imagePath));
    }
}
