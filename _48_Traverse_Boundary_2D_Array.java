package Two_D_Arrays;

public class _48_Traverse_Boundary_2D_Array {
    public static void main(String[] args) {

//        int[][] A = {{1, 2, 3, 4},
//                {5, 6, 7, 8},
//                {9, 10, 11, 12},
//                {13, 14, 15, 16}};
        int[][] A = {{1, 2, 3, 4}};

        int row_start = 0;
        int col_start = 0;
        int row_end = A.length-1;
        int col_end = A[0].length-1;

        do{

            if(A.length==1){
                for (int i = 0; i < A[0].length; i++) {
                    System.out.println(A[0][i]);
                }
                return;
            }
            if(A[0].length==1){
                for (int i = 0; i < A.length; i++) {
                    System.out.println(A[i][0]);
                }
                return;
            }

                for (int i = col_start; i <= col_end; i++) {
                    System.out.print(A[row_start][i] + " ");
                }

                row_start++;

                for (int i = row_start; i <= row_end; i++) {
                    System.out.print(A[i][col_end] + " ");
                }

                col_end--;

                for (int i = col_end; i >= col_start; i--) {
                    System.out.print(A[row_end][i] + " ");
                }

                row_end--;

                for (int i = row_end; i >= row_start; i--) {
                    System.out.print(A[i][col_start] + " ");
                }
                col_start++;

        }while(false);
    }
}
