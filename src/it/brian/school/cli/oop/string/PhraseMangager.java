package it.brian.school.cli.oop.string;

import java.math.BigDecimal;
import java.math.MathContext;

public class PhraseMangager {
    private String phrase;
    private float vowels;
    private float blankSpaces;

    public void analyze(String phrase) {
        this.phrase = phrase;
        for (int i = 0; i < phrase.length(); i++) {
            char ch = phrase.toLowerCase().charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }
            if (ch == ' ') {
                blankSpaces++;
            }
        }
    }

    public BigDecimal getVowelsFreq() {
        return roundFreq(vowels / phrase.length());
    }

    public BigDecimal getBlankSpacesFreq() {
        return roundFreq(blankSpaces / phrase.length());
    }

    private BigDecimal roundFreq(float freq) {
        BigDecimal freqBg = BigDecimal.valueOf(freq);
        return freqBg.round(new MathContext(3));
    }
}
