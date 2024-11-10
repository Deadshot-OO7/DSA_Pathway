package StringBuilder;

public class _278_Faulty_Keyboard {
    public static void main(String[] args) {
        String s = "string";

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c !='i')
                sb.append(c);
            else
                sb.reverse();
        }
    }
}
