package Two_D_Arrays;

import java.util.ArrayList;

public class _56_Matrix_Zero_Transformation {
    public static void main(String[] args) {

        int[][] A = {
                {1, 2, 3, 4},
                {5, 0, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 0}
        };

        ArrayList<Integer> zero_i = new ArrayList<>();
        ArrayList<Integer> zero_j = new ArrayList<>();

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if(A[i][j]==0){
                    zero_j.add(j);
                    zero_i.add(i);
                }
            }
        }

        for (int i = 0; i < zero_i.size(); i++) {
            for (int j = 0; j < A[0].length; j++) {
                A[zero_i.get(i)][j]=0;
            }
        }

        //Transforming cols to zero;

        for (int i = 0; i < zero_j.size(); i++) {
            for (int j = 0; j < A.length; j++) {
                A[j][zero_j.get(i)]=0;
            }
        }

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }


    }
}
