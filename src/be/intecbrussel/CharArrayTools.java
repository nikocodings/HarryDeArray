package be.intecbrussel;

import java.util.Scanner;

public class CharArrayTools {

    public char[] letters = new char[5];
    Scanner scanner = new Scanner(System.in);
    public char fillerLetter;


    public void startProgram() {
        filterAlphabet();

    }

    private char[] filterAlphabet() {
        System.out.println("Give 5 characters.");
        for (int i = 0; i < letters.length; i++) {
            fillerLetter = scanner.next().charAt(0);
            if (fillerLetter > 96 || fillerLetter > 123) {
                letters[i] = fillerLetter;
            }else{
                letters[i] = 0;
            }

        }
        System.out.println(letters);
        return letters;
    }
}