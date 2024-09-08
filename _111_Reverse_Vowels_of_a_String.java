package StringBuilder;
/*
* Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
*
* */
public class _111_Reverse_Vowels_of_a_String {
    public static void main(String[] args) {
        String s = "Marge, let's \"went.\" I await news telegram.";
    //47 //29

        StringBuilder sb = new StringBuilder(s);

        int itr=0,itrFromStart = 0;

        String vowels = "aeiouAEIOU";

        for (int i = 0; i < s.length()-itr; i++) {
            if(vowels.indexOf(sb.charAt(i))>=0){
                itrFromStart = i;
                for (int j = sb.length()-1-itr; j >=itrFromStart ; j--) {
                    itr++;
                    if(vowels.indexOf(sb.charAt(j))>=0) {
                        sb.setCharAt(i, s.charAt(j));
                        sb.setCharAt(j, s.charAt(i));
                        break;
                    }
                }
            }
        }
        System.out.println(sb);
//        return sb.toString();
    }
}
