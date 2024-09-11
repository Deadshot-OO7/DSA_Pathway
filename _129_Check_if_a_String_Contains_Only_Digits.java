package StringBuilder;

public class _129_Check_if_a_String_Contains_Only_Digits {
    public static void main(String[] args) {

        String s ="534s52";
        boolean isAllNum = true;
        for (int i = 0; i < s.length(); i++) {

            if(s.charAt(i)<48 || s.charAt(i)>57){
                System.out.println(false);
                isAllNum = false;

            }
        }
        if(isAllNum)
            System.out.println(true);
    }
}
