package it.brian.school.gui.calculator;

import javax.swing.*;

public class Form extends JFrame {
    private JPanel contentPane;
    private JTextField textField1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton sqrtButton;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button9;
    private JButton button10;
    private JButton button8;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button16;
    private JButton button17;
    private JButton button19;
    private JButton backButton;
    private JButton CTButton;
    private JButton CEButton;
    private JButton cButton;
    private JTextArea textArea1;
    private JButton button4;
    private JButton button15;
    private JButton button18;
    private JButton button20;
    private JButton button21;
    private JMenuBar menuBar;

    public Form() {
        init();
        setup();

        setContentPane(contentPane);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        pack();
    }

    private void init() {
        menuBar = new JMenuBar();
    }

    private void setup() {
        menu();
    }

    private void menu() {
        JMenu file = new JMenu("File");
        menuBar.add(file);

        JMenu edit = new JMenu("Edit");
        menuBar.add(edit);

        JMenu view = new JMenu("View");
        menuBar.add(view);

        JMenu color = new JMenu("Color");
        menuBar.add(color);

        JMenu help = new JMenu("Help");
        menuBar.add(help);
    }
}
