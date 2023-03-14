package it.brian.school.gui.dices;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayersSelectionHandler implements ActionListener {
    private static final String PREFIX = "./resources/dices";
    private JLabel imageComponent;
    private String imagePath;

    public static final String CARLA = "/carla.jpg";
    public static final String MARIA = "/maria.jpg";
    public static final String PINA = "/pina.jpg";
    public static final String ANDREA = "/andrea.jpg";
    public static final String VALERIO = "/valerio.jpg";
    public static final String ANNA = "/anna.jpg";

    public PlayersSelectionHandler(JLabel imageComponent, String imagePath) {
        this.imageComponent = imageComponent;
        this.imagePath = imagePath;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        imageComponent.setIcon(new ImageIcon(PREFIX + imagePath));
    }
}
