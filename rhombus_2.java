package Loops_in_Java;

public class rhombus_2 {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 5; i >=1; i--) {

            //for half pattern
            for (int j = 1; j <= n; j++) {
                if(j>=i)
                    System.out.print("*");
                else
                    System.out.print(" ");

            }

            //for another half pattern
            for (int j = 1; j < i; j++) {
                if(j<=i)
                    System.out.print("*");
                else
                    System.out.print(" ");

            }

            System.out.println();
        }

    }
}
