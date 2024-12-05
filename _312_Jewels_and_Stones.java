package Strings;

public class _312_Jewels_and_Stones {
    public static int main(String[] args) {
        String jewels = "aA", stones = "aAAbbbb";

        int count = 0;

        char[] arr = stones.toCharArray();

        for(int i = 0; i < jewels.length(); i++){
            for(int j = 0; j < arr.length; j++){
                if(jewels.charAt(i)==arr[j])
                    count++;
            }
        }
        return count;
    }
}
