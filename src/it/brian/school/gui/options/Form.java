package it.brian.school.gui.options;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Form extends JFrame {
    JPanel contentPane;
    JButton btMessage;
    JButton btConfirm;
    JButton btInput;
    JButton btQuit;

    public Form() throws HeadlessException {
        super("Options");
        init();
        setup();
        setContentPane(contentPane);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        pack();
    }

    private void init() {
        contentPane = new JPanel(new GridLayout(4, 1, 7, 7));
        btMessage = new JButton("Show message dialog");
        btConfirm = new JButton("Show confirm dialog");
        btInput = new JButton("Show input dialog");
        btQuit = new JButton("Quit");
    }

    private void setup() {
        contentPane.setBorder(new EmptyBorder(7, 7, 7, 7));

        contentPane.add(btMessage);
        contentPane.add(btConfirm);
        contentPane.add(btInput);
        contentPane.add(btQuit);


        btMessage.addActionListener(e -> JOptionPane.showMessageDialog(
                this,
                "This is a message dialog"
        ));
        btConfirm.addActionListener(e -> JOptionPane.showConfirmDialog(
                this,
                "This is a confirm dialog"
        ));
        btInput.addActionListener(e -> JOptionPane.showInputDialog(
                this,
                "This is a input dialog"
        ));
        btQuit.addActionListener(e -> {
            int option = JOptionPane.showConfirmDialog(
                    this,
                    "Are you sure?",
                    "Confirm",
                    JOptionPane.OK_CANCEL_OPTION
            );
            if (option == JOptionPane.OK_OPTION) {
                dispose();
                System.exit(0);
            }
        });
    }
}
