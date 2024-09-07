package Strings;

import java.util.Scanner;

public class _91_Syntax {
    public static void main(String[] args) {
        String name="Tony";
        String fullName = "Tony Stark";
        Scanner sc = new Scanner(System.in);
        /*
        * next() --> for single word input ==> sc.next()
        * nextLine() --> takes full input till we press Enter
        * */

        // Read the first name
        System.out.print("Enter your first name: ");
         name = sc.next(); // Reads the first name

        // Consume the leftover newline character
        sc.nextLine(); // This will consume the newline character after the next()

        // Read the full name
        System.out.print("Enter your full name: ");
         fullName = sc.nextLine(); // Reads the full line

        System.out.println("1"+name);
        System.out.println("2"+fullName);
    }
}
