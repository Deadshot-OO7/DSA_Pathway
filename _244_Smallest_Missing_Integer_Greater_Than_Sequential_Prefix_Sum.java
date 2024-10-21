package Sorting;

import java.util.Arrays;

public class _244_Smallest_Missing_Integer_Greater_Than_Sequential_Prefix_Sum {
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,12,14,13};

        Arrays.sort(nums);

        for (int n : nums)
            System.out.print(n+" ");

        int contSum = nums[0];
        int maxSum = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]+1==nums[i+1]){
                contSum+=nums[i];
            }else{
                if(i!=0 && nums[i]-1==nums[i-1])
                    contSum+=nums[i];
                if(contSum>maxSum)
                    maxSum = contSum;
                contSum = 0;
            }
        }
        System.out.println(maxSum);
    }
}
