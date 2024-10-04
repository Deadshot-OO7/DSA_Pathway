package Bitwise_Operators;

import java.util.ArrayList;

public class _205_Set_Mismatch {
    public static int[] main(String[] args) {
        int[] nums = {8,7,3,5,3,6,1,4};
        int len = nums.length;
        int[] ans = new int[2];
        int[] arr = new int[nums.length+1];

        for(int i = 0; i < len ; i++){
            arr[nums[i]]++;
        }

        for(int i = 1; i<arr.length;i++){
            if(arr[i]==2) ans[0]=i;
            if(arr[i]==0) ans[1]=i;
        }
        return ans;

    }
}
