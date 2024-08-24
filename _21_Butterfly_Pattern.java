package DSA_Revision;

public class _21_Butterfly_Pattern {
    public static void main(String[] args) {

        for (int i = 1; i <=4; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= 2*(4-i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 4; i >=1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= 2*(4-i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
//        for (int i = 3; i >= 0 ; i--) {
//
//            for (int j = 0; j <= i; j++) {
//                System.out.print("* ");
//            }
//
//            for (int j = 1; j <=6-2*i ; j++) {
//                System.out.print("  ");
//            }
//
//            for (int j = 0; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
    }
}
