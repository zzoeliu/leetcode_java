package math;

import java.util.HashMap;

/**
 * Created by ZoeLiu on 7/1/15.
 * LeetCode 219
 *
 * Problem Description:
 * Given an array of integers and an integer k, find out whether there there are two distinct indices i and j in
 * the array such that nums[i] = nums[j] and the difference between i and j is at most k.
 *
 * Design:
 * we need data structure to store unique value and index pair.() value is key. hashmap<int,int> is OK
 * another question, how to caculate the gap, it should be i-hashmap.get(nums[i]). We need to traverse the whole
 * array to get the min gap, then to check if min(which is the minimus gap for all array numbers) is smaller than k.
 *
 *problem to be conseidered:
 * I wander if hashset could be used to solve this problem.no, cause set has no order , so no index.

 */
public class ContainDuplicate2 {

    public boolean ContainDulicate2(int[] nums, int k)
    {
        HashMap<Integer,Integer> countHash=new HashMap<Integer, Integer>();
        int min=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++)
        {
            if(countHash.containsKey(nums[i]))
            {
                int index=countHash.get(nums[i]);
                int gap=i-index;
                min=Math.min(min,gap);
            }
            countHash.put(nums[i],i);//replace previous value with same key.
        }

        if(min<=k)
            return true;
        else return false;
    }

}
