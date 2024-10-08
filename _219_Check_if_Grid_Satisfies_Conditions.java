package Two_D_Arrays;
/*
* You are given a 2D matrix grid of size m x n. You need to check if each cell grid[i][j] is:

Equal to the cell below it, i.e. grid[i][j] == grid[i + 1][j] (if it exists).
Different from the cell to its right, i.e. grid[i][j] != grid[i][j + 1] (if it exists).
Return true if all the cells satisfy these conditions, otherwise, return false.
* */
public class _219_Check_if_Grid_Satisfies_Conditions {
    public static boolean main(String[] args) {
        int[][] grid = {{1,0,2},{1,0,2}};
        for( int i = 0; i<grid.length;i++){
            for(int j = 0; j < grid[0].length-1;j++){

                if(grid[i][j] == grid[i][j + 1])
                    return false;
            }
        }
        for( int i = 0; i<grid.length-1;i++){
            for(int j = 0; j < grid[0].length;j++){
                if(grid[i][j]!=grid[i+1][j])
                    return false;
            }
        }
        return true;
    }
}
