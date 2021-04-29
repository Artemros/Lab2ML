package org.example;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Recognizer recognizer = new Recognizer();
        Generator generator = new Generator();
        boolean globalFlag = true;
        Scanner in = new Scanner(System.in);
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
                        System.out.println("Did recognizer recognized generated phone number:" + recognizer.nextState(stringToCheck.length(), 0, stringToCheck, 1));
                    } else if (answer == 1) {
                        System.out.println("Enter phone number:");
                        String sequence = in.nextLine();
                        sequence = StringUtils.substringBefore(sequence, " ");
                        if (sequence.length() < 9 || sequence.length() > 19) {
                            System.out.println("Phone number cant be shorter than 9 symbols or longer than 19 symbols.");
                        } else if (sequence.length() >= 9 && sequence.length() <= 19) {
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
        System.out.println("Program ended successfully.");
    }
}
