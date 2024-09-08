package StringBuilder;

public class _114_Day_of_the_Year {
    public static void main(String[] args) {

        String date = "2019-01-09";

        StringBuilder sb = new StringBuilder(date);



        System.out.println(sb.substring(8));

        int day = 0;

        if(sb.substring(8).indexOf(0)=='0'){
            day = Integer.parseInt(sb.substring(9));
        }else{
            day = Integer.parseInt(sb.substring(8));
        }

        System.out.println();
    }
}
