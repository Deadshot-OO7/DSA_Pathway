package Two_D_Arrays;

public class _53_Symmetric_Matrix {
    public static void main(String[] args) {

        int[][] A = {
                {0, 2, 3},
                {2, 6, 9},
                {3, 7, 12}
        };

        int[][] T = new int[A[0].length][A.length];

        //Transpose of A
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                T[j][i] = A[i][j];
            }
        }

        //Print T
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T[0].length; j++) {
                System.out.print( T[i][j]+" ");
            }
            System.out.println();
        }

        boolean isSymmetric = true;

        if(A.length != A[0].length) {
            isSymmetric = false;
            System.out.println("Not Symmetric Matrix");
        }
        else {
            for (int i = 0; i <A.length; i++) {
                for (int j = 0; j < A[0].length; j++) {
                    if(A[i][j] != T[i][j]){
                        System.out.println("Not Symmetric Matrix");
                        isSymmetric = false;
                    }
                }
            }
        }

        if(isSymmetric)
            System.out.println("It is symmetric Matrix");
    }
}
