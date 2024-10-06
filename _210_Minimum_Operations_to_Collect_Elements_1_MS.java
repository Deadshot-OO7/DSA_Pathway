package Bitwise_Operators;

import java.util.ArrayList;

public class _210_Minimum_Operations_to_Collect_Elements_1_MS {
    public static void main(String[] args) {

        int[] a ={1,2,2};
        int k = 2;
        int[] counter = new int[k+1];

        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            nums.add(a[i]);
        }

        int count = 0;
        int itr = 0;
        while (nums.size()!=0){
            int last = nums.getLast();
            if(last<=k && counter[last]==0){
                count++;            //covering 1,2....k
                counter[last]++;    //visited
            }
            itr++;
            if(count==k)
                break;
            nums.removeLast();
        }
        System.out.println(itr);
    }
}
