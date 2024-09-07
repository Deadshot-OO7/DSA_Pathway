package Strings;

public class _96_String_Substring {
    public static void main(String[] args) {
        String firstName = "Tony";
        String lastName = "Stark";
        String fullName = firstName +" " + lastName;

        System.out.println(fullName);
        System.out.println(fullName.substring(5,fullName.length()-1));
        System.out.println(fullName.substring(0,4));
    }
}
