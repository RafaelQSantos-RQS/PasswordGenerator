package model;

import java.util.Random;

abstract public class Password {
    static public String generatePassword() {
        // Create a random instance
        Random random = new Random();

        // Generates a random 8-digit alphanumeric string
        StringBuilder randomString = new StringBuilder();
        while (randomString.length() < 8) {
            // Generate a random character
            char randomChar = (char) random.nextInt(127);

            // Checks whether the character is a number or a letter
            if (Character.isLetterOrDigit(randomChar)) {
                // Add a character in the end
                randomString.append(randomChar);
            }
        }

        return randomString.toString();
    }

    static public String generatePassword(int length) {
        // Create a random instance
        Random random = new Random();

        // Generates a random password of the specified length
        StringBuilder randomString = new StringBuilder();
        while (randomString.length() < length) {
            // Generate a random character
            char randomChar = (char) random.nextInt(127);

            // Checks whether the character is a number or a letter
            if (Character.isLetterOrDigit(randomChar)) {
                // Add a character in the end
                randomString.append(randomChar);
            }
        }

        return randomString.toString();
    }
}
