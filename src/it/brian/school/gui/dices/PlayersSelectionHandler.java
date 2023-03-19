package it.brian.school.gui.dices;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayersSelectionHandler implements ActionListener {
    private JFrame parent;
    private JLabel imageComponent;
    private Player player;
    private Match match;

    public PlayersSelectionHandler(JFrame parent, JLabel imageComponent, Player player, Match match) {
        this.parent = parent;
        this.imageComponent = imageComponent;
        this.player = player;
        this.match = match;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        imageComponent.setIcon(player.getImage());
        parent.setTitle("Player: " + player.getName());
        match.player = player;
    }
}
