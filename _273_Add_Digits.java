package Sorting;

public class _273_Add_Digits {
    public static int main(String[] args) {
        int num = 38;
        int add = 0;

        while(num>9){
            while(num>0){
                add+=num%10;
                num/=10;
            }
            num=add;
            add=0;
        }

        return num;
    }
}
