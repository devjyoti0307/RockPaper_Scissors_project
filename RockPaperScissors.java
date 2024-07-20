import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        String[] choices = {"rock", "paper", "scissors"};
        
        System.out.println("Let's play Rock, Paper, Scissors!");
        System.out.println("Enter your choice (rock, paper, or scissors):");
        String userChoice = scanner.nextLine().toLowerCase();
        
        int computerIndex = random.nextInt(3);
        String computerChoice = choices[computerIndex];
        
        System.out.println("Computer chose: " + computerChoice);
        
        // Determine the winner
        if (userChoice.equals(computerChoice)) {
            System.out.println("It's a tie!");
        } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                   (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                   (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
        
        scanner.close();
    }
}