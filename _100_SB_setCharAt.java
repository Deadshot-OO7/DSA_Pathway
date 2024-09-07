package StringBuilder;

public class _100_SB_setCharAt {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");

        System.out.println(sb.charAt(0));

        sb.setCharAt(0,'P');

        System.out.println(sb);
    }
}
