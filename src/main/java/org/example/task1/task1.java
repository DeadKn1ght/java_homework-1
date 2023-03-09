package org.example.task1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your string of words :");
        String s = scanner.nextLine();
        s = ReversStr(s);
        System.out.println("Reverse of your string is :");
        System.out.println(s);
    }

    public static String ReversStr(String str) {
        str = str.replaceAll("\\s+", " ");
        String[] word1 = str.split(" ");
        String[] word2 = new String[word1.length];
        for (int i = 0; i < word1.length; i++) {
            if (word1[i] != " ") {
                word2[i] = word1[word1.length - 1 - i];
            }
        }
        return String.join(" ", word2);
    }
}
