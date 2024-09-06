package Two_D_Arrays;
//Given an integer array sorted in non-decreasing order, there is exactly one integer in the array that occurs more than 25% of the time, return that integer.


import java.util.ArrayList;

public class _87_Element_Appearing_More_Than_25perc_In_Sorted_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,2,6,6,6,6,7,10};

        //1,2,2

        int maxCount = 0;
        int sameItr = 1;
        int maxNum = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(list.contains(arr[i])){
                sameItr++;
            }else{
                if(sameItr>maxCount) {
                    maxCount = sameItr;
                    maxNum = arr[i];
                }
                sameItr = 1;
            }

            list.add(arr[i]);
        }

    }
}
