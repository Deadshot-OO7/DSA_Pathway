package Two_D_Arrays;

public class _55_Matrix_Border_zero {
    public static void main(String[] args) {
        int[][] A = {
                {3, 8, 4,5},
                {1, 9, 11,7},
                {12, 7, 6,9}
        };

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if(i==0 || i==A.length-1 || j == 0 || j == A[0].length-1)
                    A[i][j] = 0;
            }
        }

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
}
