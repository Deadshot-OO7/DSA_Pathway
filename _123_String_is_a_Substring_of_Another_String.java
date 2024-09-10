package StringBuilder;

public class _123_String_is_a_Substring_of_Another_String {
    public static void main(String[] args) {

//        String str1 = "test", str2 = "this is a test string";
        String str1 = "hello",str2 = "hello";
        int len = str1.length();
        boolean isSubstring = false;
        if(str2.length()<str1.length()){
            System.out.println(false);
            return;
        }else if (str2.length()==str1.length() && str1.compareTo(str2)==0){
            System.out.println(true);
            return;
        }else {
            for (int i = 0; i < str2.length()-len; i++) {

                if (str1.compareTo(str2.substring(i, i + len)) == 0) {
                    isSubstring = true;
                    System.out.println(i);
                    break;
                }
            }
        }

        if(isSubstring)
            System.out.println(true);
        else
            System.out.println(false);
    }
}
