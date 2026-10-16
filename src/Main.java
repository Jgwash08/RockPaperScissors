import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //declarations
        String playerA = "";
        String playerB = "";
        Scanner in = new Scanner(System.in);

        // Player A move print
        System.out.print("Player A, Enter your move Rock(R) Paper(P) Scissors(S)");
        playerA = in.nextLine();

        // Player A move program
        if (!playerA.equalsIgnoreCase("R") && !playerA.equalsIgnoreCase("P") && !playerA.equalsIgnoreCase("S")) {
            System.out.println("Invalid move for Player A, must be R, P, or S.");
            System.exit(0);
        }
        // Player B move print
        System.out.print("Player B, Enter your move Rock(R) Paper(P) Scissors(S)");
        playerB = in.nextLine();

        // Player B move program
        if (!playerB.equalsIgnoreCase("R") && !playerB.equalsIgnoreCase("P") && !playerB.equalsIgnoreCase("S")) {
            System.out.println("Invalid move for Player B, must be R, P, or S.");
            System.exit(0);
        }
        // Game Logic
        if (playerA.equalsIgnoreCase(playerB))
        {
            if (playerA.equalsIgnoreCase("R"))
            {
                System.out.println("Rock vs Rock, It's a Tie");
            }
            else if (playerA.equalsIgnoreCase("P"))
            {
                System.out.println("Paper vs Paper, It's a Tie");
            }
            else {
                System.out.println("Scissors vs Scissors, It's a Tie");
            }
        }
        else if (playerA.equalsIgnoreCase("R"))
        {
            if (playerB.equalsIgnoreCase("S"))
            {
                System.out.println("Rock breaks Scissors, Player A wins");
            }
            else
            {
                System.out.println("Paper covers Rock, Player B wins");
            }
        }
        else if (playerA.equalsIgnoreCase("P"))
        {
            if (playerB.equalsIgnoreCase("R"))
            {
                System.out.println("Paper covers Rock, Player A wins");
            }
            else {
                System.out.println("Scissors cuts Paper, Player B wins");
            }
        }
        else if (playerA.equalsIgnoreCase("S"))
        {
            if (playerB.equalsIgnoreCase("P"))
            {
                System.out.println("Scissors cuts Paper, Player A wins");
            } else
            {
                System.out.println("Rock breaks Scissors, Player B wins");
            }
        }
    }
}