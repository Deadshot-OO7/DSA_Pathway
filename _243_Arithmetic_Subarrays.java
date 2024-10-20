package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    // Method to check if subarrays are arithmetic sequences
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        // List to store the results (true/false) for each subarray
        List<Boolean> ans = new ArrayList<>();
        // Get the number of subarrays to check
        int len = l.length;
        // Initialize index to track the current subarray
        int index = -1;

        // Loop through each subarray
        while(len-- > 0){
            index++; // Move to the next subarray
            // Create a new subarray from nums using indices l[index] to r[index]
            int[] list = new int[r[index] - l[index] + 1];

            // Fill the subarray with values from nums
            int itr = 0;
            for (int i = l[index]; i <= r[index]; i++) {
                list[itr++] = nums[i]; // Copy values into the list
            }

            // Sort the subarray to check for arithmetic sequence
            Arrays.sort(list);

            // Calculate the common difference between the first two elements
            int diff = list[1] - list[0];
            // Flag to track if the current subarray is an arithmetic sequence
            boolean isSeq = true;

            // Check if all consecutive elements have the same difference
            for (int i = 0; i < list.length - 1; i++) {
                // If any consecutive pair doesn't have the same difference
                if(diff != (list[i + 1] - list[i])){
                    ans.add(false); // Add false to the result list
                    isSeq = false; // Mark this subarray as not an arithmetic sequence
                    break; // Stop further checking for this subarray
                }
            }

            // If all pairs have the same difference, mark the subarray as arithmetic
            if(isSeq)
                ans.add(true);
        }

        // Return the list of results for each subarray
        return ans;
    }
}
