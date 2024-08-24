package DSA_Revision;

public class _22_diamond_pattern {
    public static void main(String[] args) {

        int n = 4;

        for (int i = 1; i <= n ; i++) {

            for (int j = n; j >=1 ; j--) {
                if(i>=j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            for (int j = 1; j <= i-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = n; i >=1 ; i--) {

            for (int j = n; j >=1 ; j--) {
                if(i>=j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            for (int j = 1; j <= i-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
