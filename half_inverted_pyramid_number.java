package Loops_in_Java;

public class half_inverted_pyramid_number {
    public static void main(String[] args) {

        int n = 5;

        for (int i = n; i >= 1 ; i--) {

            for (int j = 1; j <=i ; j++) {
                System.out.print(n-i+1+" ");
            }
            System.out.println();
        }
    }
}
