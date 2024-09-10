package StringBuilder;

public class _121_Remove_All_White_Spaces_from_a_String {
    public static void main(String[] args) {

        String s = "My name is Tony Stark";
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!=' ')
                sb.append(s.charAt(i));
        }

        System.out.println(sb);
    }
}
