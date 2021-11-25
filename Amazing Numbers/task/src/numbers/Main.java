package numbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Amazing Numbers!");
        System.out.println();
        System.out.println("Supported requests:");
        System.out.println("- enter a natural number to know its properties;");
        System.out.println("  * the first parameter represents a starting number;");
        System.out.println("  * the second parameters show how many consecutive numbers are to be processed;");
        System.out.println("- separate the parameters with one space;");
        System.out.println("- enter 0 to exit");
        System.out.println();
        while (true) {
            System.out.print("Enter a request: ");
            long num = scanner.nextLong();
            System.out.println();
            if (num == 0) {
                return;
            }
            if (num < 0) {
                System.out.println("The first parameter should be a natural number or zero.");
                continue;
            }
            System.out.println("Properties of " + num);
            numIsEven(num);
            numIsOdd(num);
            isBuzzNumber(num);
            isDuckNumber(num);
            isPalindromic(num);
        }
    }

    private static void numIsEven(long num) {
        if (num % 2 == 0) {
            System.out.println("even: true");
        } else {
            System.out.println("even: false");
        }
    }

    private static void numIsOdd(long num) {
        if (num % 2 != 0) {
            System.out.println("odd: true");
        } else {
            System.out.println("odd: false");
        }
    }

    private static void isBuzzNumber(long num) {
        if (num % 10 == 7 || num % 7 == 0) {
            System.out.println("buzz: true");
        } else {
            System.out.println("buzz: false");
        }
    }

    private static void isDuckNumber(long num) {
        String str = Long.toString(num);
        if (str.charAt(0) != '0' && str.contains("0")) {
            System.out.println("duck: true");
        } else {
            System.out.println("duck: false");
        }
    }

    private static void isPalindromic(long num) {
        String str = Long.toString(num);
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - (i + 1))) {
                System.out.println("Palindromic: false");
            }
        }
        System.out.println("Palindromic: true");
    }
}