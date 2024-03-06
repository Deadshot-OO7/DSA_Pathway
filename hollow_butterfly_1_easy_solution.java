package Loops_in_Java;

public class hollow_butterfly_1_easy_solution {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n ; i++) {

            for (int j = 1; j <=2*n-1 ; j++) {
                if(j==1||j==2*n-1||i==j||i+j==2*n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        for (int i = n-1; i >= 1 ; i--) {

            for (int j = 1; j <=2*n-1 ; j++) {
                if(j==1||j==2*n-1||i==j||i+j==2*n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
//7 spaces ---- i=1, n = 5