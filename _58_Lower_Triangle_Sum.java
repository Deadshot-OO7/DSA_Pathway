package Two_D_Arrays;

public class _58_Lower_Triangle_Sum {
    public static void main(String[] args) {

        int[][] A = {
                {1, 2, 3, 4},
                {1, 0, 1, 1},
                {1, 11, 11, 1},
                {1, 1, 1, 0}
        };

        int sum = 0;

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if(j<=i)
                    sum+=A[i][j];
            }
        }

        System.out.println("Lower triangle sum is : " + sum);
    }
}
