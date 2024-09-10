package StringBuilder;

public class _122_Count_the_Occurrence_of_a_Character_in_a_String {
    public static void main(String[] args) {
        String s = "My name is Tony Stara";
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < s.length()-1; i++) {
            int count = 0;
            if(sb.indexOf(""+s.charAt(i))<0)
            {
                for (int j = i+1; j < s.length(); j++) {
                    if(s.charAt(i) == s.charAt(j))
                        count++;
                }
                System.out.println(s.charAt(i) + " is " + count + " times");
                sb.append(s.charAt(i));
            }

        }
        if(sb.indexOf(""+s.charAt(s.length()-1))<0)
            System.out.println(s.charAt(s.length()-1) + " is " + 0 + " times");

    }
}
