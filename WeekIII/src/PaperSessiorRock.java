import java.util.Scanner;

public class PaperSessiorRock {
    public static void main(String[] args) {
        /*
        Write a Java program that imitates the two players game “Scissors-Paper-Rock”.
        As an input use ‘sc’ for scissors, ‘pp’ for paper and ‘rc’ for rock.
         */
        Scanner src = new Scanner(System.in);
        System.out.println("Player1: ");
        String player1 = src.nextLine();
        System.out.println("Player2: ");
        String player2 = src.nextLine();
        if (player1.equals("sc") && player2.equals("pp")){
            System.out.println("Winner is Player1");
        }
        else if(player1.equals(player2)){
            System.out.println("Draw");
        }else if(player1.equals("pp")&&player2.equals("sc")){
            System.out.println("Winner is Player2");
        }else if(player1.equals("pp")&&player2.equals("rc")){
            System.out.println("Winner is Player1");
        }else if(player1.equals("rc")&&player2.equals("sc")){
            System.out.println("Winner is Player1");
        }else if(player1.equals("rc")&&player2.equals("pp")){
            System.out.println("Winner is Player2");
        }else if(player1.equals("sc")&&player2.equals("rc")){
            System.out.println("Winner is Player2");
        }
    }
}
