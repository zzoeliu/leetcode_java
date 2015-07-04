package math;

/**
 * Created by ZoeLiu on 7/4/15.
 * Reverse digits of an integer.

 Example1: x = 123, return 321
 Example2: x = -123, return -321
 */
public class ReverseInteger {
    public int reverse(int x)
    {
        if(x>-10 && x<10)
            return x;

        int flag=0;

        if(x<0) flag=1;

        x=Math.abs(x);
        int digits=0;
        double result=0;
        while(x!=0)
        {
            digits=x%10;
            result=result*10+digits;
            x/=10;
        }

        if(result>Integer.MAX_VALUE || result<Integer.MIN_VALUE) return 0;
        if(flag==1) result=-result;

        return (int)result;

    }

}
