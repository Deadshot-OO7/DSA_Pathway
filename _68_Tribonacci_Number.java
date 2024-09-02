package One_D_Arrays;

import java.util.Scanner;

public class _68_Tribonacci_Number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] F = new int[38];
        F[0] = 0;
        F[1]=1;
        F[2]=1;

        for(int i = 3; i<38;i++){
            F[i] = F[i-1]+F[i-2]+F[i-3];
        }

        System.out.println(F[n]);
    }
}
