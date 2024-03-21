package methods_and_functions;

import java.util.Scanner;

public class printingName {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.next();
        printName(name);
    }

    public static void printName(String name){
        System.out.println("Your name is : "+name);
        return;
    }
}
