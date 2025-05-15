/*
Write a Java program that:
	•	Takes a string input from the user.
	•	Checks if the string contains any vowels (a, e, i, o, u).
	•	If vowels are found:
	•	Print “Vowels are present.”
	•	Print the vowels found in the string (in the order they appear).
	•	If no vowels are found:
	•	Print “No vowels found.”
 */

import java.util.Scanner;

public class vowelCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase();

        String vowels = ""; // To store found vowels
        boolean hasVowel = false;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                hasVowel = true;
                vowels += ch + " ";
            }
        }

        if (hasVowel) {
            System.out.println("Vowels are present.");
            System.out.println("Vowels found: " + vowels);
        } else {
            System.out.println("No vowels found.");
        }

        scanner.close();
    }
}
