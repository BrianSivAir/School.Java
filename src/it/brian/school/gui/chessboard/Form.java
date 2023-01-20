package it.brian.school.gui.chessboard;

import javax.swing.*;
import java.awt.*;

public class Form extends JFrame {
    private JPanel contentPane;
    public Form(int rows, int columns) throws HeadlessException {
        contentPane = new JPanel(new GridLayout(rows, columns));
        setContentPane(contentPane);
        setAlwaysOnTop(true);
        setLocation(100, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                JPanel box = new JPanel();
                if ((r + c) % 2 == 0) {
                    box.setBackground(Color.WHITE);
                } else {
                    box.setBackground(Color.RED);
                }
                add(box);
            }
        }
        pack();
    }
}
