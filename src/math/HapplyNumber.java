package math;

import java.util.HashSet;

/**
 * Created by ZoeLiu on 7/4/15.
 * Write an algorithm to determine if a number is "happy".

 A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

 Example: 19 is a happy number

 12 + 92 = 82
 82 + 22 = 68
 62 + 82 = 100
 12 + 02 + 02 = 1

 */
public class HapplyNumber {
    public boolean isHappy(int n)
    {
 /*   Exceed time limits.cause  maybe the recurrence of number is not n but another number, so it will not end if we
 repeat the middle numbers instead of the first number. We need to use a structure to hold all numbers which have appeared
     if(n==0) return false;

        int cur=n;
        while(cur!=1)
        {
            int digits=0;
            int sum=0;
            while(cur>=10)
            {
                digits=cur%10;
                cur/=10;
                sum+=Math.pow(digits,2);
            }
            sum+=Math.pow(cur,2);
            cur=sum;
            if(cur==n)
                return false;
        }
        return true;*/
        HashSet<Integer> container=new HashSet<Integer>();
        if(n==0) return false;
        int cur=n;
        while(cur!=1)
        {
            int digits=0;
            int sum=0;
            while(cur>=10)
            {
                digits=cur%10;
                cur/=10;
                sum+=Math.pow(digits,2);
            }
            sum+=Math.pow(cur,2);
            cur=sum;
            if(container.add(cur)==false)
                return false;
        }
        return true;

    }
}
