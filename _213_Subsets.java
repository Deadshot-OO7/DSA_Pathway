package Bitwise_Operators;

import java.util.ArrayList;
import java.util.List;

public class _213_Subsets {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int n = nums.length;    // 3
        List<List<Integer>> results = new ArrayList<>();
        int totalSubsets = 1<<n;    //1<<3 ==> 8

        for (int i = 0; i < totalSubsets; i++) {    //0,1,2,3,4,....7
            ArrayList<Integer> subsets = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if((i & (1<<j))!=0){
                    subsets.add(nums[j]);
                }
            }
            results.add(subsets);
        }

        results.removeIf(ele -> ele.size()==0);

        System.out.println(results);
    }
}
