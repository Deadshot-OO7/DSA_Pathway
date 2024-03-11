package Loops_in_Java;

public class number_diamond {
    public static void main(String[] args) {

        int n =5;
        int p = 1;
        for (int i = 1; i <= n ; i++) {

            p = 1;

            for (int j = 1; j <= 2*n ; j++) {

                if((i+j)%2==0 && j>=i && j<=2*(n-i+1)) {
                    System.out.print(p);
                p++;
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
