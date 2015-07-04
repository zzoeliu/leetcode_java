package dp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by ZoeLiu on 7/4/15.
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money
 * stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system
 * connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

 Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount
 of money you can rob tonight without alerting the police.

 Design:
 this is a typical dynamic programming problem.
 the solution of n size problem could be achieved by
 f(n)=max(f(n-1),f(n-2)+nums[n-1])
 */
public class HouseRobber {

    public int rob(int[] nums)
    {
        if(nums.length==0 || nums==null) return 0;
        int n=nums.length;

        int[] container=new int[n+1];

        container[0]=0;
        container[1]=nums[0];

        for(int i=2;i<n+1;i++)
        {
            container[i]=Math.max(container[i-1],container[i-2])+nums[i-1];
        }
        return container[n];

    }
}
