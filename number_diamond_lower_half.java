package Loops_in_Java;

public class number_diamond_lower_half {
    public static void main(String[] args) {

        int n = 5;

        for (int i = n; i >= 1; i--) {

            //for spaces
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }

            //for numbers
            for (int j = 1; j <=i ; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
