package Two_D_Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class _83_Missing_Number {
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }

        int n;

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            if(i!= list.get(i))
                n=i;
        }
    }
}
