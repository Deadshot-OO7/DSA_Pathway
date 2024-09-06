package Two_D_Arrays;

import java.util.ArrayList;
import java.util.Collections;

//Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
public class _86_Squares_of_a_Sorted_Array {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]*nums[i]);
        }

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            nums[i]= list.get(i);
        }


    }
}
