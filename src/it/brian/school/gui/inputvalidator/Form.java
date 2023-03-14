package it.brian.school.gui.inputvalidator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;

public class Form extends JFrame {
    private JPanel contentPane;
    private JPanel input;
    private JPanel actions;
    private JLabel lbName;
    private JLabel lbSurname;
    private JTextField txName;
    private JTextField txSurname;
    private JButton btConfirm;
    private JButton btCancel;

    public Form() throws HeadlessException {
        init();
        setup();
        pack();
        setBounds(50, 50, 302, 136);
    }

    private void init() {
        contentPane = new JPanel(new BorderLayout());
        input = new JPanel(new GridLayout(2,2));
        actions = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        lbName = new JLabel("Name: ", SwingConstants.RIGHT);
        lbSurname = new JLabel("Surname: ", SwingConstants.RIGHT);
        txName = new JTextField();
        txSurname = new JTextField();
        btConfirm = new JButton("Confirm");
        btCancel = new JButton("Cancel");
    }

    private void setup() {
        setVisible(true);
        setContentPane(contentPane);
        getRootPane().setDefaultButton(btConfirm);
        contentPane.add(input, BorderLayout.CENTER);
        contentPane.add(actions, BorderLayout.SOUTH);

        input.add(lbName);
        input.add(txName);
        input.add(lbSurname);
        input.add(txSurname);

        actions.add(btConfirm);
        actions.add(btCancel);

        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

        /*
        * Events
        */

        btConfirm.addActionListener(e -> {
            if (validateThis()) {
                JOptionPane.showMessageDialog(
                        this,
                        "Form has passed validation!",
                        "Success",
                        JOptionPane.INFORMATION_MESSAGE);
            }

        });

        btCancel.addActionListener(e -> {
            processWindowEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        });

        addWindowListener(new WindowClosingHandler(this));
    }

    private boolean validateThis() {
        String message = "";
        if (txName.getText().length() < 2 || txName.getText().length() > 20) {
            message = "Invalid name";
        } else if (txSurname.getText().length() < 2 || txSurname.getText().length() > 20) {
            message = "Invalid surname";
        } else {
            return true;
        }

        JOptionPane.showMessageDialog(
                this,
                message,
                "Invalid input",
                JOptionPane.ERROR_MESSAGE);
        return false;
    }

}
