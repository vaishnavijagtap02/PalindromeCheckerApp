package Palindrome;

import java.util.Scanner;

public class UseCasePalindromeCheckerApp {

    public static void main(String[] args) {
        String appName = "Palindrome Checker App";
        String appVersion = "1.0.0";

        System.out.println("----------------------------------------");
        System.out.println("Welcome to the " + appName);
        System.out.println("Application Version: " + appVersion);
        System.out.println("----------------------------------------");
        System.out.println("System initialized successfully.\n");

        // ===== UC1 =====
        useCase1();

        // ===== UC2 =====
        useCase2();

        // ===== UC3 =====
        useCase3();
    }

    // UC1: Welcome message
    public static void useCase1() {
        System.out.println("UC1: Application is ready to check palindromes.\n");
    }

    // UC2: Hardcoded palindrome
    public static void useCase2() {
        String word = "madam";
        System.out.println("UC2: Hardcoded Palindrome Result");
        System.out.println("Checking the word: " + word);

        if (isPalindrome(word)) {
            System.out.println(word + " is a palindrome.\n");
        } else {
            System.out.println(word + " is NOT a palindrome.\n");
        }
    }

    // UC3: Palindrome check using string reverse
    public static void useCase3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("UC3: Palindrome check using string reverse");
        System.out.print("Enter a word to check: ");
        String original = sc.nextLine();

        // Reverse string using loop
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        // Compare original and reversed
        if (original.equals(reversed)) {
            System.out.println(original + " is a palindrome.\n");
        } else {
            System.out.println(original + " is NOT a palindrome.\n");
        }
    }

    // Helper method used by UC2
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
