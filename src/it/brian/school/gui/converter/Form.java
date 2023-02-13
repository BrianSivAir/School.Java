package it.brian.school.gui.converter;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Form extends JFrame {

    private JPanel contentPane;
    private JLabel lblFeet;
    private JLabel lblMeter;
    private JTextField txtFeet;
    private JTextField txtMeter;
    private JButton btConvert;
    private JButton btReset;

    public Form() throws HeadlessException {
        init();
        setup();
    }

    private void setup() {
        setVisible(true);
        setTitle("Feet to Meter Converter");
        setContentPane(contentPane);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(50, 50, 290, 140);
        setResizable(false);
        getRootPane().setDefaultButton(btConvert);

        contentPane.add(lblFeet);
        contentPane.add(txtFeet);
        contentPane.add(lblMeter);
        contentPane.add(txtMeter);
        contentPane.add(btConvert);
        contentPane.add(btReset);

        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        lblFeet.setHorizontalAlignment(JLabel.RIGHT);
        lblMeter.setHorizontalAlignment(JLabel.RIGHT);

        txtMeter.setEditable(false);

        btConvert.addActionListener(e -> txtMeter.setText(String.valueOf(Float.parseFloat(txtFeet.getText()) / 3.281F)));
        btReset.addActionListener(e -> {
            txtFeet.setText("");
            txtMeter.setText("");
        });
    }

    private void init() {
        contentPane = new JPanel(new GridLayout(3, 2, 5, 5));
        lblFeet = new JLabel("Feet:");
        lblMeter = new JLabel("Meter:");
        txtFeet = new JTextField();
        txtMeter = new JTextField();
        btConvert = new JButton("Convert");
        btReset = new JButton("Reset");
    }


}
