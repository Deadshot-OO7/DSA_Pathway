package Loops_in_Java;

public class left_triangle_with_knowledge {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n ; i++) {

            for (int j = 1; j <= n-i ; j++) {
                System.out.print("  ");

            }

            //just for left triangle pattern, if want spacious pattern,
            // then use space in both inner loop for space and star loop
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");

            }

            //if you want pyramid of 1,3,5,7,9 star patter
//            for (int j = 1; j <=2*i-1 ; j++) {
//                System.out.print("* ");
//
//            }

            //if you want pyramid of 1,2,3,4,5-star pattern, then add one extra space in star for loop
//            for (int j = 1; j <=i ; j++) {
//                System.out.print("* ");
//
//            }
            System.out.println();

        }
    }
}
