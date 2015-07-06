package math;

/**
 * Created by ZoeLiu on 7/5/15.
 */
public class PlusOne {

    public int[] plusOne(int[] digits) {
        if(digits==null) return null;
        int carry=1;
        StringBuilder results=new StringBuilder();

        for(int i=digits.length-1;i>=0;i--)
        {
            int temp=digits[i]+carry;
            carry=temp/2;
            results.append(temp%2);
        }
        if(carry==1)
            results.append(1);
        results.reverse();
        int[] r=new int[results.length()];
        for(int i=0;i<results.length();i++)
        {
            r[i]=results.charAt(i)-'0';
        }
        return r;
    }
}
