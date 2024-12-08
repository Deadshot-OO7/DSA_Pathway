package Strings;

import java.util.HashMap;
import java.util.Map;

public class _315_Maximum_Number_of_Balloons {
    public static void main(String[] args) {
        String text = "loonbalxballpoon";

        HashMap<Character,Integer> original = new HashMap<>();
        HashMap<Character,Integer> hm = new HashMap<>();
        String org = "balloon";

        for ( char c : org.toCharArray()){
            original.put(c,original.getOrDefault(c,0)+1);
        }

        for (char c : text.toCharArray())
            hm.put(c,hm.getOrDefault(c,0)+1);

        int minVal = Integer.MAX_VALUE;
        for (int val : hm.values())
            if(val<minVal)
                minVal = val;

        System.out.println(minVal);

        for (Map.Entry entry : original.entrySet()){
            char ch = (char) entry.getKey();
            int hmNumber = hm.get(ch); //no. of b
            int times = hmNumber/(int) entry.getValue();

            if(times>= minVal)
                continue;
            else {
                System.out.println(0);;
            }
        }


    }
}
