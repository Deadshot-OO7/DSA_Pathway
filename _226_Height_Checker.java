package Sorting;
/*A school is trying to take an annual photo of all the students. The students are asked to stand in a single file line in non-decreasing order by height. Let this ordering be represented by the integer array expected where expected[i] is the expected height of the ith student in line.

You are given an integer array heights representing the current order that the students are standing in. Each heights[i] is the height of the ith student in line (0-indexed).

Return the number of indices where heights[i] != expected[i].*/
import java.util.Arrays;

public class _226_Height_Checker {
    public static int main(String[] args) {
        int[] heights = {1,1,4,2,1,3};
        int [] expected = heights.clone();
        Arrays.sort(expected);

        int count = 0;
        for(int i =0; i< heights.length ; i++){
            if(heights[i] != expected[i]){
                count++;
            }
        }
        return count;
    }
}
