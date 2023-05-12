import java.util.Random;

public class RockPaperScissors {

    public static void main(String[] args) {

        // Create a new instance of the Random class
        Random random = new Random();

        // Create a list of the possible moves
        String[] moves = {"rock", "paper", "scissors"};
        
        // Get the user's move
        System.out.println("Choose your move: rock, paper, or scissors?");
        String userMove = System.console().readLine();

        // Get the computer's move
        String computerMove = moves[random.nextInt(moves.length)];

        // Display the moves
        System.out.println("You chose " + userMove + ". The computer chose " + computerMove);

        // Determine the winner
        if (userMove.equals(computerMove)) {
            System.out.println("It's a tie!");
        } else if (userMove.equals("rock") && computerMove.equals("scissors")) {
            System.out.println("You win!");
        } else if (userMove.equals("paper") && computerMove.equals("rock")) {
            System.out.println("You win!");
        } else if (userMove.equals("scissors") && computerMove.equals("paper")) {
            System.out.println("You win!");
        } else {
            System.out.println("The computer wins!");
        }
    }
}