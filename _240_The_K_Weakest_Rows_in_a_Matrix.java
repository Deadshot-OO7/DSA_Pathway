package Sorting;
import java.util.Arrays;
/*
* You are given an m x n binary matrix mat of 1's (representing soldiers) and 0's (representing civilians). The soldiers are positioned in front of the civilians. That is, all the 1's will appear to the left of all the 0's in each row.

A row i is weaker than a row j if one of the following is true:

The number of soldiers in row i is less than the number of soldiers in row j.
Both rows have the same number of soldiers and i < j.
Return the indices of the k weakest rows in the matrix ordered from weakest to strongest.

Example 1:

Input: mat =
[[1,1,0,0,0],
 [1,1,1,1,0],
 [1,0,0,0,0],
 [1,1,0,0,0],
 [1,1,1,1,1]],
k = 3
Output: [2,0,3]
Explanation:
The number of soldiers in each row is:
- Row 0: 2
- Row 1: 4
- Row 2: 1
- Row 3: 2
- Row 4: 5
The rows ordered from weakest to strongest are [2,0,3,1,4].
Example 2:

Input: mat =
[[1,0,0,0],
 [1,1,1,1],
 [1,0,0,0],
 [1,0,0,0]],
k = 2
Output: [0,2]
Explanation:
The number of soldiers in each row is:
- Row 0: 1
- Row 1: 4
- Row 2: 1
- Row 3: 1
The rows ordered from weakest to strongest are [0,2,3,1].
*
* */
public class _240_The_K_Weakest_Rows_in_a_Matrix {
    public static int[] main(String[] args) {
        int[][] mat = {{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}};
        int k = 3;
        // Initialize the result array to store the indices of the k weakest rows
        int[] ans = new int[k];

        // Create a 2D array 'map' to store the index of the row and the count of 1's in that row
        int[][] map = new int[mat.length][2];

        // Iterate through each row of the matrix
        for (int i = 0; i < mat.length; i++) {
            int countOne = 0; // Variable to count the number of soldiers (1's) in the row

            // Iterate through each column (element) in the current row
            for (int j = 0; j < mat[0].length; j++) {
                // Count the number of soldiers (1's) in the row
                if(mat[i][j] == 1)
                    countOne++;
            }

            // Store the row index and the number of soldiers in the 'map' array
            map[i][0] = i;       // Store the row index
            map[i][1] = countOne; // Store the number of soldiers (1's) in the row
        }

        // Sort the 'map' array based on the count of soldiers in ascending order
        // If two rows have the same number of soldiers, they will retain their original order
        Arrays.sort(map, (a, b) -> a[1] - b[1]); // Custom comparator to sort by the second element (soldier count)

        int itr = 0; // Iterator to track how many weakest rows have been added to the result array

        // Iterate through the sorted 'map' array
        for (int i = 0; i < map.length; i++) {
            // Add the index of the row to the result array if we haven't reached 'k' weakest rows yet
            if(itr < k)
                ans[itr++] = map[i][0]; // Add the row index to the result array and increment the iterator
            else
                return ans; // Return the result once we've added 'k' rows
        }

        // Return the final result array containing the indices of the k weakest rows
        return ans;
    }
}
