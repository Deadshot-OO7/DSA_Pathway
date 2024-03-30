package One_D_Arrays;

import java.util.Scanner;

public class array_size_from_user {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] marks = new int[size];

        //INPUT FROM USER
        for (int i = 0; i < size; i++) {
            marks[i] = sc.nextInt();

        }

        //OUTPUT
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);

        }
    }
}

// By Default

//Variable Initialization Value for -
//int = 0;
//boolean = false;
//float = 0.0;
//integer array = all 0
// String = ""; empty string

// BIG ADVANTAGE OF JAVA OVER CPP - AUTOMATICALLY INITIALIZE TO 0, BUT NOT IN CASE WITH CPP
// IN CPP, SOME GARBAGE VALUE STORES IN MEMORY, WHICH IS OF COMPLETELY NON-SENSE.