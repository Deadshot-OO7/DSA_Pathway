package Two_D_Arrays;

public class _57_Upper_Trianlge_Sum {
    public static void main(String[] args) {

        int[][] A = {
                {1, 2, 3, 4},
                {5, 0, 1, 1},
                {9, 10, 11, 1},
                {13, 14, 15, 0}
        };

        int sum = 0;

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if(j>=i)
                    sum+=A[i][j];
            }
        }

        System.out.println("Upper triangle sum is : " + sum);
    }
}
