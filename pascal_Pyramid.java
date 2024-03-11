package Loops_in_Java;

public class pascal_Pyramid {
    public static void main(String[] args) {

        int n = 5;
        int sum;
        for (int i = 0; i < n  ; i++) {

            for (int j = 0; j <n-i ; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j<=i ; j++) {
                    System.out.print(pascal_Pyramid.coff(i, j) + " ");
            }

            System.out.println();
        }
    }

     static int coff(int n, int r){
        int c = 1;
        c= factorial(n)/(factorial(r)*factorial(n-r));
        return  c;
    }

    static int factorial(int n){
        int fact = 1;

        for (int i = n; i >= 1 ; i--) {
            fact = fact * i;

        }

        return fact;
    }
}
