package java.org.hillcrest.chapter6.password;

import java.util.Scanner;

public class PasswordCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a password to evaluate: ");
        String password = scanner.nextLine();

        int score = CriteriaChecker.evaluateCriteria(password);
        String strength = CriteriaChecker.determineStrength(score);

        System.out.println("\nPassword Strength: " + strength + " (" + score + "/5)");

        if (!strength.equals("Strong")) {
            System.out.println("Suggestions to improve your password:");
            System.out.println(FeedbackGenerator.generateFeedback(password));
        }

        scanner.close();
    }
}

