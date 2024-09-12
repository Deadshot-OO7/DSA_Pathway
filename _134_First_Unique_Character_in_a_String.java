package StringBuilder;

import java.util.Hashtable;
import java.util.Map;

public class _134_First_Unique_Character_in_a_String {
    public static void main(String[] args) {
        String s = "eeltcode";
        int count = 0;
        Hashtable<Character,Integer> ht = new Hashtable<Character,Integer>();

        for (int i = 0; i < s.length()-1; i++) {
            count = 1;
            for (int j = i+1; j <s.length() ; j++) {
                if(s.charAt(i)==s.charAt(j))
                    ht.put(s.charAt(i),++count);
            }
            if(count == 1)
                ht.put(s.charAt(i),count);
        }

        if(!ht.containsKey(s.charAt(s.length()-1))){
            ht.put(s.charAt(s.length()-1),1);
        }

        System.out.println(ht);

        for (Map.Entry<Character,Integer> entry : ht.entrySet()) {
            if (entry.getValue().equals(1)) {
                System.out.println(entry.getKey());
                break;
            }
        }

    }
}
