package StringBuilder;

public class _282_Check_if_Numbers_Are_Ascending_in_a_Sentence {
    public static void main(String[] args) {
        String s = "1 box has 3 blue 4 red 6 green and 12 yellow marbles";
        char[] ans = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int num = 0;
        for (int i = 0; i < ans.length; i++) {
            if( Character.isDigit(ans[i]) )
                sb.append(ans[i]);
            else if (Character.isSpaceChar(ans[i])) {
                
            }


        }
        System.out.println(sb);
    }
}
