package Two_D_Arrays;
//A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same elements.
public class _90_Toeplitz_Matrix {
    public static void main(String[] args) {
        int[][] A = {
                {1,2,3,4},
                {5,1,2,3},
                {9,5,1,2}
        };
        int n = A[0][0];
        for(int i = 0; i < A.length-1; i++){
            for(int j = 0; j < A[0].length-1; j++){
                if(A[i][j] !=A[i+1][j+1] )
                    System.out.println(false);
                break;
            }
        }
        System.out.println(true);
    }



}
