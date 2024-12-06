package Strings;

public class _313_Buddy_Strings {
    public static void main(String[] args) {
        String s = "ab", goal = "ba";
        char[] sArr = s.toCharArray();
        char[] goalArr = goal.toCharArray();

        for (int i = 0; i < sArr.length-1; i++) {
            for (int j = i+1; j < goalArr.length; j++) {
                String swapped = s.substring(0,i) + s.charAt(j) + s.substring(i+1,j) + s.charAt(i) + s.substring(j+1);
                if(swapped.equals(goal)){
                    System.out.println(true);
                    return;
                }
            }
            System.out.println(false);
        }
    }
}
