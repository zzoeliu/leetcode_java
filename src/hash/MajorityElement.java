package hash;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by ZoeLiu on 7/4/15.
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

 You may assume that the array is non-empty and the majority element always exist in the array.
 */
public class MajorityElement {

    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> container=new HashMap<Integer,Integer>();
        if(nums.length==1) return nums[0];
        int majority=0;

        for(int i=0;i<nums.length;i++)
        {
            if(container.containsKey(nums[i]))
            {
                int val=container.get(nums[i]);
                container.remove(nums[i]);
                container.put(nums[i],val+1);
            }else
                container.put(nums[i],1);
        }
        Iterator<Integer> iter=container.keySet().iterator();
        while(iter.hasNext())
        {
            int key=iter.next();
            int value=container.get(key);
            if(value>nums.length/2)
                majority=key;
        }
        return majority;
    }
}
