package it.brian.school.cli.oop.caesar;

public class Encryptor {
    private final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public String encrypt(String text, int key) {
        char[] textChars = text.toUpperCase().toCharArray();
        for (int i = 0; i < textChars.length; i++) {
            if (ALPHABET.indexOf(textChars[i]) != -1) {
                int index = ALPHABET.indexOf(textChars[i]) + key;
                while (index >= 26) {
                    index -= 26;
                }
                while (index < 0) {
                    index += 26;
                }
                textChars[i] = ALPHABET.charAt(index);
            }
        }
        return new String(textChars);
    }

    public String decrypt(String encryptedText, int key) {
        char[] textChars = encryptedText.toUpperCase().toCharArray();
        for (int i = 0; i < textChars.length; i++) {
            if (ALPHABET.indexOf(textChars[i]) != -1) {
                int index = ALPHABET.indexOf(textChars[i]) - key;
                while (index >= 26) {
                    index -= 26;
                }
                while (index < 0) {
                    index += 26;
                }
                textChars[i] = ALPHABET.charAt(index);
            }
        }
        return new String(textChars);
    }
}
