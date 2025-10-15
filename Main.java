// Joe Jiao
// October 15, 2025
// This program determines the user's perfect pet given their inputs of favorite color & season along with name
// The selection for the perfect pet is determined by logic written on the rubric in chronological order

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Variable declarations
        String favColor;
        String favSeason;
        String name;
        boolean vowel;
        String pet = "placeholder";

        // Scanner definition
        Scanner scanner = new Scanner(System.in);

        // Repeatedly asks user for their favorite color (of those available) until they make a valid entry
        while (true) {
            // Asks user for favorite color
            System.out.println("Enter your favorite color (Red, blue, or green)");
            favColor = scanner.nextLine();
            favColor = (favColor.toLowerCase()).trim();

            // Checks if user input is valid. If so, the loop will end. Else the user will be asked again
            if ((favColor.equals("red")) || (favColor.equals("blue")) || (favColor.equals("green"))){
                break;
            } else System.out.println("Invalid imput. Please try again.");
        }

        // Repeatedly asks user for their favorite season until they make a valid entry
        while (true) {
            // Asks user for favorite season
            System.out.println("Enter your favorite season (Winter, Spring, Summer, or Autumn)");
            favSeason = scanner.nextLine();
            favSeason = (favSeason.toLowerCase()).trim();
            
            // Checks if user input is valid. If so, the loop will end. Else the user will be asked again
            if ((favSeason.equals("winter")) || (favSeason.equals("spring")) || (favSeason.equals("summer")) || (favSeason.equals("autumn"))){
                break;
            } else System.out.println("Invalid imput. Please try again.");
        }

        // Repeatedly asks user for their name until they enter a valid name
        boolean validName = true;
        while (true) {
            // Asks user for name
            System.out.println("Enter your name (Without accents and other special characters)");
            System.out.println("Periods, hyphens, and apostrophes are acceptable");
            name = scanner.nextLine();

            validName = true;

            // Checks if user included invalid characters in their name
            for (int i = 0; i < name.length() - 1; i++) {
                if ("abcdefghijklmnopqrstuvwxyz.-\' ".indexOf((name.toLowerCase()).charAt(i)) == -1) {
                    validName = false;
                    break;
                }
            }

            // Ends the infinite loop if the user input is valid
            if (validName) break;
            // Repeats the loop if user input is invalid
            else System.out.println("Your input seems to contain invalid characters. Please try again");
        }
        // Determines if the user's (inputed) name begins with a vowel
        vowel = ("aeiouAEIOU".indexOf(name.substring(0,1)) != -1);

        // Closes scanner as it is no longer used (github gets mad because of reasource leak if I don't close it).
        scanner.close();

        // Determines perfect pet based on user input
        // Logic is done in chronological order of what was written on the rubric
        if (favColor.equals("blue")) {
            if (favSeason.equals("autumn")) pet = "alligator";
            else if (favSeason.equals("spring")) pet = "ostrich";
        } else if (favColor.equals("green")) {
            if (!vowel && (favSeason.equals("winter"))) pet = "giraffe";
            else if (!favSeason.equals("autumn")) pet = "dog";
        } else {
            if (vowel) pet = "panda";
            else pet = "porcupine";
        }

        if (favSeason.equals("summer") && !(pet.equals("dog") || pet.equals("panda") || pet.equals("porcupine"))) {
            pet = "pony";
        }

        if (!vowel && (favColor.equals("blue")) && !(favSeason.equals("summer") || favSeason.equals("autumn")) && !(pet.equals("ostrich"))) {
            pet = "axolotl";
        }

        if (pet.equals("placeholder")) pet = "rock";

        // Prints user's perfect pet
        System.out.println("Your perfect pet is a " + pet);
    }
}
