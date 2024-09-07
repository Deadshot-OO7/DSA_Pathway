package Strings;

public class _98_String_Substring_Ques {
    public static void main(String[] args) {
        String email = "apnaCollegeJava@gmail.com";
        String userName = "";
        int index = 0;
        for (int i = 0; i < email.length(); i++) {
            if(email.charAt(i)=='@') {
                index = i;
                break;
            }
        }

        userName = email.substring(0,index);
        System.out.println(userName);

    }
}
