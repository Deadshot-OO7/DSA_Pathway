package Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class _245_Sort_Even_and_Odd_Indices_Independently {
    public static void main(String[] args) {
        int[] nums = {4,1,2,3};

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if(i%2==0)
                even.add(nums[i]);
            else
                odd.add(nums[i]);
        }

        Collections.sort(even);
        Collections.sort(odd,(a,b)->b-a);

        System.out.println(even);
        System.out.println(odd);

        int itr = 0;
        int len = even.size() + odd.size();

        for (int i = 0; i < len; i++) {
            if(i%2==0) {
                nums[i] = even.getFirst();
                even.removeFirst();
            }else{
                nums[i]= odd.getFirst();
                odd.removeFirst();
            }
        }

    }
}
