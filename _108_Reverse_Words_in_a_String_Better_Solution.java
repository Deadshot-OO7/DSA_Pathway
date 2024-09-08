package StringBuilder;

public class _108_Reverse_Words_in_a_String_Better_Solution {
    public static String main(String[] args) {
        String s = "Let's take LeetCode contest";
        String arr[] = s.split(" ");

        int n = arr.length;

        StringBuilder ans = new StringBuilder("");

        for(int i=0; i<n; i++){
            StringBuilder x = new StringBuilder(arr[i]);
            ans.append(x.reverse());

            if(i!=n-1) ans.append(" ");
        }
        return ans.toString();
    }
}
