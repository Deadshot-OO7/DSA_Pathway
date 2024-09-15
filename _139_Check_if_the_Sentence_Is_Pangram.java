package StringBuilder;

public class _139_Check_if_the_Sentence_Is_Pangram {
    public static boolean main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        int[] A = new int[128];
        boolean isPangram = true;
        for(int i = 0 ; i<sentence.length();i++){
            char ch = sentence.charAt(i);
            A[ch-'\0'] = ++A[ch-'\0'];
        }

        for(int i = 97;i<=122;i++){
            if(A[i]==0){
                isPangram=false;
                break;
            }
        }

        if(isPangram)
            return true;

        return false;
    }
}
