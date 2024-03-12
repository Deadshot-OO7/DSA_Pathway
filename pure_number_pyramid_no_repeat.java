package Loops_in_Java;

public class pure_number_pyramid_no_repeat {
    public static void main(String[] args) {

        int n =5;

        for (int i = 1; i <=n ; i++) {

            //for spaces
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }

            //for numbers
            for (int j = 1; j <=i ; j++) {
               System.out.print(j+" ");
            }

            System.out.println();
        }

        for (int i = n-1; i >= 1 ; i--) {

            //for spaces
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }

            //for numbers
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }

            System.out.println();
        }


    }
}
