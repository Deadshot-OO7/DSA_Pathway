package One_D_Arrays;

import java.util.Scanner;
//Design a function void print( ) with a single dimensional array x[ ] and n (as size of the array) as function arguments.
// The function calculates sum of only single digit and sum of only double digit elements from the array.
// Design a main() function to input size of the array ‘len' and single dimensional array of size 'len',
// and print the required result by invoking the function print( ).
public class sum_of_Single_and_double_digit_array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        print(arr,size);
    }

    public static void print(int[] arr, int size){
        int sumOfSingleDigit = 0, sumOfDoubleDigit = 0;

        for (int i = 0; i < size; i++) {

            if(arr[i]/10 > 0 && arr[i]/100 == 0)    //( x[ v] >= 10 && x[ v] <= 99)
                sumOfDoubleDigit = sumOfDoubleDigit + arr[i];

            else if (arr[i]/10==0)                  //if( x[ v] >0 && x[ v] <= 9)
                sumOfSingleDigit = sumOfSingleDigit + arr[i];
        }

        System.out.println("Sum of Double digit :- " + sumOfDoubleDigit);
        System.out.println("Sum of Single digit :- " + sumOfSingleDigit);

    }
}
