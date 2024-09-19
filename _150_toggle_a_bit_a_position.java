package Bitwise_Operators;

public class _150_toggle_a_bit_a_position {
    public static void main(String[] args) {
        int n = 7; // 0111
        int index = 3;

        //Get Bit
        int bitmask = 1 << index; // 0001 << 2 ==> 0100

        if((bitmask & n) == 0){
            System.out.println("Bit was 0, toggling to 1");
            // setting to 1
            System.out.println("After toggling, n would be " + (bitmask | n));
        }else {
            System.out.println("Bit was 1, toggling to 0");
            //clear operation
            int notBitmask = ~bitmask;
            System.out.println("After toggling, n would be " + (notBitmask & n));
        }
    }
}
