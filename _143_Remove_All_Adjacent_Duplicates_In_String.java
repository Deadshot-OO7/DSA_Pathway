package StringBuilder;

import java.util.ArrayList;

public class _143_Remove_All_Adjacent_Duplicates_In_String {
    public static void main(String[] args) {
        String s = "azxxzy";

        ArrayList<Character> list = new ArrayList<Character>();

        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }

        for (int i = 0; i < list.size()-1; i++) {
            if(list.get(i)==list.get(i+1)){
                System.out.println(list);
                list.remove(i);
                System.out.println(list);
                list.remove(i);
                System.out.println(list);
                i=-1;
            }
        }

        String sr = "";
        for (int i = 0; i < list.size(); i++) {
            sr+=list.get(i);
        }
        System.out.println(sr);
    }
}
