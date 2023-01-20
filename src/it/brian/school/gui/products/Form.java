package it.brian.school.gui.products;

import javax.swing.*;
import java.awt.*;

public class Form extends JFrame {

    public static final Integer[] NUMBERS = new Integer[]{1,2,3,4,5,6,7,8,9,10};
    private JTextField[] products;
    private JScrollPane jScrollPane;
    private JPanel panel;

    public Form() throws HeadlessException {
        setTitle("ProgScroll");
        panel = new JPanel();
        products = new JTextField[30];
        JCheckBox checkBox;
        panel.setLayout(new GridLayout(products.length, 3));
        jScrollPane = new JScrollPane(panel);
        getContentPane().add(jScrollPane);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        for (int i = 0; i < products.length; i++) {
            checkBox = new JCheckBox("Prodotto n. " + i);
            JComboBox<Integer> comboBox = new JComboBox<>(NUMBERS);
            products[i] = new JTextField(20);
            panel.add(checkBox);
            panel.add(comboBox);
            panel.add(products[i]);
        }
        pack();
        setBounds(100, 100, 450, 250);
    }
}
