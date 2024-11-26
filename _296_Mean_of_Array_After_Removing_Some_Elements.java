package Sorting;

import java.util.Arrays;

public class _296_Mean_of_Array_After_Removing_Some_Elements {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3};
        Arrays.sort(arr);
        int perc = (int) Math.ceil( arr.length*(0.05));
        double sum = 0.0;
        for(int i = perc; i < arr.length-perc; i++){
            sum+= arr[i];
        }

        System.out.print(sum/(arr.length-2*perc));
    }
}
