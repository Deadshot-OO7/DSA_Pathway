package Two_D_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _59_Row_Wise_Sorting {
    public static void main(String[] args) {
        int[][] A = {
                {6, 8, 4, 7},
                {5, 0, 1, 1},
                {9, 10, 11, 1},
                {13, 14, 15, 0}
        };

        for (int i = 0; i < A.length; i++) {

            Arrays.sort(A[i]);  //used of sort the 1-D array.
        }

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }

    }
}
