package it.brian.school.gui.gallery;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class Form extends JFrame {
    private static final Map<String, ImageIcon> CITIES_MAP = new LinkedHashMap<>();
    JPanel contentPane;
    JPanel northPanel;
    JPanel centerPanel;
    JPanel southPanel;
    JComboBox<String> cbCities;
    JLabel lbImage;
    JButton btReset;

    public Form() throws HeadlessException {
        super("Gallery");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        init();
        setup();
        setVisible(true);
        pack();
        setBounds(80, 80, 700, 564);
    }

    private void setup() {
        setContentPane(contentPane);
        contentPane.add(northPanel, BorderLayout.NORTH);
        contentPane.add(centerPanel, BorderLayout.CENTER);
        contentPane.add(southPanel, BorderLayout.SOUTH);
        northPanel.add(cbCities);
        centerPanel.add(lbImage);
        southPanel.add(btReset);

        cbCities.addActionListener(e -> handleImageMismatch());
        btReset.addActionListener(e -> {
            lbImage.setIcon(null);
            cbCities.setSelectedIndex(0);
        });
        handleImageMismatch();

    }

    private void handleImageMismatch() {
        lbImage.setIcon(CITIES_MAP.get(((String) cbCities.getSelectedItem())));
    }

    private void init() {
        CITIES_MAP.put("Blank", null);
        CITIES_MAP.put("Roma", new ImageIcon("./resources/cities/roma.jpg"));
        CITIES_MAP.put("Milano", new ImageIcon("./resources/cities/milano.jpg"));
        CITIES_MAP.put("Napoli", new ImageIcon("./resources/cities/napoli.jpg"));
        CITIES_MAP.put("Bolzano", new ImageIcon("./resources/cities/bolzano.jpg"));
        CITIES_MAP.put("Rozzano", new ImageIcon("./resources/cities/rozzano.jpg"));
        contentPane = new JPanel(new BorderLayout());
        northPanel = new JPanel();
        centerPanel = new JPanel();
        southPanel = new JPanel();
        cbCities = new JComboBox<>(CITIES_MAP.keySet().toArray(new String[0]));
        lbImage = new JLabel();
        btReset = new JButton("Reset");
    }
}
