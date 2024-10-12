package Sorting;

import java.util.ArrayList;
import java.util.List;

public class _230_Find_Words_Containing_Character {
    public static void main(String[] args) {
        String[] words ={"abc","bcd","aaaa","cbc"};
        char x = 'a';
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) {
                res.add(i);
            }
        }
        System.out.println(res);
    }
}
