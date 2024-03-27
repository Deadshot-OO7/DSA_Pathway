package CodingChallenge;

public class tic_tac_toe_design {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 11;

        for (int i = 1; i<= rows ; i++) {

            for (int j = 1; j <= cols ; j++) {

                if(j==4 || j==8)
                    System.out.print(("|"));
                else {
                    if (i == 1 || i == rows)
                        System.out.print(" ");
                    else
                        System.out.print("-");
                }

            }
            System.out.println();

        }
    }
}

/*
   |   |
---|---|---
---|---|---
   |   |
*/

