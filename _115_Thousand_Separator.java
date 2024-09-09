package StringBuilder;

public class _115_Thousand_Separator {
    public static void main(String[] args) {
        int n = 234;

        StringBuilder sb = new StringBuilder(n+"");
        int len = sb.length()-1;
        StringBuilder res = new StringBuilder("");

        int itr=0;

        for (int i = len; i >=0 ; i--) {
            if(itr%3==0 && itr!=0){
                res.append(".");
                res.append(sb.charAt(i));
                itr=0;
            }else{
                res.append(sb.charAt(i));
            }
            itr++;
        }

        System.out.println(res.reverse()+"");

    }
}
