package methods_and_functions;

import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for factorial : - ");
        int n = sc.nextInt();
//        System.out.print("The factorial is - "+fact(n));
        fact(n);
    }

    public static void fact(int n){
        int fact = 1;
        if(n==1 || n==0 ) {
            System.out.println(1);
            return;
        }
        else if (n<0) {
            System.out.println("invalid Number");
            return ;
        }
        else{
            for (int i =  n; i >=1 ; i--) {
                fact = fact*i;
            }
            System.out.println("The factorial is : " + fact);
            return;
        }
    }
}
