package Loops_in_Java;

public class hollow_butterfly {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <=2*n ; i++) {

            for (int j = 1; j <=2*n ; j++) {

                if(j == 1 || j == 2*n || j == i || j == 2*n - i + 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();

        }
    }
}
