package Two_D_Arrays;
/*
* Input: mat = [[1,2],[3,4]], r = 1, c = 4
Output: [[1,2,3,4]]
*
* Input: mat = [[1,2],[3,4]], r = 2, c = 4
Output: [[1,2],[3,4]]
* */
public class _89_Reshape_the_Matrix {
    public static int[][] main(String[] args) {
        //Input
        int[][] mat = {{1,2},{3,4}};
        int r =2,c=2;

        int m = mat.length;
        int n = mat[0].length;

        if(m*n != r*c)
            return mat;

        int[] A = new int[r*c];
        int itr=0;
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n;j++){
                A[itr++]=mat[i][j];
            }
        }
        itr=0;
        int[][] B = new int[r][c];
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c;j++){
                B[i][j]=A[itr++];
            }
        }
        return B;
    }
}
