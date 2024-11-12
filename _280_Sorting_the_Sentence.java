package StringBuilder;

public class _280_Sorting_the_Sentence {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        String[] arr = s.split(" ");
        String[] ans = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int index = arr[i].charAt(arr[i].length()-1)-'0';
            StringBuilder sb = new StringBuilder(arr[i]);
            sb = new StringBuilder(sb.substring(0,sb.length()-1));
            ans[index-1]=""+sb;
        }
        String answer = "";
        for (String sa : ans)
            answer+= sa+" ";

        answer.trim();

    }
}
