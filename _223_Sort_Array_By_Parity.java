package Sorting;

import java.util.ArrayList;

public class _223_Sort_Array_By_Parity {
    public static int[] main(String[] args) {
        int[] nums = {3,1,2,4};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int n = nums[i];
            if(n % 2 == 0)
                list.add(n);
        }

        for(int i = 0; i < nums.length; i++){
            int n = nums[i];
            if(n % 2 != 0)
                list.add(n);
        }

        int itr = 0;
        for(int i = 0; i < list.size(); i++){
            int n = list.get(i);
            nums[itr++] = n;
        }
        return nums;
    }
}
