package Bitwise_Operators;

import java.util.*;

public class _212_Trailing_Zeroes_Part_Two {
    public static void main(String[] args) {
        int[] nums = {1,2};
        int n = nums.length;    // 3
        List<List<Integer>> results = new ArrayList<>();
        int totalSubsets = 1<<n;    //1<<3 ==> 8

        for (int i = 0; i < totalSubsets; i++) {    //0,1,2,3,4,....7
            int xorResult = 0;
            ArrayList<Integer> subsets = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    xorResult |= nums[j];
                    subsets.add(nums[j]);
                }
            }
            results.add(subsets);
        }

        results.removeIf(ele -> ele.size()==0);

        System.out.println(results);


    }
}
