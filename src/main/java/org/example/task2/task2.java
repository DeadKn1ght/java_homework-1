package org.example.task2;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input numbers (when you input 0 - programm will end): ");
        int sum = 0;
        int num = scanner.nextInt();
        while (num != 0) {
            int lastNum = num;
            num = scanner.nextInt();
            if (num != 0) {
                if (lastNum > 0 && num < 0) {
                    sum += lastNum;
                }
            }
        }
        System.out.printf("Summ of numbers than placed before negative numbers is : %d", sum);
        scanner.close();
    }
}