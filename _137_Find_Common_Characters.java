package StringBuilder;

import java.util.ArrayList;

public class _137_Find_Common_Characters {
    public static void main(String[] args) {
        String[] words = {"bella","label","roller"};

        ArrayList<String> op = new ArrayList<String>();

//        int index = words[1].indexOf("l");

        for (int i = 0; i < words[0].length(); i++) {
            char ch = words[0].charAt(i);
            int index = 0;
            boolean isPresentInAll = true;
            for (int j = 1; j < words.length; j++) {

                index = words[j].indexOf(ch);
                if(index<0){
                    isPresentInAll = false;
                    break;
                }

            }
            if(isPresentInAll){
                for (int j = 1; j < words.length; j++) {
                    index = words[j].indexOf(ch);
                    words[j] = words[j].substring(0,index)+words[j].substring(index+1);
                }
                op.add(""+ch);
            }
        }
        System.out.println(op);

        String[] result = new String[op.size()];

        for (int i = 0; i < op.size(); i++) {
            result[i]= op.get(i);
        }


    }
}
