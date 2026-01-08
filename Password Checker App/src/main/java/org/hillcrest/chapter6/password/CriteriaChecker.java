package java.org.hillcrest.chapter6.password;

public class CriteriaChecker {

    public static int evaluateCriteria(String password) {
        int score = 0;

        // Criterion 1: Length ≥ 8
        if (password.length() >= 8) {
            score++;
        }

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        String specialChars = "!@#$%^&*()-+=";

        // Loop through characters
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (Character.isUpperCase(c)) {
                hasUpper = true;
            }
            if (Character.isLowerCase(c)) {
                hasLower = true;
            }
            if (Character.isDigit(c)) {
                hasDigit = true;
            }
            if (specialChars.indexOf(c) != -1) {
                hasSpecial = true;
            }
        }

        if (hasUpper) score++;
        if (hasLower) score++;
        if (hasDigit) score++;
        if (hasSpecial) score++;

        return score;
    }

    public static String determineStrength(int score) {
        if (score <= 2) {
            return "Weak";
        } else if (score == 3) {
            return "Moderate";
        } else {
            return "Strong";
        }
    }
}
