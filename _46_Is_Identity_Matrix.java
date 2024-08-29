package Two_D_Arrays;

public class _46_Is_Identity_Matrix {
    public static void main(String[] args) {

        int[][] A = {{1,0,0},{0,1,0},{0,0,1}};
        boolean isIdentityMatrix = true;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {

                if(i==j) {
                    if (A[i][j] != 1) {
                        System.out.println("Not Identity Matrix");
                        isIdentityMatrix = false;
                        break;
                    }
                }
                else{
                    if(A[i][j]!=0){
                        System.out.println("Not Identity Matrix");
                        isIdentityMatrix = false;
                        break;
                    }
                }
            }
        }
        if(isIdentityMatrix)
            System.out.println("It is an Identity Matrix");
    }
}
