package it.brian.school.gui.testingworkbench;

import javax.swing.*;
import java.awt.*;
import java.io.PrintStream;

public class Testingworkbench extends JFrame {
    private JPanel contentPane;
    private JButton cancelButton;
    private JButton confirmButton;
    private JTextField textField1;
    private JTextField textField2;
    public JTextArea outputArea;
    private JPanel pannello;

    public Testingworkbench() {
        setContentPane(contentPane);
        setVisible(true);
        setBounds(200, 200, 360, 280);
        setMinimumSize(new Dimension(360, 280));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Testing Workbench");
        setOutput();
        getRootPane().setDefaultButton(confirmButton);
        cancelButton.addActionListener(e -> {
            System.exit(0);
        });
        confirmButton.addActionListener(e -> {
            System.out.println("Pressed confirmButton: Functionality non available at the moment");
            JOptionPane.showMessageDialog(
                    SwingUtilities.windowForComponent(this),
                    "Functionality non available at the moment",
                    "Error",
                    JOptionPane.ERROR_MESSAGE,
                    UIManager.getIcon("OptionPane.errorIcon")
            );
        });
    }


    private void setOutput() {
        PrintStream printStream = new PrintStream(new GUIOutputStream(outputArea));
        System.setOut(printStream);
        System.setErr(printStream);
    }

    public static void main(String[] args) {
        new Testingworkbench();
    }

}
