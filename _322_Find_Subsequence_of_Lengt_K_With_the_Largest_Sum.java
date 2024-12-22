package One_D_Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class _322_Find_Subsequence_of_Lengt_K_With_the_Largest_Sum {
    public static void main(String[] args) {
        int[] nums = {-1,-2,3,4};
        int k = 3;

        int[] ans = new int[k];

        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int n : nums){
            if(n>=0)
                pos.add(n);
            else
                neg.add(n);
        }

        if(!pos.isEmpty())
            Collections.sort(pos);

        if(!neg.isEmpty()) {
            Collections.sort(neg);
            neg.reversed();
        }

        for ( int n : neg)
            arr.add(n);


        for (int n : pos)
            arr.add(n);

        int itr = 0;
        for (int i = arr.size()-1; i >=0 ; i--) {
            ans[itr++] = arr.get(i);
            if(itr==k)
                break;
        }



    }
}
