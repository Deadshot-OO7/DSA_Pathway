package Sorting;

import java.util.ArrayList;

public class _275_Separate_the_Digits_in_an_Array {
    public static void main(String[] args) {
        int[] nums = {13,25,83,77};

        ArrayList<Integer> listAll = new ArrayList<>();

        for (int n : nums){
            ArrayList<Integer> list = new ArrayList<>();
            while(n>0){
                list.add(n%10);
                n/=10;
            }
            listAll.addAll(list.reversed());
        }
        System.out.println(listAll);
        int[] arr = new int[listAll.size()];

        for (int i = 0; i < listAll.size(); i++) {
            arr[i] = listAll.get(i);
        }

    }
}
