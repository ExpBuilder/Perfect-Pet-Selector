import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Variable declarations
        String favColor;
        String favSeason;
        String name;

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
            System.out.println("Enter your favorite season (Winter, Spring, Summer, Autumn)");
            favSeason = scanner.nextLine();
            favSeason = (favSeason.toLowerCase()).trim();
            
            if ((favSeason.equals("winter")) || (favSeason.equals("spring")) || (favSeason.equals("summer")) || (favSeason.equals("autumn"))){
                break;
            } else System.out.println("Invalid imput");
        }

        // Gets name
        System.out.println("Enter your name");
        name = scanner.nextLine();

        // Closes scanner 
        scanner.close();

        // Determines perfect pet
        
    }
}
