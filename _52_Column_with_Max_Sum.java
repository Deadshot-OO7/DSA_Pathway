package Two_D_Arrays;

public class _52_Column_with_Max_Sum {
    public static void main(String[] args) {

        int[][] A = {
                {0, 2, 3},
                {5, 6, 7},
                {9, 11, 11},
                {113, 14, 15}
        };

        int max = 0, index = 0;

        for (int i = 0; i < A[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < A.length; j++) {
                sum+=A[j][i];
            }
            if(sum>max){
                max = sum;
                index = i;
            }
        }

        System.out.println("The column with Maximum sum is : " + (index));
    }
}
