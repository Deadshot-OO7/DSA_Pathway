package Two_D_Arrays;

public class _51_Row_with_Max_Sum {
    public static void main(String[] args) {

        int[][] A = {
                {0, 2, 3},
                {5, 6, 7},
                {9, 11, 11},
                {13, 14, 15}
        };

        int max = 0, index = 0;

        for (int i = 0; i < A.length; i++) {
            int sum = 0;
            for (int j = 0; j < A[0].length; j++) {
                sum+=A[i][j];
            }
            if(sum>max){
                max = sum;
                index = i;
            }
        }

        System.out.println("The row with Maximum sum is : " + (index));
    }
}
