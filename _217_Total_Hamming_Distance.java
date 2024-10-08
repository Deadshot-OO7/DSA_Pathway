package Bitwise_Operators;

public class _217_Total_Hamming_Distance {
    public static void main(String[] args) {
        int[] nums = {4,14,2};
        int totalHammingDistance = 0;
        int len = nums.length;

        // Loop through each bit position (0 to 31 for 32-bit integers)
        for (int bit = 0; bit < 32; bit++) {
            int countOnes = 0;

            // Count how many numbers have a 1 in the current bit position
            for (int num : nums) {
                if ((num & (1 << bit)) != 0) {
                    countOnes++;
                }
            }

            // countZeros is the remaining numbers with 0 in the current bit position
            int countZeros = len - countOnes;

            // The contribution of this bit position to the total Hamming distance
            totalHammingDistance += countOnes * countZeros;
        }

        System.out.println(totalHammingDistance);
    }
}
