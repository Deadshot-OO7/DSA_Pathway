package StringBuilder;

public class _104_Resverse_String {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Tony Stark");

        StringBuilder rev = new StringBuilder("");

        for (int i = sb.length()-1; i >=0 ; i--) {
            rev.append(sb.charAt(i));
        }

        //Using Reverse Function
        System.out.println(rev);
        System.out.println(rev.reverse());
    }
}
