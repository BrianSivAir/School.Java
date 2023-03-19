package it.brian.school.gui.dices;

import java.util.Random;

public class Dice {
    private static final Random random = new Random();
    private static final int FACES = 6;
    private DiceFace[] faces = new DiceFace[FACES];

    private DiceFace topFace;


    public Dice() {
        for (int i = 0; i < FACES; i++) {
            faces[i] = new DiceFace(i + 1);
        }
        topFace = faces[faces.length - 1];
    }

    public static int getFACES() {
        return FACES;
    }

    public DiceFace rollDice() {
        int i = random.nextInt(6);
        topFace = faces[i];
        return topFace;
    }

    public DiceFace getTopFace() {
        return topFace;
    }

    public void setTopFace(DiceFace topFace) {
        this.topFace = topFace;
    }
}
