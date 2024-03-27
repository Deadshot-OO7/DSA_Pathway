package CodingChallenge;

import java.util.Scanner;

public class tic_tac_toe_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] pos = {' ',' ',' ',' ',' ',' ',' ',' ',' '};
        char turn = 'X';
        int numberOfTurns = 1;
        while (true) {


            System.out.print("Enter the position (1-9) :- ");
            int numPad = sc.nextInt();
            if(numPad>9){
                System.out.println("Position is not between 1 to 9, please try Again");
            }
            else if (pos[numPad - 1] == 'X' || pos[numPad - 1] == 'O')
                System.out.println("Position Already Filled, choose another one.");

            else {
                pos[numPad - 1] = turn;


                System.out.println(" " + pos[0] + " " + "|" + " " + pos[1] + " " + "|" + " " + pos[2] + " ");
                System.out.println("---" + "+" + "---" + "+" + "---");
                System.out.println(" " + pos[3] + " " + "|" + " " + pos[4] + " " + "|" + " " + pos[5] + " ");
                System.out.println("---" + "+" + "---" + "+" + "---");
                System.out.println(" " + pos[6] + " " + "|" + " " + pos[7] + " " + "|" + " " + pos[8] + " ");


                if (pos[0] == turn && pos[1] == turn && pos[2] == turn ||
                        pos[4] == turn && pos[5] == turn && pos[6] == turn ||
                        pos[7] == turn && pos[8] == turn && pos[9] == turn ||
                        pos[0] == turn && pos[3] == turn && pos[6] == turn ||
                        pos[1] == turn && pos[4] == turn && pos[7] == turn ||
                        pos[0] == turn && pos[4] == turn && pos[8] == turn ||
                        pos[2] == turn && pos[4] == turn && pos[6] == turn
                ) {
                    System.out.println("\nTHE WINNER IS :- " + turn);
                    break;
                }

                if (turn == 'X')
                    turn = 'O';
                else
                    turn = 'X';

                numberOfTurns++;

                if (numberOfTurns > 9) {
                    System.out.println(" Match Is DRAW");
                    break;
                }
            }

        }

    }
}
