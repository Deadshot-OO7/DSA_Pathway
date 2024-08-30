package Two_D_Arrays;

public class _49_Spiral_Order_2D_Array {
    public static void main(String[] args) {
        int[][] A = {
                {1, 2, 3},
                {5, 6, 7},
                {9, 10, 11},
                {13, 14, 15}
        };

        int row_start = 0;
        int col_start = 0;
        int row_end = A.length - 1;
        int col_end = A[0].length - 1;

        while (row_start <= row_end && col_start <= col_end) {

            if (A.length == 1) {
                for (int i = 0; i < A[0].length; i++) {
                    System.out.println(A[0][i]);
                }
                return;
            }
            if (A[0].length == 1) {
                for (int i = 0; i < A.length; i++) {
                    System.out.println(A[i][0]);
                }
                return;
            }

            for (int i = col_start; i <= col_end; i++) {
                System.out.print(A[row_start][i] + " ");
            }

            row_start++;

            for (int i = row_start; i <= row_end; i++) {
                System.out.print(A[i][col_end] + " ");
            }

            col_end--;

            if(row_start <= row_end) {
                for (int i = col_end; i >= col_start; i--) {
                    System.out.print(A[row_end][i] + " ");
                }
            }

            row_end--;

            if(col_start<=col_end) {
                for (int i = row_end; i >= row_start; i--) {
                    System.out.print(A[i][col_start] + " ");
                }
            }
            col_start++;

        }
        System.out.println();
        printSpiral(A);
        ;
    }

    public static void printSpiral(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;

        int top = 0, bottom = rows - 1;
        int left = 0, right = cols - 1;

        while (top <= bottom && left <= right) {
            // Traverse the top row (left to right)
            for (int i = left; i <= right; i++) {
                System.out.print(arr[top][i] + " ");
            }
            top++;  // Move the top boundary down

            // Traverse the right column (top to bottom)
            for (int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right] + " ");
            }
            right--;  // Move the right boundary left

            // Traverse the bottom row (right to left)
            if (top <= bottom) {  // Check to avoid overlap
                for (int i = right; i >= left; i--) {
                    System.out.print(arr[bottom][i] + " ");
                }
                bottom--;  // Move the bottom boundary up
            }

            // Traverse the left column (bottom to top)
            if (left <= right) {  // Check to avoid overlap
                for (int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left] + " ");
                }
                left++;  // Move the left boundary right
            }
        }
    }
}
