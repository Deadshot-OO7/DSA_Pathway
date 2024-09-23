package Bitwise_Operators;

import java.util.ArrayList;

public class _167_Find_the_only_non_repeating_element_in_an_array {
    public static void main(String[] args){
        int[] arr = {2, 3, 2, 9,9, 5, 4, 5, 3, 4,1};

        ArrayList <Integer> list = new ArrayList<>();

        for(int i = 0; i<arr.length;i++){
            if(list.contains(arr[i])){
                list.remove(list.indexOf(arr[i]));
            }else{
                list.add(arr[i]);
            }
        }

        System.out.println(list.get(0));
    }
}
