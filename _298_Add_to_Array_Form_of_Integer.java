package Two_D_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
//

public class _298_Add_to_Array_Form_of_Integer {
    public static void main(String[] args) {
        int[] num = {9,9,9,9,9,9,9,9,9,9};
        int k = 1;
        long res = 0, inc = 1;
        for (int i = num.length-1; i >=0 ; i--) {
            res = res + num[i] * inc;
            inc*=10;
        }
        long sum = res + k;
        System.out.println(sum);

        ArrayList<Long> ls = new ArrayList<>();

        while(sum>0){
            ls.add( sum%10);
            System.out.println(ls);
            sum/=10;
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < ls.size(); i++) {
            list.add(Math.toIntExact(ls.get(i)));
        }
        System.out.println(list.reversed());
    }
}
