import java.util.Random;
import java.util.Scanner;

public class RPSgame {
    public static void main(String[] args) {
        String[] rps = { "r", "p", "s" };
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String computerMove = rps[random.nextInt(rps.length)];
            String playerMove;

            while (true) {
                System.out.println("Please enter your move (r, p, or s). To exit the game, type exit.");
                playerMove = scanner.nextLine();
                if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
                    break;
                }
                if (playerMove.equals("exit")) {
                    System.out.println("Thanks for playing!");
                    return;
                }
                System.out.println(playerMove + " is not a valid move, please enter r, p, or s.");
            }

            System.out.println("Computer move: " + computerMove);

            if (playerMove.equals(computerMove)) {
                System.out.println("It's a tie!");
            } else if (playerMove.equals("r") && computerMove.equals("s") ||
                    playerMove.equals("p") && computerMove.equals("r") ||
                    playerMove.equals("s") && computerMove.equals("p")) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }
        }
    }
}
