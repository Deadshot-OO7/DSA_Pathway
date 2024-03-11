package Loops_in_Java;

public class number_mirror_pyramid {
    public static void main(String[] args) {

        int n = 5;

        for (int i = n; i >=1 ; i--) {

            for (int j = 1; j <=n ; j++) {
                if(j>=i)
                    System.out.print(n-j+1);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
