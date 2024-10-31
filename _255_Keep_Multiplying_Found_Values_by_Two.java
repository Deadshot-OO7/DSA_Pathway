package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class _255_Keep_Multiplying_Found_Values_by_Two {
    public static void main(String[] args) {
        int[] nums = {5,3,6,1,12};
        int original = 3;

        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num); // Manually adding each element
        }

        while(list.contains(original)){
            original*=2;
        }

    }
}
