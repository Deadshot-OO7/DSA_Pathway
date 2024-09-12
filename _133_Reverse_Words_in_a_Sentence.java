package StringBuilder;

public class _133_Reverse_Words_in_a_Sentence {
    public static void main(String[] args) {

        String s =   "a good   example";

        String[] trimmed = s.split("\\s+");

        for (int i = 0; i < trimmed.length; i++) {
            System.out.println(trimmed[i]);
        }

        StringBuilder sb = new StringBuilder("");

        for (int i = trimmed.length-1; i >=0 ; i--) {
            sb.append(trimmed[i]);
            if(i!=0) sb.append(" ");
        }

        System.out.println(sb);
    }
}
