package Two_D_Arrays;

//Saddle point - an element that is the minimum in its row and maximum in its column
public class _54_Saddle_Point_2D_Array {
    public static void main(String[] args) {
        int[][] A = {
                {3, 8, 4},
                {1, 9, 11},
                {12, 7, 6}
        };

        boolean isSaddleFound = false;

        for (int i = 0; i < A.length; i++) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int col_index = 0;
            for (int j = 0; j < A[0].length; j++) {

                if(A[i][j]<min) {
                    min = A[i][j];
                    col_index = j;
                }

            }
            for (int k = 0; k < A[0].length; k++) {
                if(A[k][col_index]>max)
                    max = A[k][col_index];
            }

            if(A[i][col_index] == min && A[i][col_index]==max) {
                System.out.println(A[i][col_index] + " is the saddle point");
                isSaddleFound = true;
            }
        }
        if(!isSaddleFound)
            System.out.println("Not found any saddle point");
    }
}
