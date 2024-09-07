package StringBuilder;

public class _105_Length_of_Last_Word {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("   fly me   to   the moon  ");

        sb.reverse();
        int len = 0;
        for (int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i)!=' '){
                ++len;
            } else if (len!=0 && sb.charAt(i)==' ') {
                break;
            }
        }

        System.out.println(len);

        System.out.println(sb);
    }
}
