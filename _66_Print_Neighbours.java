package Two_D_Arrays;

public class _66_Print_Neighbours {
    public static void main(String[] args) {

        int[][] A = {
                {1, 2,5, 3},
                {4, 5,6, 6},
                {7, 8,7, 9},
                {10, 11,3, 12}
        };

        int[][] dir = {
                {0,1},
                {0,-1},
                {1,0},
                {-1,0},
                {1,1},
                {1,-1},
                {-1,1},
                {-1,-1}
        };


        int m = A.length;
        int n = A[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print("Neighbors of " + A[i][j] + " - ");

                for (int k = 0; k < dir.length; k++) {
                    int row = i + dir[k][0];
                    int col = j + dir[k][1];

                    if(row>=0 && row<m && col >=0 && col < n){
                        System.out.print(A[row][col] + " ");
                    }
                }
                System.out.println();

            }
        }


    }
}
