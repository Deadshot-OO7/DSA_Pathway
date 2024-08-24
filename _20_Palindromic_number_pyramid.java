package DSA_Revision;

public class _20_Palindromic_number_pyramid {
    public static void main(String[] args) {

        for (int i = 1; i <=5 ; i++) {
            for (int j = 5; j >=1 ; j--) {
                if(i>=j)
                    System.out.print(j);
                else
                    System.out.print(" ");
            }
            for (int j = 2; j <= i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
