package Sorting;

import java.util.ArrayList;

public class _274_Alternating_Digit_Sum {
    public static void main(String[] args) {
        int n = 886996;
        ArrayList<Integer> list = new ArrayList<>();

        while(n>0){
            list.add(n%10);
            n/=10;
        }
        list.reversed();
        int pos = 0, neg = 0;

        int i = 0;

        while(!list.isEmpty()){
            if(i%2==0){
                pos+=list.getLast();
            }else{
                neg+=list.getLast();
            }
            i++;
            list.removeLast();
        }

    }
}
