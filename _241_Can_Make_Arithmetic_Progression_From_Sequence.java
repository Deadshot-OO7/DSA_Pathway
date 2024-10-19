package Sorting;

import java.util.Arrays;

public class _241_Can_Make_Arithmetic_Progression_From_Sequence {
    public static void main(String[] args) {
        int[] arr = {3,5,1};
        Arrays.sort(arr);

        int diff = arr[1]-arr[0];

        for (int i = 1; i < arr.length-1 ; i++) {
            if(diff!=(arr[i+1]-arr[i]))
                return false;
        }
        return true;
    }
}
