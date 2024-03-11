package Loops_in_Java;

public class P_0_1_Triangle {
    public static void main(String[] args) {

        int r =5;
        int c = 5;

        for (int i = 0; i < r;  i++) {
            for (int j = 0; j <=i; j++) {
               if((i+j)%2==0)
                   System.out.print(1+" ");
               else
                   System.out.print(0+" ");

            }
            System.out.println();

        }
    }
}
