package math;

/**
 * Created by ZoeLiu on 7/4/15.
 * Given an integer n, return the number of trailing zeroes in n!.

 Note: Your solution should be in logarithmic time complexity.

Hint 1:
 1.logarithmic time means 2-division
 2.one pair of 2,5 could get a 0 in the trail, so we just need to count 2 and 5.
 cause 2 is more than 5, we just need to caculate the counts of 5,25,125... in the factors of
 n!
 so we could use for loop by factorial of 5
 */
public class FactorialTraZeroes {

    public int trailingZeros(int n)
    {
        int count=0;

        for(int i=n;i>0;i/=5)
        {
            count+=i/5;
        }
        return count;
    }
}
