package it.brian.school.gui.dices;

import javax.swing.*;
import java.text.MessageFormat;

public class DiceFace {
    private static final String  PATH = "./resources/dices/faces/dado{0}.png";
    private ImageIcon image;

    public DiceFace(int dots) {
        this.image = new ImageIcon(MessageFormat.format(PATH, dots));
    }

    public ImageIcon getImage() {
        return image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }
}
