package Loops_in_Java;

public class right_triangle {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n ; i++) {

            for (int j = 1; j <= i ; j++) {
//                if(i!=n && i>=3 && j!=1 && j!=i)
                if(j==1||i==n||j==i)
                System.out.print("*");

                else
                    System.out.print(" ");

            }
            System.out.println();

        }
    }
}
