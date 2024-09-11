package StringBuilder;

public class _128_Duplicate_Characters {
    public static void main(String[] args) {

        String s ="programming";
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < s.length(); i++) {

            if(sb.indexOf(""+s.charAt(i))>=0){
                System.out.println(s.charAt(i));
            }
            sb.append(s.charAt(i));
        }
    }
}
