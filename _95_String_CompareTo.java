package Strings;

public class _95_String_CompareTo {
    public static void main(String[] args) {
        String firstName = "Tony";
        String lastName = "Stark";
        String fullName = firstName +" " + lastName;

        /*
        * s1>s2 --> return positive number
        * s1=s2 --> return 0
        * s1<s2 --> return negative number
        * */

        System.out.println(firstName.compareTo(lastName));
        //returned positive number --> T > S 
    }
}
