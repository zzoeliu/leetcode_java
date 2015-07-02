package math;

import java.util.HashSet;

/**
 * Created by ZoeLiu on 7/1/15.
 * LeetCode 217
 * Problem Description:
 * Given an array of integers, find if the array contains any duplicates. Your function should return true if any value
 * appears at least twice in the array, and it should return false if every element is distinct.
 *
 * Design:
 * Hashset
 *
 * Notes:
 * hashset,hashtable,hashmap
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet numSet=new HashSet();

        for(int item: nums)
        {
            if(!numSet.add(item))
            {
                return true;
            }
        }
        return false;
    }
}
