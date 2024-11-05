package Sorting;

import java.util.Arrays;

public class _271_Minimum_Sum_of_Four_Digit_Number_After_Splitting_Digits {
    public static void main(String[] args) {
        int num = 2932;

        // 2 3 4 5 - 25+34 = 59

        int[] arr = new int[4];
        int i = 0;
        while(num>0) {
            arr[i++] = num%10;
            num = num/10;
        }

        for (int n : arr)
            System.out.println(n);

        Arrays.sort(arr);

        int a = 10*arr[0] + arr[3];
        int b = 10*arr[1]+arr[2];

        System.out.println(a+b);
    }
}
