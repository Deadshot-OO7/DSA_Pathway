package Bitwise_Operators;

public class _172_Convert_lowercase_char_to_uppercase_using_Bitwise {
    public static void main(String[] args) {

        // We can do that by just turning off the 6th bit

        char ch = 'r';//97

        int bitmask = 1 << 5;
        int notBit = ~bitmask;

        System.out.println((char)(ch & notBit));

    }
}
