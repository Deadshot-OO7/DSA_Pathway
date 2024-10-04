package Bitwise_Operators;

public class _203_Find_the_K_th_Character_in_String_Game_I {
    public static void main(String[] args) {
        int k = 5;

        String word = "a";

        StringBuilder sb = new StringBuilder(word);
//        sb.append(word);

        while (sb.length()<=5){
            StringBuilder sb2 = new StringBuilder("");
            for (int i = 0; i < sb.length(); i++) {
                int ch = sb.charAt(i)+1;
                sb2.append((char)ch);
            }
            sb.append(sb2);
            System.out.println(sb);
            System.out.println(sb.length());
        }

        System.out.println(sb.charAt(k-1));

    }
}
