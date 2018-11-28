import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String decision;

        int score = 0;
        int compscore = 0;
        int drawscore = 0;

        do {
            Scanner scan = new Scanner(System.in);

            System.out.println("Welcome to Rock, Paper, Scissors!");
            System.out.println("Choose your weapon");
            decision = scan.nextLine().toLowerCase();

            while (!(decision.equals("rock") || decision.equals("paper") || decision.equals("scissors") ||
                    decision.equals("no") || decision.equals("nah") || decision.equals("nope"))) {

                do {
                    System.out.println("Does not compute...");
                    System.out.println("Choose your weapon");

                    decision = scan.nextLine().toLowerCase();
                } while (!(decision.equals("rock") || decision.equals("paper") || decision.equals("scissors") ||
                        decision.equals("no") || decision.equals("nah") || decision.equals("nope")));
            }
               /*
               Upon game start-up, if the player types inappropriate words, they will not be able to continue.
               They must type rock, paper, or scissors. ".equals" was a help from Eric Dam
               */




            while(decision.equals("no") || decision.equals("nah") || decision.equals("nope")) {
                do {
                    System.out.println("Come on, at least give it a try!");
                    System.out.println("Choose your weapon");

                    decision = scan.nextLine().toLowerCase();
                } while ((decision.equals("no") || decision.equals("nah") || decision.equals("nope")));
/*
Upon not wishing to play, computer will tell players to attempt a game
*/
                if (decision.equals("rock") || decision.equals("paper") || decision.equals("scissors")) {

                    break;
      /*
      Upon deciding a choice, the loop will stop and the game will continue.
       */
                }

                do {
                    System.out.println("Does not compute...");
                    System.out.println("Choose your weapon");

                    decision = scan.nextLine().toLowerCase();
                } while (!(decision.equals("rock") || decision.equals("paper") || decision.equals("scissors") ||
                        decision.equals("no") || decision.equals("nah") || decision.equals("nope")));
      /*
      If the player still types in inappropriate words, this will loop. Upon refusing to choose, player will be
      directed back to the top of this "while loop" until a decision has been chosen.
      */
            }

            if (decision.equals("rock") || decision.equals("paper") || decision.equals("scissors")) {

                System.out.println("Your weapon is: " + decision);
            }
               /*
                 Upon deciding a choice, the chosen choice will be displayed
                 */

            int random;
            random = ((int) (Math.random() * 3));

          /*
          0 = rock
         1 = paper
          2 = scissors
            */


            if (random == 0) {
                System.out.println(" Your opponent chooses rock ");

                if (decision.equals("rock")) {
                    System.out.println("A Draw Match. \n");
                    drawscore += 1;

                    System.out.println("Wins: " +score + " Loses: " +compscore + " Draws: " +drawscore);

                } else if (decision.equals("paper")) {
                    System.out.println("You win!\n");
                    score += 1;
                    System.out.println("Wins: " +score + " Loses: " +compscore + " Draws: " +drawscore);

                } else if (decision.equals("scissors")) {
                    System.out.println("You lose...\n");
                    compscore += 1;
                    System.out.println("Wins: " +score + " Loses: " +compscore + " Draws: " +drawscore);

                }
                System.out.println();

            }

            if (random == 1) {
                System.out.println(" Your opponent chooses paper ");

                if (decision.equals("rock")) {
                    System.out.println("You lose...\n");
                    compscore += 1;
                    System.out.println("Wins: " +score + " Loses: " +compscore + " Draws: " +drawscore);

                } else if (decision.equals("paper")) {
                    System.out.println("A Draw Match.\n");
                    drawscore += 1;
                    System.out.println("Wins: " +score + " Loses: " +compscore + " Draws: " +drawscore);

                } else if (decision.equals("scissors")) {
                    System.out.println("You win!\n");
                    score += 1;
                    System.out.println("Wins: " +score + " Loses: " +compscore + " Draws: " +drawscore);

                }

            }

            if (random == 2) {
                System.out.println(" Your opponent chooses scissor ");

                if (decision.equals("rock")) {
                    System.out.println("You win!\n");
                    score += 1;
                    System.out.println("Wins: " +score + " Loses: " +compscore + " Draws: " +drawscore);

                } else if (decision.equals("paper")) {
                    System.out.println("You lose...\n");
                    compscore += 1;
                    System.out.println("Wins: " +score + " Loses: " +compscore + " Draws: " +drawscore);

                } else if (decision.equals("scissors")) {
                    System.out.println("A Draw Match.\n");
                    drawscore += 1;
                    System.out.println("Wins: " +score + " Loses: " +compscore + " Draws: " +drawscore);

                }

            }
          /*
           Player's choice compare to computer's choice. Texts will display based on the result of the game.
           */

            do {
                System.out.println("Do you want to try again?");
                decision = scan.nextLine().toLowerCase();
            }while(!(decision.equals("yes") || decision.equals("no")));

            if (decision.equals("no")) {
                System.out.println("Goodbye, thanks for trying!");
            }

        }while(decision.equals("yes"));
        /*
          If yes, game restart. If no, program stops and is finished.
          */

    }

}



