package Strings;

import java.util.HashMap;
import java.util.HashSet;

public class _325_Unique_Morse_Code_Words {
    public static void main(String[] args) {

        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] words = {"gin","zen","gig","msg"};
        int count = 0;

        HashMap<Character,String> hm = new HashMap<>();

        System.out.println((char)(97+25));
        int itr = 0;
        for (int i = 97; i <=122 ; i++) {
            hm.put((char)i,morse[itr++]);
        }

        HashSet<String> hs = new HashSet<>();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String seq = "";
            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);
                seq+=hm.get(ch);
            }
            hs.add(seq);
        }

        System.out.println(hs.size());
    }
}
