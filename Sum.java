package methods_and_functions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers for sum :-");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("The sum is : " + calculateSum(a,b));
    }

    public static int calculateSum(int a , int b){
        return a+b;
    }
}
