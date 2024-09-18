package StringBuilder;


public class _145_Score_of_a_String {
    public static void main(String[] args) {

        String s = "zaz";

        int score = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            int temp = (s.charAt(i)-'\0') - (s.charAt(i+1)-'\0');
            if(temp>=0)
                score+=temp;
            else
                score+=(temp*-1);
        }

        System.out.println(score);
    }
}
