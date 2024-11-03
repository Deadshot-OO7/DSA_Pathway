package StringBuilder;

public class _268_Circular_Sentence {
    public static void main(String[] args) {
        String sentence = "leetcode exercises sound delightful";
        sentence = sentence.trim();
        int len = sentence.length();

        if(sentence.charAt(0)!=sentence.charAt(len-1))
            System.out.println(false);

        String[] arr = sentence.split(" ");

        for (int i = 0; i < arr.length-1; i++) {
            int lastIndex = arr[i].length();
            if(arr[i].charAt(lastIndex-1)!=arr[i+1].charAt(0))
                System.out.println(false);
        }
        System.out.println(true);
    }
}
