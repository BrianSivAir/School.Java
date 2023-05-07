package it.brian.school.gui.texteditormenu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Form extends JFrame {
    private static final JFileChooser CHOOSER = new JFileChooser();
    private static final List<ColorMenuItem> COLOR_MENU_ITEMS = new ArrayList<>();

    private JPanel contentPane;
    private JScrollPane scrollPane;
    private JMenuBar mBar;
    private JTextArea textArea;

    public Form() {
        super("New Document");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        init();
        setContentPane(contentPane);
        setup();
        setJMenuBar(mBar);

        pack();
    }

    private void setup() {
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        contentPane.add(scrollPane, BorderLayout.CENTER);
    }

    private void init() {
        COLOR_MENU_ITEMS.add(ColorMenuItem.WHITE_ITEM);
        COLOR_MENU_ITEMS.add(ColorMenuItem.LIGHT_GRAY_ITEM);
        COLOR_MENU_ITEMS.add(ColorMenuItem.GRAY_ITEM);
        COLOR_MENU_ITEMS.add(ColorMenuItem.DARK_GRAY_ITEM);
        COLOR_MENU_ITEMS.add(ColorMenuItem.BLACK_ITEM);
        COLOR_MENU_ITEMS.add(ColorMenuItem.RED_ITEM);
        COLOR_MENU_ITEMS.add(ColorMenuItem.PINK_ITEM);
        COLOR_MENU_ITEMS.add(ColorMenuItem.ORANGE_ITEM);
        COLOR_MENU_ITEMS.add(ColorMenuItem.YELLOW_ITEM);
        COLOR_MENU_ITEMS.add(ColorMenuItem.GREEN_ITEM);
        COLOR_MENU_ITEMS.add(ColorMenuItem.MAGENTA_ITEM);
        COLOR_MENU_ITEMS.add(ColorMenuItem.CYAN_ITEM);
        COLOR_MENU_ITEMS.add(ColorMenuItem.BLUE_ITEM);

        contentPane = new JPanel(new BorderLayout());
        mBar = menuSetup();
        textArea = new JTextArea(25, 60);
        scrollPane = new JScrollPane(textArea);
    }

    public JMenuBar menuSetup() {
        JMenuBar menuBar = new JMenuBar();

        JMenu menu;
        JMenuItem item;
        JMenu submenu;

        /*
         * FILE
         */
        menu = new JMenu("File");
        menu.setMnemonic(KeyEvent.VK_F);
        menuBar.add(menu);


        item = new JMenuItem("New", KeyEvent.VK_N);
        item.addActionListener(e -> {
            textArea.setText("");
            setTitle("New document");
        });
        menu.add(item);

        item = new JMenuItem("Open", KeyEvent.VK_O);
        item.addActionListener(e -> openFile());
        menu.add(item);

        item = new JMenuItem("Save", KeyEvent.VK_S);
        item.addActionListener(e -> saveFile());
        menu.add(item);

        menu.addSeparator();

        item = new JMenuItem("Quit", KeyEvent.VK_Q);
        item.addActionListener(e -> System.exit(0));
        menu.add(item);

        /*
         * EDIT
         */
        menu = new JMenu("Edit");
        menu.setMnemonic(KeyEvent.VK_E);
        menuBar.add(menu);

        item = new JMenuItem("Cut", KeyEvent.VK_U);
        item.addActionListener(e -> textArea.cut());
        menu.add(item);
        item = new JMenuItem("Copy", KeyEvent.VK_C);
        item.addActionListener(e -> textArea.copy());
        menu.add(item);
        item = new JMenuItem("Paste", KeyEvent.VK_P);
        item.addActionListener(e -> textArea.paste());
        menu.add(item);


        /*
         * Color
         */
        menu = new JMenu("Color");
        menu.setMnemonic(KeyEvent.VK_C);
        menuBar.add(menu);

        submenu = new JMenu("Background");
        submenu.setMnemonic(KeyEvent.VK_B);
        for (ColorMenuItem colorMenuItem : COLOR_MENU_ITEMS) {
            item = new JMenuItem(colorMenuItem.getItemTitle());
            item.addActionListener(e -> textArea.setBackground(colorMenuItem.getColor()));
            submenu.add(item);
        }
        menu.add(submenu);

        submenu = new JMenu("Text");
        submenu.setMnemonic(KeyEvent.VK_T);
        for (ColorMenuItem colorMenuItem : COLOR_MENU_ITEMS) {
            item = new JMenuItem(colorMenuItem.getItemTitle());
            item.addActionListener(e -> textArea.setForeground(colorMenuItem.getColor()));
            submenu.add(item);
        }
        menu.add(submenu);
        return menuBar;
    }

    public void openFile() {
        int status = CHOOSER.showOpenDialog(this);
        if (status == JFileChooser.APPROVE_OPTION) {
            try {
                File f = CHOOSER.getSelectedFile();
                Reader fIn = new FileReader(f);
                textArea.read(fIn, null);
                setTitle(f.getName());
            } catch (Exception ignored) {
            }
        }
    }

    public void saveFile() {
        int status = CHOOSER.showSaveDialog(this);
        if (status == JFileChooser.APPROVE_OPTION) {
            try {
                File f = CHOOSER.getSelectedFile();
                Writer fOut = new FileWriter(f);
                textArea.write(fOut);
                setTitle(f.getName());
            } catch (Exception ignored) {
            }
        }
    }
}
