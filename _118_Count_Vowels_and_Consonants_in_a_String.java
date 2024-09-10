package StringBuilder;

public class _118_Count_Vowels_and_Consonants_in_a_String {
    public static void main(String[] args) {
        String s = " My name is Tony Stark";

        String v = "aeiouAEIOU";
        int vowel = 0, conso = 0;
        for (int i = 0; i < s.length(); i++) {
            //Allowing only Alphabets
            if((s.charAt(i)>=65 && s.charAt(i)<=90) || (s.charAt(i)>=97 && s.charAt(i)<=122))
            {
                if(v.contains(""+s.charAt(i)))
                    vowel++;
                else{
                    conso++;
                }
            }
        }
        System.out.println(vowel);
        System.out.println(conso);
    }
}
