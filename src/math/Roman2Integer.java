package math;

/**
 * Created by ZoeLiu on 7/1/15.
 * LeetCode 13 Roman to Integer
 * Given a roman numeral, convert it to an integer
 * Input is guaranteed to be within the range from 1 to 3999.
 * Diffuculty Level: 2
 * Frequency Level : 4
 * Algorithms : Math
 *
 * Design:
 * 1~3999 we need to define these letters
 * I 1
 * V 5
 * X 10
 * L 50
 * C 100
 * D 500
 * M 1000
 *
 * We could calculate if Roman[i-1]>=Roman[i] then sum+=Roman[i]
 * else sum+=Roman[i]-2*Roman[i-1]
 *
 *
 */

public class Roman2Integer {

    public int RomanInteger(String s)
    {
        int sum=0;
        if(s.length()==0)
        {
            return 0;
        }
        int former=0;
        for(int i=0;i<s.length();i++)
        {
            int temp=0;
            switch(s.charAt(i)){

                case 'I':
                    temp=1;
                    break;
                case 'V':
                    temp=5;
                    break;
                case 'X':
                    temp=10;
                    break;
                case 'L':
                    temp=50;
                    break;
                case 'C':
                    temp=100;
                    break;
                case 'D':
                    temp=500;
                    break;
                case 'M':
                    temp=1000;
                    break;
                default: System.out.println("Invalid Roman Strings. The number should be in 1..3999. Please check");

            }
            if(former >= temp) sum+=temp;
            else sum=sum+temp-2*former;
            former=temp;
        }
        return sum;
    }
}
