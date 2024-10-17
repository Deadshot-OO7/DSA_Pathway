package Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class _237_Largest_Number_After_Digit_Swaps_by_Parity {
    public static void main(String[] args) {
        int num = 65875;
        String s = Integer.toString(num);

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if(((int)(s.charAt(i))%2)==0){  //evens
//                System.out.println(s.charAt(i));
                even.add((int)(s.charAt(i)));
            }else{                         //odds
                odd.add((int)(s.charAt(i)));
            }
        }
        Collections.sort(even);
        Collections.sort(odd);

        System.out.println(even);
        System.out.println(odd);
    }
}
