package Loops_in_Java;

public class hollow_Triangle_Upper_Part {
    public static void main(String[] args) {

        int n = 5;

        for (int i = n; i <=n ; i++) {

            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1 ; j++) {
                if(j==1||j==2*i-1||i==n)
                System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
}
