package Two_D_Arrays;

public class _42_Matrix_Multiplication_I {
    public static void main(String[] args) {

        int[][] A = {{3,4},{7,2},{5,9}};
        int[][] B = {{3,1,5},{6,9,7}};

        int n = A.length;
        int m = B[0].length;

        int[][] C = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                C[i][j] = getProduct(A,B,i,j);
            }
        }

        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[0].length; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }


    }

    public static int getProduct(int[][] A, int[][] B,int i, int j){
        int C = 0;

        for (int m = 0; m < A[0].length; m++) {
            C+= A[i][m] * B[m][j];
        }

        return C ;
    }
}
