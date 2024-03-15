package Loops_in_Java;

public class right_downward_triangle {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n ; i++) {

            for (int j = 1; j <=n-i+1 ; j++) {
                    System.out.print("* ");
            }
            System.out.println();

        }
    }
}
