package StringBuilder;

import java.util.HashMap;

public class _127_Isomorphic_Strings {
    public static boolean main(String[] args) {
        String  s = "bbbaaaba", t = "aaabbbba";

        if(s.length()!=t.length())
            System.out.println(false);

        HashMap<Character, Character>hm = new HashMap<Character, Character>();

        for (int i = 0; i < s.length(); i++) {

            if(hm.containsKey(s.charAt(i))){
                if(hm.get(s.charAt(i))!=t.charAt(i))
                    return false;
            }else{
                if(hm.containsValue(t.charAt(i)))
                    return false;
                hm.put(s.charAt(i),t.charAt(i));
            }
        }
        return true;
    }
}
