package it.brian.school.gui.testingworkbench;

import javax.swing.*;
import java.io.IOException;
import java.io.OutputStream;

public class GUIOutputStream extends OutputStream {

    private JTextArea textArea;

    public GUIOutputStream(JTextArea textArea) {
        this.textArea = textArea;
    }

    @Override
    public void write(int b) throws IOException {
        textArea.append(String.valueOf((char)b));
        textArea.setCaretPosition(textArea.getDocument().getLength());
        textArea.update(textArea.getGraphics());
    }
}
