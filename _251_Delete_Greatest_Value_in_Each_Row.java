package Sorting;

import java.util.Arrays;

public class _251_Delete_Greatest_Value_in_Each_Row {
    public static void main(String[] args) {
        int[][] grid = {{1,4,2},{3,3,1}};

        int rows = grid.length;
        int cols = grid[0].length;

//        Arrays.sort(grid);

        for(int[] n : grid)
            Arrays.sort(n);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int j = 0; j < cols; j++) {
            int add = 0;
            for (int i = 0; i < rows; i++) {
                if(grid[i][j]>add)
                    add = grid[i][j];
            }
            sum+=add;
        }
        System.out.println(sum);
    }
}
