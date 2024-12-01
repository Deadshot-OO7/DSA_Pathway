package Recursion;

public class _306_First_and_last_occurence {
    public static int first = -1;
    public static int last = -1;
    public static void main(String[] args) {
        String str = "sndlknsdkncsdnclk";
        char ch = 'k';
        System.out.println(str.length());

        findOccurence(str,ch,0);

    }

    public static void findOccurence( String str, char ch, int index){
        if(str.length() == index){
            System.out.println(first);
            System.out.println(last);
            return;
        }

        if(str.charAt(index) == ch){
            if(first == -1)
                first = index;
            else
                last = index;
        }

        findOccurence(str,ch,index+1);
    }
}
