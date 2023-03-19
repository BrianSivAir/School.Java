package it.brian.school.gui.dices;

public class Match {
    protected Player player;
    protected MatchLogger matchLogger;
    protected final Statistics STATISTICS = new Statistics();
    protected Dice diceOne = new Dice();
    protected Dice diceTwo = new Dice();
    protected int wager = 2;
    protected RollListener rollListener;

    @FunctionalInterface
    public interface RollListener {
        void onDiceRoll(Match match, boolean outcome);
    }

    @FunctionalInterface
    public interface MatchLogger {
        void log(String text);
    }

    public Match(Player player) {
        this.player = player;
    }

    public Match() {
        this(Player.CARLA);
    }

    public void setMatchLogger(MatchLogger matchLogger) {
        this.matchLogger = matchLogger;
    }

    public void setRollListener(RollListener rollListener) {
        this.rollListener = rollListener;
    }

    public void rollDices() {
        int dice1Dots = diceOne.rollDice().getDots();
        int dice2Dots = diceTwo.rollDice().getDots();
        int sum = dice1Dots + dice2Dots;

        STATISTICS.incrCountOfRolls();
        STATISTICS.incrCountOfDiceWith(dice1Dots);
        STATISTICS.incrCountOfDiceWith(dice2Dots);

        boolean outcome;

        if (sum == wager) {
            matchLogger.log(player.getName() + " ha vinto");
            STATISTICS.won++;
            outcome = true;
        } else {
            matchLogger.log(player.getName() + " ha perso");
            STATISTICS.lost++;
            outcome = false;
        }

        rollListener.onDiceRoll(this, outcome);
    }


}
