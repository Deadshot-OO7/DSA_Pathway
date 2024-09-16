package StringBuilder;

import java.util.ArrayList;
import java.util.Arrays;

public class _142_Keyboard_Row {
    public static void main(String[] args) {
        String[] words = {"adsdf","sfd"};
        String[] rows = {"qwertyuiop","asdfghjkl","zxcvbnm"};
        boolean isContain = true;
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < words.length; i++) {
            String word = words[i].toLowerCase();

            for (int j = 0; j < rows.length; j++) {
                isContain = true;

                for (int k = 0; k < word.length(); k++) {
                    if(!rows[j].contains(""+word.charAt(k))){
                     isContain = false;
                     break;
                    }
                }
                if(isContain)
                    list.add(words[i]);
            }

        }
        String[] res = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i]= list.get(i);
        }
        System.out.println(list);
    }
}
