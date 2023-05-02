package it.brian.school.gui.keylistener;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Form extends JFrame {


    private JPanel contentPane;
    private JTextField txName;
    private JButton btGreet;
    private JTextField txOutput;
    private JButton btQuit;

    public Form() throws HeadlessException {
        super("Key listener");
        init();
        setup();
        setContentPane(contentPane);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getRootPane().setDefaultButton(btGreet);
        setVisible(true);
        pack();


        /*
         * Events
         */

        txName.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                btGreet.setEnabled(txName.getText().length() > 0);
            }
        });

        btGreet.addActionListener(e -> txOutput.setText("Hello %s!".formatted(txName.getText())));

        btQuit.addActionListener(e -> {
            dispose();
            System.exit(0);
        });
    }

    private void init() {
        contentPane = new JPanel(new GridLayout(4, 1));
        txName = new JTextField();
        btGreet = new JButton("Greet me!");
        txOutput = new JTextField();
        btQuit = new JButton("Quit");
    }

    private void setup() {
        txOutput.setEditable(false);
        btGreet.setEnabled(false);
        btQuit.setBorder(new LineBorder(Color.RED));

        contentPane.add(txName);
        contentPane.add(btGreet);
        contentPane.add(txOutput);
        contentPane.add(btQuit);

        add(contentPane);
    }
}
