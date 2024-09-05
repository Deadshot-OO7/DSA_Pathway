package Two_D_Arrays;

public class _76_Matrix_Rotation_Anti_Clockwise {
    public static void main(String[] args) {

        int[][] A = {
                {1, 2,5, 3},
                {4, 5,6, 6},
                {7, 8,7, 9},
                {10, 11,3, 12}
        };

        int n = A.length;

        int[][] B = new int[A[0].length][A.length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {

                B[n-j-1][i] = A[i][j];

            }

        }

        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }
    }
}
