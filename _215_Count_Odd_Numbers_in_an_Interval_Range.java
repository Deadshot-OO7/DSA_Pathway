package Bitwise_Operators;

public class _215_Count_Odd_Numbers_in_an_Interval_Range {
    public static int main(String[] args) {
        int low = 3, high = 7;
        if(low%2==0 && high%2==0){
            return (high-low)/2;
        }else{
            return (high-low)/2+1;
        }

    }
}
