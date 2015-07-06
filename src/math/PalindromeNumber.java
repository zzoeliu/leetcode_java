package math;

/**
 * Created by ZoeLiu on 7/5/15.
 * Determine whether an integer is a palindrome. Do this without extra space.
 * * Diffuculty Level: 2
 * Frequency Level : 2
 * Algorithms : Math
 */
public class PalindromeNumber {

    public boolean isPalindrome(int x)
    {
        if(x<0) return false;
        else if(x<10) return true;
        int a=0,b=0;
        String num=Integer.toString(x);

        int length=num.length();

        for(int i=0;i<length/2;i++)
        {
            if(num.charAt(i)!=num.charAt(num.length()-i-1))
            {
                return false;
            }
        }
        return true;
    }
}
