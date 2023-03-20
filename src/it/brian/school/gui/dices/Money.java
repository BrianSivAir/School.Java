package it.brian.school.gui.dices;

public class Money {
    private float value;

    public Money() {
        this.value = 0;
    }

    public Money(boolean tenEuro, boolean twentyEuro, boolean fiftyEuro, boolean hundredEuro, boolean tenCents, boolean twentyCents, boolean thirtyCents, boolean fortyCents) {
        int sum = 0;

        if (tenEuro) sum += 10;
        if (twentyEuro) sum += 20;
        if (fiftyEuro) sum += 50;
        if (hundredEuro) sum += 100;

        if (tenCents) sum += 0.10;
        if (twentyCents) sum += 0.20;
        if (thirtyCents) sum += 0.30;
        if (fortyCents) sum += 0.40;

        value = sum;
    }

    public float getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value + " €";
    }
}
