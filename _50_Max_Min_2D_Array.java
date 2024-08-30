package Two_D_Arrays;

public class _50_Max_Min_2D_Array {
    public static void main(String[] args) {

        int[][] A = {
                {0, 2, 3},
                {5, 6, 7},
                {9, 111, 11},
                {13, 14, 15}
        };

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {

                if( A[i][j]>max)
                    max = A[i][j];

                if(A[i][j]<min)
                    min = A[i][j];
            }
        }

        System.out.println("Min : " + min);
        System.out.println("Max : " + max);
    }
}
