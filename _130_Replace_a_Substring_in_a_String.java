package StringBuilder;

public class _130_Replace_a_Substring_in_a_String {
    public static void main(String[] args) {
        String   main_string = "the cat sat on the mat" ,to_replace = "cat" ,replacement = "dog";

        for (int i = 0; i <= main_string.length() - to_replace.length(); i++) {
            if(main_string.substring(i,i+to_replace.length()).equals(to_replace)){
                main_string = main_string.substring(0,i)+replacement+main_string.substring(i+to_replace.length());
                System.out.println(main_string);
            }
        }

    }
}
