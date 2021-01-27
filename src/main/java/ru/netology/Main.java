package ru.netology;

import java.util.Arrays;
import java.util.Random;

public class Main {
    private static final int MAX_NUMBER_OF_LETTERS_IN_WORD = 20;
    private static final int MIN_NUMBER_OF_LETTERS_IN_WORD = 5;

    public static void main(String[] args) {

        String message = getPhrase(1000);
        System.out.println(message);
        printSortedWords(message);
    }

    private static void printSortedWords(String message) {
        Arrays.stream(message
                .toLowerCase()
                .trim()
                .replace("^", "")
                .replaceAll("[^a-z^A-Z^ ]", "")
                .split(" "))
                .sorted()
                .forEach(System.out::println);
    }

    private static String getPhrase(int count){
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            for (int j = 0; j <
                    Math.abs(MIN_NUMBER_OF_LETTERS_IN_WORD + random.nextInt(MAX_NUMBER_OF_LETTERS_IN_WORD - MIN_NUMBER_OF_LETTERS_IN_WORD));
                 j++) {

                sb.append((char)(random.nextInt(58) + 'A'));
            }
            sb.append(" ");
        }
        return sb.toString();
    }


}
