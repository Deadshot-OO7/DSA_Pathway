package Sorting;

import java.util.Arrays;

public class _231_Rank_Transform_of_an_Array_Using_2d_Array {
    public static void main(String[] args) {
        int[] arr = {37,12,28,9,100,56,80,5,12};
        int[] res = new int[arr.length];
        int[][] numWithIndices = new int[arr.length][2];

        for (int i = 0; i < arr.length; i++) {
            numWithIndices[i][0] = arr[i];
            numWithIndices[i][1] = i;
        }

        Arrays.sort(numWithIndices,(a,b)->a[0]-b[0]);
        int rank = 1;
        for(int i = 0; i < numWithIndices.length; i++){
            if(i!=0 && numWithIndices[i][0]==numWithIndices[i-1][0] )
                res[numWithIndices[i][1]] = res[numWithIndices[i-1][1]];
            else {
                res[numWithIndices[i][1]] = rank;
                rank++;
            }
        }

        for(int n :res)
            System.out.println(n);
    }
}
