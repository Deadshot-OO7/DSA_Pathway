package Strings;

public class _323_Number_of_Strings_That_Appear_as_Substrings_in_Word {
    public static void main(String[] args) {
        String[] patterns = {"a","abc","bc","d"};
        String word = "abc";
        int count = 0 ;

        for (String s : patterns){
            if(word.contains(s))
                count++;
        }
    }
}
