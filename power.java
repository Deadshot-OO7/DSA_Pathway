//Two numbers are entered by the user, x and n.
// Write a function to find the value of one number raised to the power of another i.e. xn.
package methods_and_functions;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Base and power resp. : ");
        int base = sc.nextInt();
        int power = sc.nextInt();
        int res = powerCalc(base,power);

        System.out.println("The power is : - "+ res);
    }

    public static int powerCalc(int base, int power){
        int res = 1;
        for (int i = 1; i <=power ; i++) {
             res = res * base;
        }
        return  res;
    }
}
