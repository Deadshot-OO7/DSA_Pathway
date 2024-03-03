package Loops_in_Java;

import java.util.Scanner;

public class solid_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 4;
        int j = 5;

        for (int k = 0; k < i; k++) {
            for (int l = 0; l < j; l++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }
    }
}
