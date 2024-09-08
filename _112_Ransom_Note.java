package StringBuilder;
/*
* Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.

Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true
* */
public class _112_Ransom_Note {
    public static void main(String[] args) {
        String ransomNote = "aa", magazine = "aab";

        StringBuilder sb = new StringBuilder(magazine);

        System.out.println();

        for (int i = 0; i < ransomNote.length(); i++) {
            int index = sb.indexOf((ransomNote.charAt(i))+"");
            if(index>=0){
                sb=new StringBuilder( sb.substring(0, index) + sb.substring(index + 1));
            }
        }
    }
}
