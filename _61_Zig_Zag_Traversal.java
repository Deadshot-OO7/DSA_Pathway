package Two_D_Arrays;

public class _61_Zig_Zag_Traversal {
    public static void main(String[] args) {
        int[][] A = {
                {1, 2, 3, 5},
                {4, 5, 6, 6},
                {7, 8, 9, 2},
                {10, 11, 12, 1},
                {10, 11, 12, 3}
        };

        int n = A.length;   //4
        int m = A[0].length; //4

        for (int i = 0; i < n+m-1; i++) {

            if(i%2 == 0 && i<= n){
                for (int j = i; j >=0; j--) {
                    System.out.println(A[j][i-j]);
                }
            }

        }



    }
}
