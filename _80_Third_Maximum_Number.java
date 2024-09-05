package Two_D_Arrays;

import java.util.TreeSet;

/*
* Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.

Example 1:

Input: nums = [3,2,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2.
The third distinct maximum is 1.
Example 2:

Input: nums = [1,2]
Output: 2
Explanation:
The first distinct maximum is 2.
The second distinct maximum is 1.
The third distinct maximum does not exist, so the maximum (2) is returned instead.
Example 3:

Input: nums = [2,2,3,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2 (both 2's are counted together since they have the same value).
The third distinct maximum is 1.
*
*
* WHY WE NEEDED TREESET HERE :-
*
* Using a TreeSet for this problem is beneficial because it automatically handles duplicates and keeps the elements sorted. Here’s how TreeSet can simplify finding the third distinct maximum number:

Automatic Sorting: A TreeSet stores elements in a sorted order. This means that once you add all the elements from the array to the TreeSet, the highest elements are naturally at the end of the set.

Handling Duplicates: A TreeSet does not allow duplicate values. This ensures that only distinct elements are stored, which is crucial for this problem since you need to find distinct maximum numbers.

Efficient Operations: TreeSet provides efficient methods like last() and pollLast() to get or remove the highest elements.
* */
public class _80_Third_Maximum_Number {
    public static void main(String[] args) {

        int[] nums = {2,2,3,1};

        TreeSet<Integer> treeSet = new TreeSet<>();
        for(int n : nums)
            treeSet.add(n);

        int maxFirst = treeSet.pollLast();//removed first max and get it

        if(!treeSet.isEmpty()){
            treeSet.pollLast(); //removed second max
        }
        if(!treeSet.isEmpty())
            maxFirst = treeSet.last();

        System.out.println(maxFirst);


    }
}
