package it.brian.school.gui.dices;

import java.util.HashMap;
import java.util.Map;

public class Statistics {
    private int rollsCounter = 0;
    private Map<Integer, Integer> dotsCounterMap = new HashMap<>();
    private int won = 0;
    private int lost = 0;


    public void incrCountOfRolls() {
        rollsCounter++;
    }
    public int getCountOfRolls() {
        return rollsCounter;
    }

    public void incrCountOfDiceWith(int diceDots) {
        Integer currentValue = dotsCounterMap.get(diceDots);
        if (currentValue == null) {
            currentValue = 0;
        }
        dotsCounterMap.put(diceDots, currentValue + 1);
    }

    public int getCountOfDiceWith(int diceDots) {
        Integer currentValue = dotsCounterMap.get(diceDots);
        if (currentValue == null) {
            currentValue = 0;
        }
        return currentValue;
    }

    public void incrCountOfWon() {
        won++;
    }

    public void incrCountOfLost() {
        lost++;
    }

    public int getWon() {
        return won;
    }

    public int getLost() {
        return lost;
    }
}
