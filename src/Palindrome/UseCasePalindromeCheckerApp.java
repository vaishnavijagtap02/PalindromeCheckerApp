package Palindrome;

public class UseCasePalindromeCheckerApp {
  public   static void main(String[] args) {

      String appName = "Palindrome Checker App";
      String appVersion = "1.0.0";

      System.out.println("----------------------------------------");
      System.out.println("Welcome to the " + appName);
      System.out.println("Application Version: " + appVersion);
      System.out.println("----------------------------------------");

      System.out.println("System initialized successfully.");
    }
}

public class UseCase2PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";

        System.out.println("Palindrome Checker App - UC2: Hardcoded Palindrome Result");
        System.out.println("Checking the word: " + word);

        if (isPalindrome(word)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is NOT a palindrome.");
        }
    }


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



