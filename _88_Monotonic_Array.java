package Two_D_Arrays;

import java.util.Arrays;

/*
* An array is monotonic if it is either monotone increasing or monotone decreasing.
*
* Example 1:

Input: nums = [1,2,2,3]
Output: true
Example 2:

Input: nums = [6,5,4,4]
Output: true
Example 3:

Input: nums = [1,3,2]
Output: false
*
*
* */
public class _88_Monotonic_Array {
    public static boolean main(String[] args) {
        int[] A = {1,2,2,3};
        boolean isInc = (A[A.length-1]-A[0])>=0; //true

        for(int i = 0 ; i< A.length-1; i++){
            if( isInc){
                if(A[i+1]<A[i])
                    return false;
            }
            else{
                if(A[i+1]>A[i])
                    return false;
            }
        }
        return true;
    }
}
