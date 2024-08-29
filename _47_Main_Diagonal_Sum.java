package Two_D_Arrays;

public class _47_Main_Diagonal_Sum {
    public static void main(String[] args) {
        int[][] A = {{5,8,2}, {4, 1,3}, {3,5,8}};
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if(i==j){
                    sum+=A[i][j];
                }
            }
        }

        System.out.println("The main diagonal sum is " + sum);
    }
}
