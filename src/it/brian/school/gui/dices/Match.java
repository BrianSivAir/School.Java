package it.brian.school.gui.dices;

public class Match {
    private Player player;

    public Match(Player player) {
        this.player = player;
    }

    public Match() {
        this(Player.CARLA);
    }
}
