package org.example;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;
import java.util.Set;


public class App {
    public static void main(String[] args) {
        Recognizer recognizer = new Recognizer();
        Generator generator = new Generator();
        boolean globalFlag = true;
        Scanner in = new Scanner(System.in);
        Set<Character> intSymbols = Set.of('0', '1', '2', '3', '4', '5', '6', '7', '8', '9');
        Set<Character> plus = Set.of('+');
        Set<Character> left = Set.of('(');
        Set<Character> right = Set.of(')');
        Set<Character> between = Set.of('.', '-');
        while (globalFlag) {
            if (globalFlag) {
                System.out.println("Choose how to use program: ");
                System.out.println("0 - Use generator.");
                System.out.println("1 - Use recognizer. ");
                System.out.println("Or type 'q' to end program ");
                int answer = -1;
                String s1 = in.nextLine();
                String toCheck1 = StringUtils.substringBefore(s1, " ");
                if (toCheck1.matches("\\d+")) {
                    int gotAnswer = Integer.parseInt(toCheck1);
                    if (gotAnswer < 0 || gotAnswer > 1) {
                        System.out.println("Wrong input of chose how to create initial line. Out of range.");
                        answer = gotAnswer;
                    } else {
                        answer = gotAnswer;
                    }
                } else {
                    if (toCheck1.toLowerCase().equals("q")) {
                        globalFlag = false;
                    } else {
                        System.out.println("Wrong input of chose how to use program.");
                    }
                }
                if (globalFlag) {
                    if (answer == 0) {
                        String stringToCheck = generator.generate();
                        System.out.println("Generated phone number:" + stringToCheck);
                        if (recognizer.nextState(stringToCheck.length(), 0, stringToCheck, 1) ) {
                            System.out.println("Recognizer recognized generated phone number");
                        } else {
                            System.out.println("Something went wrong");
                        }

                    } else if (answer == 1) {
                        System.out.println("Enter phone number:");
                        String sequence = in.nextLine();
                        sequence = StringUtils.substringBefore(sequence, " ");
                        if (sequence.length() < 9 || sequence.length() > 19) {
                            System.out.println("Phone number cant be shorter than 9 symbols or longer than 19 symbols.");
                        } else if (sequence.length() >= 9 && sequence.length() <= 19) {
                            boolean flag = true;
                            for (int i = 0; i < sequence.length(); i++) {
                                if (!intSymbols.contains(sequence.charAt(i)) && !plus.contains(sequence.charAt(i)) && !left.contains(sequence.charAt(i)) && !right.contains(sequence.charAt(i)) && !between.contains(sequence.charAt(i))) {
                                    System.out.println("Your sequence have characters not from your language");
                                    flag = false;
                                }
                            }
                            if (flag) {
                                if (recognizer.nextState(sequence.length(), 0, sequence, 1)) {
                                    System.out.println("Your sequence belongs to this language");
                                } else {
                                    System.out.println("Your sequence do not belong to this to this language");
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Program ended successfully.");
    }
}
