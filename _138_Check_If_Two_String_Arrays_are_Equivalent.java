package StringBuilder;

public class _138_Check_If_Two_String_Arrays_are_Equivalent {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"}, word2 = {"a", "bc"};

        StringBuilder sb1 = new StringBuilder("");
        StringBuilder sb2 = new StringBuilder("");


        for (int i = 0; i < word1.length; i++) {
            sb1.append(word1[i]);
        }

        for (int i = 0; i < word2.length; i++) {
            sb2.append(word2[i]);
        }

        System.out.println(sb1);
        System.out.println(sb2);

        if(sb1.compareTo(sb2)==0)
            System.out.println(true);

    }
}
