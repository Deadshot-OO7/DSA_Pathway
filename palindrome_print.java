package One_D_Arrays;

import java.util.Scanner;

public class palindrome_print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {

            int num = arr[i];
            int reverseNumber = 0;
            while (num!=0){
                int lastDigit = num%10;
                num = num / 10;
                reverseNumber = 10*reverseNumber + lastDigit;
            }

            if(reverseNumber == arr[i])
                System.out.println(arr[i] + " Is a palindrome number");
        }
    }
}
