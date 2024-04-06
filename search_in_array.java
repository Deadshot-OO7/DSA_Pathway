package One_D_Arrays;

import java.util.Scanner;

public class search_in_array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] marks = new int[size];

        //INPUT FROM USER
        for (int i = 0; i < size; i++) {
            marks[i] = sc.nextInt();
        }

        System.out.println("Which number you want to search");
        int n = sc.nextInt();

        //OUTPUT
        for (int i = 0; i < marks.length; i++) {

            if(n==marks[i]) {
                System.out.println("Index is :- " + i);
                return;
            }

        }
        System.out.println("Not found");
    }
}
