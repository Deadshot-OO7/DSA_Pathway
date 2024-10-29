package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
//agar decimals me value store krni hai toh double data type use kro
//agar numbers int h toh (a+b)/2.0 krke iska result kisi double data type
// me store krdo.
public class _253_Number_of_Distinct_Averages {
    public static void main(String[] args) {
        int[] nums = {9,5,7,8,7,9,8,2,0,7};
        Arrays.sort(nums);

        Set<Double> avg = new HashSet<>();
        int i = 0;
        int j = nums.length-1;
        while(i<j){
            int minNumber = nums[i];
            int maxNumber = nums[j];

            double average = (maxNumber+minNumber)/2.0;

            avg.add(average);
            i++;
            j--;
        }
        System.out.println(avg.size());
    }
}
