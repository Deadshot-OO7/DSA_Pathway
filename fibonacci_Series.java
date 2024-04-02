package One_D_Arrays;

import java.util.Scanner;

public class fibonacci_Series {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size for series");
        int size = sc.nextInt();

        int[] fibo = new int[size];
        fibo[0]=0;
        fibo[1]=1;

        for (int i = 2; i < size; i++) {
            fibo[i] = fibo[i-1]+fibo[i-2];
        }

        for (int i = 0; i < size; i++) {
            System.out.println(fibo[i]);
        }

    }
}
