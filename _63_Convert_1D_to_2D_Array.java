package Two_D_Arrays;

import java.util.Arrays;

public class _63_Convert_1D_to_2D_Array {
    public static void main(String[] args) {
        int m=1,n=1;
        int[] original = {1,2};
        int[][] A = new int[m][n];
        int itr=0;

        if(m*n !=original.length){
            System.out.println(Arrays.deepToString(new int[0][0]));
            return ;
        }

        for(int i =0;i<m;i++){
            for(int j = 0;j<n;j++){
                A[i][j] = original[itr++];
            }
        }

    }
}
