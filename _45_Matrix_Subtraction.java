package Two_D_Arrays;

public class _45_Matrix_Subtraction {
    public static void main(String[] args) {
        int[][] A = {{5,8,2}, {4, 1,3}, {3,5,8}};
        int[][] B = {{1,2,3}, {4, 5, 6}, {7, 8, 9}};

        int[][] C = new int[A.length][A[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                C[i][j] = A[i][j]-B[i][j];
            }
        }

        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[0].length; j++) {
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
    }
}
