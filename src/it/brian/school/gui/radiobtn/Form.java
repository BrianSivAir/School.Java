package it.brian.school.gui.radiobtn;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Form extends JFrame {

    private JPanel mainPanel;
    private JPanel westPanel;
    private JPanel centerPanel;
    private JPanel eastPanel;
    private JRadioButton westRadioButton1;
    private JRadioButton westRadioButton2;
    private JRadioButton westRadioButton3;
    private JRadioButton westRadioButton4;
    private JRadioButton eastRadioButton1;
    private JRadioButton eastRadioButton2;
    private JRadioButton eastRadioButton3;
    private JRadioButton eastRadioButton4;
    private ButtonGroup westButtonGroup;
    private ButtonGroup eastButtonGroup;
    private JLabel image;
    private JButton bottomButton;
    private JButton topButton;

    public Form() throws HeadlessException {
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Radio Buttons");
        setVisible(true);
        setup();
        pack();

    }

    private void setup() {
        mainPanel = new JPanel(new BorderLayout());

        westPanel = new JPanel(new GridLayout(4, 1));
        centerPanel = new JPanel(new GridLayout(1, 1));
        eastPanel = new JPanel(new GridLayout(4, 1));
        topButton = new JButton("TOP BUTTON");
        bottomButton = new JButton("BOTTOM BUTTON");

        image = new JLabel("", JLabel.CENTER);
        image.setIcon(new ImageIcon("./resources/image0.png"));

        westRadioButton1 = new JRadioButton("Radio 1");
        westRadioButton2 = new JRadioButton("Radio 2");
        westRadioButton3 = new JRadioButton("Radio 3");
        westRadioButton4 = new JRadioButton("Radio 4");

        eastRadioButton1 = new JRadioButton("Radio 1");
        eastRadioButton2 = new JRadioButton("Radio 2");
        eastRadioButton3 = new JRadioButton("Radio 3");
        eastRadioButton4 = new JRadioButton("Radio 4");

        westButtonGroup = new ButtonGroup();
        westButtonGroup.add(westRadioButton1);
        westButtonGroup.add(westRadioButton2);
        westButtonGroup.add(westRadioButton3);
        westButtonGroup.add(westRadioButton4);

        eastButtonGroup = new ButtonGroup();
        eastButtonGroup.add(eastRadioButton1);
        eastButtonGroup.add(eastRadioButton2);
        eastButtonGroup.add(eastRadioButton3);
        eastButtonGroup.add(eastRadioButton4);

        westPanel.add(westRadioButton1);
        westPanel.add(westRadioButton2);
        westPanel.add(westRadioButton3);
        westPanel.add(westRadioButton4);

        centerPanel.add(image);

        eastPanel.add(eastRadioButton1);
        eastPanel.add(eastRadioButton2);
        eastPanel.add(eastRadioButton3);
        eastPanel.add(eastRadioButton4);

        mainPanel.add(westPanel, BorderLayout.WEST);
        mainPanel.add(centerPanel, BorderLayout.CENTER);
        mainPanel.add(eastPanel, BorderLayout.EAST);
        mainPanel.add(topButton, BorderLayout.NORTH);
        mainPanel.add(bottomButton, BorderLayout.SOUTH);

        mainPanel.setBorder(new EmptyBorder(7, 7, 7, 7));

        add(mainPanel);
    }


}
