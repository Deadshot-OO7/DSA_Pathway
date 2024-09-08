package StringBuilder;

public class _106_Valid_Anagram {
    public static boolean main(String[] args) {
        String s = "anagram", t = "nagaram";
        if(s.length() != t.length())
            return false;

        for(int i = 0; i< s.length(); i++){
            if(t.indexOf(s.charAt(i)) >= 0){
                int ind = t.indexOf(s.charAt(i));
                t = t.substring(0,ind)+t.substring(ind+1);
            }else{
                return false;
            }
        }
        return true;
    }
}
