package StringBuilder;

public class _117_Palindrome {
    public static void main(String[] args) {

        String s = "NabaaaN";
        boolean isPalin = true;
        for (int i = 0; i < s.length() / 2; i++) {
            if(s.charAt(i)!=s.charAt(s.length()-1-i)) {
                System.out.println(false);
                isPalin= false;
            }
        }

        if(isPalin)
            System.out.println(true);
    }
}
