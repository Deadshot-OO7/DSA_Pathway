package Two_D_Arrays;

public class _43_Matrix_Multiplication_II{
    public static void main(String[] args) {
        int[][] A = {{3,4},{7,2},{5,9}};
        int[][] B = {{3,1,5},{6,9,7}};

        int n = A.length;
        int m = B[0].length;

        int[][] C = new int[n][m];

        getProduct(A,B);


    }

    public static void getProduct(int[][] A, int[][] B){
        int[][] C = new int[A.length][B[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < A[0].length; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[0].length; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

    }
}
