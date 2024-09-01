package Two_D_Arrays;

public class _65_Diagonal_Traversal {
    public static void main(String[] args) {
        int[][] A = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {

                if(i==j)
                    System.out.println(A[i][j]);
            }
        }
    }
}
