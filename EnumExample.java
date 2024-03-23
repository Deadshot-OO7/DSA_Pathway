package Oops;

public class EnumExample {
    public static void main(String[] args) {
        whichSeason(Month.FEB);
        whichSeason(Month.MAY);
    }


    public static void whichSeason(Month month){
        switch (month){
            case JAN, FEB, MAR :
                System.out.println("Winter Season");
                break;
            case APR,MAY:
                System.out.println("Summer season");
                break;


        }
    }
}

