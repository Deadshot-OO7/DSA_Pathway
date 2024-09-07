package StringBuilder;

public class _101_SB_Insert {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");

        sb.insert(sb.length()-1,'S');

        System.out.println(sb);
    } 
}
