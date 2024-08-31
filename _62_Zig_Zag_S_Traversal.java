package Two_D_Arrays;

public class _62_Zig_Zag_S_Traversal {
    public static void main(String[] args) {
        int[][] A = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        int n = A.length;   //4
        int m = A[0].length; //4

        for (int i = 0; i < n; i++) {

            if(i%2==0)
                for (int j = 0; j < A[0].length; j++) {
                    System.out.println(A[i][j]);
                }
            else
                for (int j = m-1; j >=0 ; j--) {
                    System.out.println(A[i][j]);
                }
        }
    }
}
