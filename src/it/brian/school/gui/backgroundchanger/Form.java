package it.brian.school.gui.backgroundchanger;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class Form extends JFrame {
    private static final Map<String, Color> COLOR_MAP = new LinkedHashMap<>();
    JPanel contentPane;
    JPanel centerPanel;
    JPanel northPanel;
    JLabel lbBackground;
    JComboBox<String> cbColors;
    JButton btApply;

    public Form() throws HeadlessException {
        super("Background changer");
        init();
        setup();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setBounds(80, 80, 300, 300);
    }


    private void setup() {
        getRootPane().setDefaultButton(btApply);
        setContentPane(contentPane);
        contentPane.add(centerPanel, BorderLayout.CENTER);
        contentPane.add(northPanel, BorderLayout.NORTH);
        northPanel.add(lbBackground);
        northPanel.add(cbColors);
        northPanel.add(btApply);
        btApply.addActionListener(e -> Form.this.handleBackgroundMismatch());

        handleBackgroundMismatch();
    }

    private void handleBackgroundMismatch() {
        centerPanel.setBackground(COLOR_MAP.get(((String) cbColors.getSelectedItem())));
    }

    private void init() {
        COLOR_MAP.put("White", Color.WHITE);
        COLOR_MAP.put("Light gray", Color.LIGHT_GRAY);
        COLOR_MAP.put("Gray", Color.GRAY);
        COLOR_MAP.put("Dark gray", Color.DARK_GRAY);
        COLOR_MAP.put("Black", Color.BLACK);
        COLOR_MAP.put("Red", Color.RED);
        COLOR_MAP.put("Pink", Color.PINK);
        COLOR_MAP.put("Orange", Color.ORANGE);
        COLOR_MAP.put("Yellow", Color.YELLOW);
        COLOR_MAP.put("Green", Color.GREEN);
        COLOR_MAP.put("Magenta", Color.MAGENTA);
        COLOR_MAP.put("Cyan", Color.CYAN);
        COLOR_MAP.put("Blue", Color.BLUE);

        contentPane = new JPanel(new BorderLayout());
        centerPanel = new JPanel();
        northPanel = new JPanel();

        lbBackground = new JLabel("Background: ");
        cbColors = new JComboBox<>(COLOR_MAP.keySet().toArray(new String[0]));
        btApply = new JButton("Apply");
    }
}