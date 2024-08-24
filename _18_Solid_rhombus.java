package DSA_Revision;

public class _18_Solid_rhombus {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = 4; j >= 0 ; j--) {
                if(i>=j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            for (int j = 4-i ; j >=1 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
