package StringBuilder;

public class _283_Reverse_String_II {
    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        StringBuilder sb = new StringBuilder();

//        sb.reverse()+sb.substring(sb.length()-1)

        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
        }

    }
}
