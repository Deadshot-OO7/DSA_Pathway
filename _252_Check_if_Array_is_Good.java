package Sorting;

import java.util.Arrays;

public class _252_Check_if_Array_is_Good {
    public static boolean main(String[] args) {
        int[] nums = {1, 3, 3, 2};

        int len = nums.length;

        if(len < 2)
            return false;

        Arrays.sort(nums);
        int base = len-1;
        if(base != nums[len-2] || base != nums[len-1])
            return false;

        boolean isAsc = true;
        int first = 1;

        for (int i = 0; i < base; i++) {
            if(first!=nums[i]){
                isAsc = false;
                return false;
            }
            first++;
        }

        if(isAsc)
            return true;


        return false;
    }
}
