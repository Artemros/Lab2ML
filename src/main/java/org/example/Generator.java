package org.example;

import java.util.Random;

public class Generator {
    private String generateIntSymbols(int num) {
        String ret = "";
        Random random = new Random();
        for (int i = 0; i < num; i++) {
            ret += (String.valueOf(random.nextInt(10)));
        }
        return ret;
    }

    private String generateBetweenSymbols(int num) {
        if (num == 1) {
            return "-";
        }
        if (num == 2) {
            return ".";
        }
        return "";
    }

    String generate() {
        Random random = new Random();
        Recognizer recognizer = new Recognizer();
        String generatedLine = "";
        while (true) {
            int num;
            String s = "";
            if (random.nextInt(2) == 1) {
                s += "+";
            }
            s += generateIntSymbols(random.nextInt(4));
            s += generateBetweenSymbols(random.nextInt(3));
            if (random.nextInt(2) == 1) {
                s += "(";
            }
            s += generateIntSymbols(random.nextInt(2) + 2);
            if (random.nextInt(2) == 1) {
                s += ")";
            }
            s += generateBetweenSymbols(random.nextInt(3));
            s += generateIntSymbols(3);
            s += generateBetweenSymbols(random.nextInt(3));
            s += generateIntSymbols(4);
            generatedLine = s;
            break;
        }
        return generatedLine;
    }

}
