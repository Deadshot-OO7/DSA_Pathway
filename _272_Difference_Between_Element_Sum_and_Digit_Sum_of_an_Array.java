package Sorting;

public class _272_Difference_Between_Element_Sum_and_Digit_Sum_of_an_Array {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};

        int eleSum = 0, digitSum = 0;

        for (int n : nums){
            eleSum+=n;

            while(n>0){
                digitSum+=n%10;
                n/=10;
            }
        }

        System.out.println(Math.abs(eleSum - digitSum));
    }
}
