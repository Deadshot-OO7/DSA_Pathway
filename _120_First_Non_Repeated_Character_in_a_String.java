package StringBuilder;

public class _120_First_Non_Repeated_Character_in_a_String {
    public static void main(String[] args) {
        String s = "My nameisTony Stark";
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < s.length(); i++) {

            if(sb.indexOf(""+s.charAt(i))>=0){
                break;
            }
            sb.append(s.charAt(i));
        }

        System.out.println(sb);
    }
}
/*
* Stringbuilder doesnt have containsOf() function so if you want to use it
* then use indexOf(charAt)>=0...
*
* */