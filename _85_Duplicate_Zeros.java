package Two_D_Arrays;

import java.util.ArrayList;

public class _85_Duplicate_Zeros {
    public static void main(String[] args) {

        int[] arr = {1,0,2,3,0,4,5,0};
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] == 0){
                list.add(arr[i]);
            }
            list.add(arr[i]);

        }

        int[] A = new int[list.size()];

        for (int i = 0; i < A.length; i++) {
            A[i] = list.get(i);
        }
    }
}
