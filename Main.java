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

        // Gets favorite color (of those available)
        while (true) {
            System.out.println("Enter your favorite color (Red, blue, or green)");
            favColor = scanner.nextLine();
            favColor = (favColor.toLowerCase()).trim();
            
            if ((favColor.equals("red")) || (favColor.equals("blue")) || (favColor.equals("green"))){
                break;
            } else System.out.println("Invalid imput");
        }

        // Gets favorite season
        while (true) {
            System.out.println("Enter your favorite season (Winter, Spring, Summer, or Autumn)");
            favSeason = scanner.nextLine();
            favSeason = (favSeason.toLowerCase()).trim();
            
            if ((favSeason.equals("winter")) || (favSeason.equals("spring")) || (favSeason.equals("summer")) || (favSeason.equals("autumn"))){
                break;
            } else System.out.println("Invalid imput");
        }

        // Gets name
        System.out.println("Enter your name");
        name = scanner.nextLine();
        vowel = ("aeiouAEIOU".indexOf(name.substring(0,1)) != -1);

        // Closes scanner 
        scanner.close();

        // Determines perfect pet
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
            if (pet.equals("placeholder")) pet = "pony";
            else pet += " and pony";
        }
        if (!vowel && (favColor.equals("blue")) && !(favSeason.equals("summer") || favSeason.equals("autumn")) && !(pet.equals("ostrich"))) {
            if (pet.equals("placeholder")) pet = "axolotl";
            else pet += " and axolotl";
        }

        if (pet.equals("placeholder")) pet = "rock";
        System.out.println(pet);
    }
}
