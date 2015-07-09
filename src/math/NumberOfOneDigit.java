package math;

/**
 * Created by ZoeLiu on 7/8/15.
 */
public class NumberOfOneDigit {
    public int countDigitOne(int n)
    {
        //int results=0;
        int count=0;
        for(long m=1;m<=n;m*=10)
        {
            long a=n/m;
            long b=n%m;
            count+=(a+8)/10*m;//the mth number
            if(a%10==1) count+=b+1;
        }
        return count;
    }
}
