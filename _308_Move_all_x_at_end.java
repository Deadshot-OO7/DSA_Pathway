package Recursion;

public class _308_Move_all_x_at_end {
    public static int count = 0;
    public static String str = "";
    public static void main(String[] args) {
        String s = "axbxcxdx";
        moveAllX(s,0);
    }

    public static void moveAllX(String s, int index){
        if(s.length() == index){
            while (count-->0)
                str+='x';
            System.out.println(str);
            return;
        }
        if( s.charAt(index) != 'x' ){
            str = str + s.charAt(index);
        }else
            count++;
        moveAllX(s,++index);
    }
}
