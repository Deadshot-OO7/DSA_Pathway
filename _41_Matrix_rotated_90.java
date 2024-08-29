package Two_D_Arrays;

public class _41_Matrix_rotated_90 {
    public static void main(String[] args) {

        int[][] input = {{6,3,2,4},{8,9,1,6},{5,4,8,9}};

        int n = input.length;
        int m = input[0].length;

        int[][] op = new int[m][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                op[j][n-i-1] = input[i][j];
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(op[i][j]+" ");
            }
            System.out.println();
        }

        // assigning j index of input to i index for output
        // so we get i index for output
        // for output j index, j = n-i-1. this is pattern hidden over there.
    }
}
