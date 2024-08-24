package DSA_Revision;

public class _19_number_pyramid {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = 4; j >= 0 ; j--) {

                if(i>=j)
                    System.out.print(" "+ (i+1));
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
