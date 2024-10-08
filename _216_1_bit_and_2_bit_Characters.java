package Bitwise_Operators;
/*
* We have two special characters:

The first character can be represented by one bit 0.
The second character can be represented by two bits (10 or 11).
Given a binary array bits that ends with 0, return true if the last character must be a one-bit character.



Example 1:

Input: bits = [1,0,0]
Output: true
Explanation: The only way to decode it is two-bit character and one-bit character.
So the last character is one-bit character.
Example 2:

Input: bits = [1,1,1,0]
Output: false
Explanation: The only way to decode it is two-bit character and two-bit character.
So the last character is not one-bit character.
* */
public class _216_1_bit_and_2_bit_Characters {
    public static boolean main(String[] args) {
        int[] bits = {1,1,1,0};
        int len = bits.length;

        if(len==1 && bits[0]==0)
            return true;

        if(bits[len-1]!=0)
            return false;

        for(int i = 0; i<len;i++){
            if(bits[i]==1)
                i++;
            else if(bits[i]==0 && i==len-1)
                return true;
        }
        return false;
    }
}
