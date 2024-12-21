package One_D_Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.*;

public class _321_Distribute_Candies {
    public static void main(String[] args) {
        int[] candyType ={1,1,2,2,3,3};

        int max = candyType.length/2;

        Set<Integer> s = new HashSet<>();

        for (int n : candyType)
            s.add(n);

        if(s.size()>max)
            return max;

        return s.size();




    }
}
