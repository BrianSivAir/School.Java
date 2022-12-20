package it.brian.school.gui.testingworkbench;

import javax.swing.*;
import java.awt.*;

public class Testingworkbench extends JFrame {
    private JPanel contentPane;
    private JButton cancelButton;
    private JButton confirmButton;
    private JTextField textField1;
    private JTextField textField2;

    public Testingworkbench() {
        setContentPane(contentPane);
        setVisible(true);
        setBounds(200, 200, 360, 280);
        setMinimumSize(new Dimension(360, 280));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Testing Workbench");
        getRootPane().setDefaultButton(confirmButton);
        cancelButton.addActionListener(e -> {
            System.exit(0);
        });
    }
}
